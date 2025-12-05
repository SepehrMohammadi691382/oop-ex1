# oop-ex1

# آشنایی با اصول شئ‌گرایی (موسوم به اصول SOLID)

### گام ۱: افزودن یک روش پیام رسانی و پرداختی دیگر

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>MessageSender</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیامک</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendSms</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>MessageSender</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیامک به EmailSender</p>
</td>
<td width="292">
<p>implement کردن تابع sendSms توسط EmailSender</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p>SmsSender</p>
</td>
<td width="141">
<p>افزودن کلاس SmsSender</p>
</td>
<td width="292">
<p>implement کردن MessageSender با دو تابع آن</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p>ReservationService</p>
</td>
<td width="141">
<p>اضافه کردن شرط ارسال پیامک</p>
</td>
<td width="292">
<p>اضافه کردن case SMS در switch case تابع makeReservation</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۵</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن قابلیت ارسال پیامک</p>
</td>
<td width="292">
<p>فراخوانی makeReservation با SMS</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۶</strong></p>
</td>
<td width="198">
<p>PaymentProcessor</p>
</td>
<td width="141">
<p>افزودن پرداخت در محل</p>
</td>
<td width="292">
<p>افزودن تابع payOnSite به PaymentProcessor</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>7</strong></p>
</td>
<td width="198">
<p>ReservationService</p>
</td>
<td width="141">
<p>اضافه کردن شرط پرداخت در محل</p>
</td>
<td width="292">
<p>اضافه کردن case ONSITE در switch case تابع makeReservation</p>
</td>
</tr>

</tbody>
</table>

مجموع تعداد تغییرات: 7


### گام ۲: بررسی اصول OOD 

<table dir='rtl'>
<tbody>

<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>در تمام کلاس های Room, LuxuryRoom, Customer, Reservation رعایت شده بود</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>ReservationService چند مسئولیت را هم‌زمان انجام می‌دهد: اعمال تخفیف شهر، پردازش پرداخت (با switch case)، چاپ فاکتور، و ارسال اعلان</p>
</td>
</tr>


<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>-</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>ReservationService از OCP پیروی نمی‌کند: برای اضافه کردن روش پرداخت جدید (مثل ONSITE که در enum وجود دارد) باید switch case را تغییر داد. همچنین برای اضافه کردن نوع جدید اعلان (مثل SMS که در enum وجود دارد) باید switch case دیگری را تغییر داد. این کلاس برای توسعه باز نیست و برای هر تغییر جدید باید کد آن را تغییر داد.</p>
</td>
</tr>


<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>LuxuryRoom به درستی از Room ارث‌بری می‌کند و می‌تواند در هر جایی که Room استفاده می‌شود جایگزین شود بدون اینکه رفتار برنامه را تغییر دهد.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>-</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>-</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>رابط «MessageSender» این اصل را نقض می‌کند: فقط متد «sendEmail» دارد در حالی که enum «Notifier» شامل EMAIL و SMS است. اگر بخواهیم SmsSender اضافه کنیم، باید اینترفیس را تغییر دهیم یا پیاده‌سازی‌های خالی اضافه کنیم. اینترفیس باید به‌صورت خاص‌تر طراحی شود (مثلاً «EmailService» و «SmsService» جداگانه) تا کلاس‌های پیاده‌ساز مجبور به پیاده‌سازی متدهای غیرضروری نشوند.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>-</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>«ReservationService» مستقیماً نمونه‌هایی از «PaymentProcessor» و «EmailSender» ایجاد می‌کند که DIP را نقض می‌کند. این کلاس به پیاده‌سازی‌های عینی وابسته است نه به انتزاع‌ها. همچنین در متد «makeReservation» مستقیماً «EmailSender» را می‌سازد</p>
</td>
</tr>


<tr>
<td rowspan="2">
<p>اصل 6</p>
<p>Principle of Least Knowledge (PLK)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>-</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>«ReservationService» مستقیماً به فیلدهای داخلی اشیای دیگر دسترسی دارد: «res.customer.name»، «res.customer.city»، «res.customer.email»، «res.room.price»، «res.room.number»، «res.room.type». این نقض PLK است زیرا باید از متدهای getter استفاده شود یا «Reservation» متدهایی برای دسترسی به این اطلاعات داشته باشد تا وابستگی به ساختار داخلی اشیای دیگر کاهش یابد</p>
</td>
</tr>


