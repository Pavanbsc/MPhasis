<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<html>
<body>

<t:productCard 
    productId="1"
    name="Headphones"
    price="3500"
    imageUrl=""
    description="Good sound"
    discount="20"
/>

<t:productCard 
    productId="2"
    name="Smart Watch"
    price="2000"
    imageUrl="images/watch.jpg"
    description="Tracks fitness"
/>

<t:productCard 
    productId="3"
    name="Speaker"
    price="800"
    imageUrl="images/speaker.jpg"
    description="Portable music"
    showAddToCart="false"
/>

</body>
</html>