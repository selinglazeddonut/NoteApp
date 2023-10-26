// Context : a note app that allows users to create, edit, and delete notes

// list screen - title
// detail screen -  title, description
// create new note screen - title, description, save button

// list screen - recycler view - item sadece title barındırsın - create new note button
// detail screen - liste ekranından bir title getirsin ve title göre description getirsin

// liste ekranında bir itema tıkladığımızda detail screen açılsın
// liste ekranında create new note butonuna tıkladığımızda create new note screen açılsın
// create new note screen'da title ve description girip save butonuna tıkladığımızda liste ekranına geri dönelim


// TODO developer yorumu --------------------------------------------------------------------------------
// TODO UI işlemleri
// MainActivity aç
// (List screen)            Fragment aç, recycler view - adapter, (create note) button
// (Detail screen)          Fragment aç, (title) text view, (description) text view
// (Create new note screen) Fragment aç, (title) edittext, (description) edittext, (kaydet) button
// ekranlar arası geçiş için jetpack navigation kullanılacak

// TODO veri işlemleri
// veri ekleme (Shared pref)
// tüm veriyi çekme (Shared pref)


// 1) liste ekranına geldim --> shared pref verileri çek -> recycler view - adapter

// 2) listeden bir iteme tıkladım -> title gönder -> detail screen ->  shared pref ile title'a göre descriptionı getir

// 3) liste ekranında create new note tıkladığımda -> Create new note screen -> edittextlerden title ve description ı al -> kaydet butonuna tıklanıldığında shared pref ile kaydet

// TODO Notlarım
// create new button a tıkladığımızda -> jetpac nav ile create note screen navigate edecek
// create new button bir floating action button

// TODO veri kaydettikten sonra veri gözükmeyecek sadece uygulamayı yeniden başlat


/*
     key      -  value
     "note 1" -  "description 1"
     "note 2" -  "description 2"
     "note 3" -  "description 3"
     "note 4" -   "description 4"
     "note 5" -  "description 5"
**/