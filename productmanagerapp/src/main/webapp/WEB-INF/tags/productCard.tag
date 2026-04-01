<%@ tag pageEncoding="UTF-8" %>
<%@ attribute name="productId" required="true" %>
<%@ attribute name="name" required="true" %>
<%@ attribute name="price" required="true" %>
<%@ attribute name="imageUrl" %>
<%@ attribute name="description" %>
<%@ attribute name="discount" %>
<%@ attribute name="showAddToCart" %>

<%
    String img = (imageUrl == null) ? "no-image.jpg" : imageUrl;
    double p = Double.parseDouble(price.toString());
    int d = (discount == null) ? 0 : Integer.parseInt(discount.toString());
    double finalPrice = p - (p * d / 100.0);
    boolean showBtn = (showAddToCart == null) ? true : Boolean.parseBoolean(showAddToCart.toString());
%>

<div style="border:1px solid black;padding:10px;width:200px;margin:10px;">
    
    <% if (d >= 20) { %>
        <div style="color:red;font-weight:bold;">SALE!</div>
    <% } %>

    <div>
        <%= img %>
    </div>

    <h3><%= name %></h3>

    <% if (d > 0) { %>
        <div>
            <span style="text-decoration:line-through;">$<%= p %></span>
            <span style="color:green;">$<%= String.format("%.2f", finalPrice) %></span>
        </div>
    <% } else { %>
        <div>$<%= p %></div>
    <% } %>

    <% if (showBtn) { %>
        <button>Add to Cart</button>
    <% } %>

    <div><%= (description == null ? "" : description) %></div>
</div>