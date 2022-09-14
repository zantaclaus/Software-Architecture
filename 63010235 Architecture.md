# Architectural Patterns

## 1. Matplotlib

### Purpose
- Matplotib คือ Library ภาษา Python สำหรับทำ data visualization หรือก็คือการแปลงข้อมูลให้ออกมาในรูปแบบของ กราฟ รูปภาพ เพื่อนำมาวิเคราะห์ต่อไป

### Architectural Styles
- ใช้สถาปัตยกรรมแบบ Layered Architecture มีทั้งหมด 3 Layer ได้แก่
	1. Scripting Layer
		- ส่วนสำหรับเขียนโปรแกรม เพื่อใช้งานตัว library เช่นการสั่งให้สร้าง figure
	2. Artist Layer
		- ส่วนที่ปรับลักษณะของ figure ไม่ว่าจะเป็น font color หรือ size
	3. Backend Layer 
		- ส่วนที่แสดงผล figure หรือก็คือแสดงกราฟออกมาเป็นรูปภาพ

### Quality Attribute Scenarios
1. Useability
	- Source of Stimulus :  ผู้ใช้งาน
	- Stimulus : ต้องการใช้ระบบอย่างมีประสิทธิภาพ
	- Artifacts : System
	- Environment : Runtime
	- Responds : ให้โค้ดผู้ใช้สามารถเขียนอ่านได้เข้าใจง่าย
	- Response Measure : ความพึงพอใจของผู้ใช้งาน
	
2.  Modifiability
	- Source of Stimulus : ผู้พัฒนา Matplotlib
	- Stimulus : เพิ่ม Function ใหม่ๆ
	- Artifacts  System
	- Environment : Runtime
	- Responds : Function ที่เพิ่มเข้ามา
	- Response Measure : ความเสถียนของ Function และ cost

3. Performance
	- Source of Stimulus : ผู้ใช้งาน
	- Stimulus : คำสั่งจากผู้ใช้งาน
	- Artifacts : System
	- Environment : Overload mode
	- Responds : ระยะเวลาที่ใช้
	- Response Measure : ระยะเวลาที่ใช้


## 2. Audacity

### Purpose
- คือ โปรแกรมแต่งเสียง ทั้งในเรื่องของการเล่น การผสมเสียง หรือการสร้างเอฟเฟ็กต์

###  Architectural Styles

[<img src="https://wiki.audacityteam.org/w/images/1/13/AudacityBlocks.png">](http://google.com.au/)

โดยใช้สถาปัตยกรรมแบบ Service-Oriented Architecture 
- มีการใช้งาน API หลายชนิด ที่มีความสัมพันธ์กัน เช่นการใช้งาน BlockFIle ผ่าน wxWidget
- BlockFIle ใช้ OS system ผ่าน wxWidgets เป็นการเก็บเสียงเป็นกลุ่มเล็กๆ เพื่อให้ปรับแต่งได้อย่างรวดเร็ว
- ShuttleGUI ใช้ wxWidgets ในการจัดการ dialog
- AudioIO จัดการเคลื่อนย้ายระหว่าง sound card, memory และ hard disk ผ่าน Audio PORT

### Quality Attribute Scenarios
1. Useability
	- Source of Stimulus :  ผู้ใช้งาน
	- Stimulus : ต้องการที่จะเข้าใจระบบ
	- Artifacts : GUI
	- Environment : Runtime
	- Responds : ใช้งานง่าย
	- Response Measure : ความเข้าใจของผู้ใข้งาน

2. Modifiability
	- Source of Stimulus :  ผู้พัฒนา Audacity
	- Stimulus : เพิ่ม Function การใช้งาน
	- Artifacts : System
	- Environment : Runtime
	- Responds : Function ที่เพิ่มเข้ามา
	- Response Measure : ความเสถียนของ Function และ cost
	
3. Performance
	- Source of Stimulus : ผู้ใช้งาน
	- Stimulus : คำสั่งจากผู้ใช้งาน
	- Artifacts : System
	- Environment : Overload mode
	- Responds : ระยะเวลาที่ใช้
	- Response Measure : ระยะเวลาที่ใช้


## 3.  Kill Bill

### Purpose
- คือ Platform Opensource ที่ใช้เรียกเก็บเงินและชำระเงิน

###  Architectural Styles
<img src="https://killbill.io/wp-content/uploads/2014/01/kbcoreservices1.png?w=30">

- Catalog Service มีหน้าที่ให้ข้อมูลที่เกี่ยวข้องกับผู้เช่าที่กำหนด บริการแค็ตตาล็อกเสนอ API เพื่อดึงข้อมูลผลิตภัณฑ์ และอื่นๆ
- The Entitlement service ให้สิทธิ์มี API สำหรับจัดการข้อมูล การให้สิทธิ์ทั้งหมดที่เกี่ยวข้องกับการสมัครรับข้อมูลที่กำหนด — สถานะ (เริ่มต้น หยุดชั่วคราว ดำเนินการต่อ หยุด ) ความเป็นเจ้าของ วันที่ต่างๆ ที่สถานะเปลี่ยน ระบบการให้สิทธิ์เสนอมุมมองที่แตกต่างกัน
- The invoice service มี API เพื่อดึงใบแจ้งหนี้ที่ผ่านมา ทำการปรับปรุง หรือแม้แต่เรียกใบแจ้งหนี้ในอนาคต
- The payment system มี API เพื่อดึงข้อมูลการชำระเงิน/การคืนเงินที่ผ่านมา 
- The overdue system เป็นระบบทั่วไปที่ขับเคลื่อนผ่านการกำหนดค่า เพื่อดำเนินการเมื่อการชำระเงินล้มเหลวและผู้ใช้ไม่ได้ชำระเงิน สามารถใช้ชุดเฟสที่ซับซ้อนเพื่อค่อยๆ ยุติบริการ แจ้งให้ผู้ใช้ทราบ

1. Useability
	- Source of Stimulus :  ผู้ใช้งาน
	- Stimulus : ต้องการที่จะเข้าใจระบบ
	- Artifacts : System
	- Environment : Runtime
	- Responds : ใช้งานง่าย
	- Response Measure : ความเข้าใจของผู้ใข้งาน

2. Modifiability
	- Source of Stimulus :  ผู้พัฒนา Kill Bill
	- Stimulus : เพิ่ม Function การใช้งาน
	- Artifacts : System
	- Environment : Runtime
	- Responds : Function ที่เพิ่มเข้ามา
	- Response Measure : ความเสถียนของ Function และ cost
	
3. Performance
	- Source of Stimulus : ผู้ใช้งาน
	- Stimulus : คำสั่งจากผู้ใช้งาน
	- Artifacts : System
	- Environment : Overload mode
	- Responds : ระยะเวลาที่ใช้
	- Response Measure : ระยะเวลาที่ใช้