<tr>
<td rowspan="2">
<p>اصل 7</p>
<p>Composite Reuse Principle (CRP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>«ReservationService» از «PaymentProcessor» و «EmailSender» به صورت composition استفاده می‌کند که از این اصل پیروی می‌کند</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>«LuxuryRoom» از «Room» ارث‌بری می‌کند در حالی که می‌توانست از composition استفاده کند. «LuxuryRoom» می‌تواند یک نمونه از «Room» داشته باشد و رفتارهای اضافی (مثل «addFreeDinner») را به صورت composition اضافه کند</p>
</td>
</tr>
</tbody>
</table>

### گام ۳: اصلاح موارد نقض شده

<table dir='rtl'>
<tbody>
<tr>
<td width="120">
<p><strong>اصل نقض شده</strong></p>
</td>
<td width="200">
<p><strong>مورد نقض</strong></p>
</td>
<td width="380">
<p><strong>راه حل اعمال شده</strong></p>
</td>
</tr>

<tr>
<td>
<p><strong>SRP</strong></p>
</td>
<td>
<p>ReservationService چند مسئولیت داشت</p>
</td>
<td>
<p>کلاس «ReservationService» به کلاس‌های جداگانه تقسیم شد: «DiscountService» (مسئولیت تخفیف)، «PaymentService» (مسئولیت پرداخت)، «InvoiceService» (مسئولیت چاپ فاکتور)، و «NotificationServiceWrapper» (مسئولیت ارسال اعلان). «ReservationService» حالا فقط مسئول هماهنگی این سرویس‌ها است</p>
</td>
</tr>

<tr>
<td>
<p><strong>OCP</strong></p>
</td>
<td>
<p>switch case برای پرداخت و اعلان</p>
</td>
<td>
<p>«PaymentStrategy» و کلاس‌های «CardPayment»، «CashPayment»، «PayPalPayment»، «OnSitePayment» ایجاد شدند. همچنین اینترفیس «NotificationService» و کلاس‌های «EmailSender» و «SmsSender» ایجاد شدند. Factory Pattern برای ایجاد استراتژی‌ها استفاده شد («PaymentStrategyFactory» و «NotificationServiceFactory»). حالا برای اضافه کردن روش پرداخت یا اعلان جدید، فقط نیاز به ایجاد کلاس جدید است بدون تغییر کد موجود</p>
</td>
</tr>

<tr>
<td>
<p><strong>ISP</strong></p>
</td>
<td>
<p>MessageSender هر دو متد sendEmail و sendSms را داشت</p>
</td>
<td>
<p>اینترفیس «MessageSender» حذف شد و اینترفیس جدید «NotificationService» با یک متد «send» ایجاد شد. کلاس‌های «EmailSender» و «SmsSender» هر کدام فقط متدهای مربوط به خود را پیاده‌سازی می‌کنند</p>
</td>
</tr>

<tr>
<td>
<p><strong>DIP</strong></p>
</td>
<td>
<p>وابستگی مستقیم به کلاس‌های</p>
</td>
<td>
<p>همه وابستگی‌ها از طریق constructor injection تزریق می‌شوند. «ReservationService» به اینترفیس‌ها وابسته است. «PaymentService» و «NotificationServiceWrapper» هم از اینترفیس‌ها استفاده می‌کنند. در «Main» تمام وابستگی‌ها ایجاد و تزریق می‌شوند</p>
</td>
</tr>

<tr>
<td>
<p><strong>PLK</strong></p>
</td>
<td>
<p>دسترسی مستقیم به فیلدهای public</p>
</td>
<td>
<p>تمام فیلدهای public در کلاس‌های «Customer»، «Room»، و «Reservation» به private تغییر یافتند و متدهای getter اضافه شدند. همچنین متدهای helper در «Reservation» برای دسترسی به اطلاعات customer و room اضافه شدند تا از دسترسی مستقیم به فیلدهای داخلی جلوگیری شود</p>
</td>
</tr>

<tr>
<td>
<p><strong>CRP</strong></p>
</td>
<td>
<p>LuxuryRoom از Room ارث‌بری می‌کرد</p>
</td>
<td>
<p>«LuxuryRoom» دیگر از «Room» ارث‌بری نمی‌کند. به جای آن، یک نمونه از «Room» را به صورت composition دارد. اینترفیس «RoomInterface» ایجاد شد که هر دو «Room» و «LuxuryRoom» آن را پیاده‌سازی می‌کنند.</p>
</td>
</tr>

</tbody>
</table>

### گام ۴: تغییرات اضافه در گام اول

در صورتی که از ابتدا این اصول رعایت میشد
برای اضافه کردن SMS تغییرات ۱ و ۲ حذف میشدند
و تغییرا ۴ هم به جای تغییر دادن switch case تبدیل میشد به اضافه کردن یک case در factory
و برای اضافه کردن Pay ONSITE تغییرات
تغییر ۷ تبدیل به اضافه کردن به factory میشد