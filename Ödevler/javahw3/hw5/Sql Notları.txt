--SELECT : seç demektir, en çok kullanılan sorgulardan biridir. Yani bir veri kaynağındaki datayı çelmek için kullanılan yapıdır 
--SELECT * FROM Customers :  * tüm kolonları demektir from hangi tablodan demektir, Execute tuşuna basıldığında verinin tamamını listeleriz
-- SQL editörlerinde yorum satırı geçer 
--SQL Case insensitive yani büyük küçük harf duyarsız 
--çalıştıracağın sorguyu seçmeyi unutma 

--Select
Select ContactName,CompanyName,City from Customers --Seçip çalıştırdığımızda 3 kolonu getirmiş olur 
--bellekte fake bir tablo oluşturuyor ve bize gösteriyor, array gibi bir liste oluşturur 

Select ContactName Adi, CompanyName SirketAdi, City Sehir from Customers --buna alyans deniliyor  her birini yanındaki gibi getir demek oluyor 

--Filtreleme sorgusu
Select * from Customer where City = 'London' --bunu yazdığımız zaman şehri Londra olanları getir, where koşul demek
--Tüm müşterileri tüm kolon larıyla getir ama Londra olanları 

Select * from Products categoryId = 1 or categoryId = 3 
--ürünler tablosunu tüm kolonlarıyla getirir categoryId = 1 yada categoryId = 3 olan  

Select * from Products categoryId = 1 and UnitPrice>=10
categoryId = 1 olan ve UnitPRice 10'a eşit yada büyük olan 
Select * from Products categoryId = 1 and UnitPrice<>10
categoryId = 1 olan ve UnitPRice 10'a eşit olmayan

select * from Products order by ProductName  --order by sırala demektir, burada bütün ürünleri seç ürün ismine göre sırala demektir 

select * from Products order by CategoryID,ProductName -- categoryID ye göre ve o categoryID ler arasında isme göre sırala demektir 
sıralamayı değiştirebilirim istersem 

select * from Products order by UnitPrice asc -- fiyatlarına göre sıralar, asc ascending demek ascending artan anlamına gelir vermesek de olur 
--fiyat azalan hali için desc kullanırsın descending den gelir 

select * from Products where categoryId=1 order by UnitPrice desc -- categoryID=1 olanları filtrele onları fiyatı azalan olarak getir 

select count(*) from Products --bunu seçip çalıştırdığımızda tüm satırları sayıp sayısını verir bütün product tablosunda kaç data var onu söyler 
--bunu çalıştırdığımızda tek bir kolon ve tek bir satır gelmesi gerekiyor 

select count(*),productName from Products --böyle bir hareket yaparsan hata alırsın ama
select count(*) from Products where CategoryID = 2 --dersen bu çalışır, 2 numaralı kategoride kaç ürünümüz var demektir
--ek bir bilgi olarak alyansı burada da kullanabiliriz yani 
select count(*) Adet from Products where CategoryID = 2

--Group By
--yönetim hangi kategoride kaç farklı ürünümüz var derse 

select categoryID from products group by CategoryID --bütün categoryID'leri tekrar etmeyecek bir şekilde bana listele demektir bu 
--datamızı tamamen group by ifadesindekine göre verdik 
--biz bir group by yaptığımız zaman her bir grup için tablo oluşturulduğunu düşünebiliriz

select categoryID,count(*) from products group by CategoryID --count(*) diyebiliriz
--buda her CategoryID için kaç ürün bulunduğunu gösterir bize 
--burada yazdığımız count group by olduğu için her kategori için ayrı ayrı hesaplama yapar

--iki kolona birden de group by yapabiliriz
select categoryID,count(*) from products group by CategoryID, --, koyup ikinci kolonu yazabiliriz

--bize ürün sayısı 10'dan az olan kategorileri listele dediklerinde 
select categoryID,count(*) from products group by CategoryID having count(*)<10 

--ama biz datayı filtrelemek istersek
select categoryID,count(*) from products where unitPrice>20 group by CategoryID having count(*)<10 
--where her zaman önce çalışır 
--bu birim fiyatı 20 den fazla olan ürünleri categoryID ye göre grupla yani önce verimizi filtrele, o gruptanda 10 dan az olanları getir

--Join 
--birleştirmek demek tabloları biraraya getirmek demek 

select * from Products inner join Categories --buradaki from sadece Products değil hem Products hem Categories biraraya getirilmiş şekli anlamına geliyor 
--peki biz bunu neye göre biraraya getiricez

select * 
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID -- on durumunda, şartında demek, burada products tablosundaki categoryID eşit ise categories tablosundaki categoryID'ye 
--yani onlar eşit ise onları yan yana getir demek 
--bu sorguyu çalıştırdığımızda ürünlerin bilgisini görürüz, * dediğimiz için ürün ile ilgili her şeyi getirir

select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName --hangi tablodan hangi kolonu istediğimizi yazıyoruz 
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID --devamına öğrendiğimiz her şeyi yazabiliriz : where, order by, group by 
where Products.UnitPrice>10 -- bu ürünlerden fiyatı 10 dan büyük olanlar için kategorilerle join et ve getir


--DTO Data Transformation Object 

--inner join 
--sadece iki tabloda eşleşenleri getirir, eşleşmeyen data varsa onları getirmez 

--joinlerde her zaman * ile başlayın 
Select * from Products p left join [Order Details] od -- tablo ismi olarak alsın diye köşeli parantez kullanıldı , genelde joinlerde kısaltma kullanılır (alyans)
on p.ProducId = od.PRoductID --hiç satılmayan ürünleri getirmemiz istenirse  
--left olan satır solda olup sağda olmayanlarıda getir demek

select * from Customers c inner join Orders o 
on c.CustomerID = o.CustomerID --bunu yaptığımızda 830 siparişin olduğunu gördük, bunlar eşleşenler 

select * from Customers c left join Orders o 
on c.CustomerID = o.CustomerID --bunu çalıştırdığımızda 832 siparişin olduğunu gördük 2 arttı
--bu müşterilerde olup siparişte olmayanlarıda getir

--yönetim sistemimize kayıt olmuş ama ürün almamış kişileri istese 
select * from Customers c left join Orders o 
on c.CustomerID = o.CustomerID
where o.CustomerID is null -- bunu PK ya yani primary key'e uygularız 

--genellikle bu iki joini kullanırız ama birde right join vardır, right join left'in tam tersidir, sağda olup solda olmayanları getirir
select * from Customers c right join Orders o 
on c.CustomerID = o.CustomerID
--bunu çalıştırdığımızda hiçbir şey gelmez sadece joinleri getirir 
--ama bunu şu şekilde yazarsak çalışır :
select * from Orders o right join Customers c
on c.CustomerID = o.CustomerID
--ama biz genelde left join i tercih ederiz çünkü genelde ana tablo öne yazılır

--birden fazla tabloyu join etmek istersek
Select * from Products p inner join [Order Details] od
on p.ProducId = od.PRoductID
inner join Orders o 
on o.OrderID = od.OrderID






















