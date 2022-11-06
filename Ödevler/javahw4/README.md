Ödev 1

Proje ismi : Kodlama.io.Devs

Req 1 : Sistemde programlama dilleri tutulmalıdır.

Programlama dillerini(C#,Java,Python) ekleyebilecek, silebilecek, güncelleyebilecek, listeleyebilecek, id ile getirebilecek kodları yazınız. Bunu tamamen in memory yapınız.

İsimler tekrar edemez.

Programlama dili boş geçilemez. (Validation kullanmadan, kod yazarak algoritmik çözünüz.)

/api/programminglanguages/update : PUT - Güncelleme

/api/programminglanguages/add :  POST -Ekleme

/api/programminglanguages/{id} : GET - Id'ye göre getirir

/api/programminglanguages/{id} : DELETE - Silme

/api/programminglanguages/getall : GET - Tümünü getirir, Listeleme

http://localhost:8082/api/programminglanguages/getall

http://localhost:8082/swagger-ui.html