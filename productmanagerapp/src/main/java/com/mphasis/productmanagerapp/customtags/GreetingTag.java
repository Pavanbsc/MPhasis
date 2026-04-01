package com.mphasis.productmanagerapp.customtags;

import java.io.IOException;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import jakarta.servlet.jsp.JspWriter;

public class GreetingTag extends SimpleTagSupport {

    private String name;
    private String timeOfDay;

    public void setName(String name) { this.name = name; }
    public void setTimeOfDay(String timeOfDay) { this.timeOfDay = timeOfDay; }

    @Override
    public void doTag() throws JspException, IOException {
        if (name == null || name.trim().isEmpty()) {
            throw new JspException("The 'name' attribute is required for <my:greet>.");
        }
        JspWriter out = getJspContext().getOut();
        String t = (timeOfDay == null) ? "" : timeOfDay.trim().toLowerCase();

        String greeting;
        switch (t) {
            case "morning":   greeting = "Good morning, " + name + "!"; break;
            case "afternoon": greeting = "Good afternoon, " + name + "!"; break;
            case "evening":   greeting = "Good evening, " + name + "!"; break;
            default:          greeting = "Hello, " + name + "!"; break;
        }
        out.write(greeting);
    }
}
