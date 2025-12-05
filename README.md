# oop-ex1

# آشنایی با اصول شئ‌گرایی (موسوم به اصول SOLID)

### گام ۱: افزودن یک روش پیام رسانی دیگر

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
