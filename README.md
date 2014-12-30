mesos-pinspider
===============

A framework called "pinspider" on Apache mesos, to get basic user information
from a pinterest page of a user.

Getting Started
---------------

- Download mesos v0.21.0 and start the master and the slave on localhost.
- Java Pinspider Framework
```
$ git clone https://github.com/GITHUB_USERNAME/mesos-pinspider.git
$ cd pinspider
$ mvn clean compile assembly:single
$ java -cp pinspider-1.0-SNAPSHOT-jar-with-dependencies.jar com.geekz.anon.mesos.framework.PinDriver 127.0.0.1:5050 
<or>
$java -cp pinspider-1.0-SNAPSHOT-jar-with-dependencies.jar com.geekz.anon.mesos.framework.PinDriver 127.0.0.1:5050 10 http://www.pinterest.com/SwathiMystery
```
- [Web UI Mesos](http://127.0.0.1:5050/#/frameworks) and click on "Pinspider Framework"

- Sample output:
```
userboard :[{
  "title": "TechCrunch 2014 Holiday Gift Guide",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/techcrunch-2014-holiday-gift-guide/",
  "boardCover": {
    "alt": "TechCrunch 2014 Holiday Gift Guide / Your 2014 gift guide for the tech lovers in your life.  / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/59/bc/2f/59bc2f796a79777fa9e3a75bff2c07c9.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f2/a5/5f/f2a55f6dbbc5a4409c343bb6a0aa458a.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f2/a5/5f/f2a55f6dbbc5a4409c343bb6a0aa458a.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f2/a5/5f/f2a55f6dbbc5a4409c343bb6a0aa458a.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f2/a5/5f/f2a55f6dbbc5a4409c343bb6a0aa458a.jpg"
    }
  ],
  "pinCount": "81"
}, {
  "title": "Phones",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/phones/",
  "boardCover": {
    "alt": "Phones / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504120148_1412810929.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/fb/aa/9b/fbaa9bbd5841097c5996f310d73ca546.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/fb/aa/9b/fbaa9bbd5841097c5996f310d73ca546.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/fb/aa/9b/fbaa9bbd5841097c5996f310d73ca546.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/fb/aa/9b/fbaa9bbd5841097c5996f310d73ca546.jpg"
    }
  ],
  "pinCount": "22"
}, {
  "title": "Phablets",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/phablets/",
  "boardCover": {
    "alt": "Phablets / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/53/e5/30/53e53036257ed15f4e3e38b4c29fbcd4.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9a/06/7b/9a067ba96dbf779b884e79505075b3e2.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9a/06/7b/9a067ba96dbf779b884e79505075b3e2.jpg"
    }
  ],
  "pinCount": "3"
}, {
  "title": "Tablets",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/tablets/",
  "boardCover": {
    "alt": "Tablets / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/f0/58/93/f058937d59049b529f258508a44d5ecc.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b8/9e/65/b89e65cb5791fc04e5a58c696dcb43cb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b8/9e/65/b89e65cb5791fc04e5a58c696dcb43cb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b8/9e/65/b89e65cb5791fc04e5a58c696dcb43cb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b8/9e/65/b89e65cb5791fc04e5a58c696dcb43cb.jpg"
    }
  ],
  "pinCount": "8"
}, {
  "title": "Super Sweet Smart Watches",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/super-sweet-smart-watches/",
  "boardCover": {
    "alt": "Super Sweet Smart Watches / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/cb/56/c7/cb56c726a6dd569a991a76171d06d3fb.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/76/b2/f3/76b2f31858b190a4a9ccc871c5ac8018.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/76/b2/f3/76b2f31858b190a4a9ccc871c5ac8018.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/76/b2/f3/76b2f31858b190a4a9ccc871c5ac8018.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/76/b2/f3/76b2f31858b190a4a9ccc871c5ac8018.jpg"
    }
  ],
  "pinCount": "24"
}, {
  "title": "Laptops",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/laptops/",
  "boardCover": {
    "alt": "Laptops / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/65/1b/42/651b42248f2dfc15f606a60e149b1392.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/22/0d/19/220d19d889eec5dd9fb2ca8d61fcafae.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/22/0d/19/220d19d889eec5dd9fb2ca8d61fcafae.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/22/0d/19/220d19d889eec5dd9fb2ca8d61fcafae.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/22/0d/19/220d19d889eec5dd9fb2ca8d61fcafae.jpg"
    }
  ],
  "pinCount": "19"
}, {
  "title": "Cameras",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/cameras/",
  "boardCover": {
    "alt": "Cameras / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/06/79/1c/06791cdd185f8693e0c72ce05fbbe13d.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/8d/39/70/8d3970a97788567966ce75038985073c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/8d/39/70/8d3970a97788567966ce75038985073c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/8d/39/70/8d3970a97788567966ce75038985073c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/8d/39/70/8d3970a97788567966ce75038985073c.jpg"
    }
  ],
  "pinCount": "12"
}, {
  "title": "Drones",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/drones/",
  "boardCover": {
    "alt": "Drones / Drones are fun. Drones are cool. And, for now, drones are legal. Here are a few great commercial/entry-level drones that can take to the air right now and a few that might make it into stores – and the air – later this year. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/8d/31/1a/8d311ab27544afee0b8a073357cdd1c1.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/97/3c/ee/973cee351c5bc0a5c41b18b92ccd3c95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/97/3c/ee/973cee351c5bc0a5c41b18b92ccd3c95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/97/3c/ee/973cee351c5bc0a5c41b18b92ccd3c95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/97/3c/ee/973cee351c5bc0a5c41b18b92ccd3c95.jpg"
    }
  ],
  "pinCount": "9"
}, {
  "title": "Headphones",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/headphones/",
  "boardCover": {
    "alt": "Headphones / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/69/9c/c9/699cc9b18f2a6bd4ba06600ded178d3d.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/d4/b0/e8/d4b0e8a3cb490411acc82c8a16e4af53.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/d4/b0/e8/d4b0e8a3cb490411acc82c8a16e4af53.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/d4/b0/e8/d4b0e8a3cb490411acc82c8a16e4af53.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/d4/b0/e8/d4b0e8a3cb490411acc82c8a16e4af53.jpg"
    }
  ],
  "pinCount": "9"
}, {
  "title": "Wearables",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/wearables/",
  "boardCover": {
    "alt": "Wearables / Wearables are no longer just plastic-y fitness trackers.  / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504115003_1413410850.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/91/79/a0/9179a0a263299166aa83f2ea7e67fd67.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/91/79/a0/9179a0a263299166aa83f2ea7e67fd67.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/91/79/a0/9179a0a263299166aa83f2ea7e67fd67.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/91/79/a0/9179a0a263299166aa83f2ea7e67fd67.jpg"
    }
  ],
  "pinCount": "34"
}, {
  "title": "3D Printing",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/3d-printing/",
  "boardCover": {
    "alt": "3D Printing / 3D printers and cool stuff that has been 3D printed.\n\n3D printing, also known as additive manufacturing, includes any of various processes of making a three-dimensional object from a 3D model or other electronic data source primarily through additive processes. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504120588_1413400614.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/61/72/b0/6172b03c254e8d938c6c53ee3fd8fb5f.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/61/72/b0/6172b03c254e8d938c6c53ee3fd8fb5f.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/61/72/b0/6172b03c254e8d938c6c53ee3fd8fb5f.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/61/72/b0/6172b03c254e8d938c6c53ee3fd8fb5f.jpg"
    }
  ],
  "pinCount": "5"
}, {
  "title": "Smart Kitchen",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/smart-kitchen/",
  "boardCover": {
    "alt": "Smart Kitchen / Some of the top tech gadgets making their way to our cookery in the near future. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/16/23/1c/16231c49f02c37feba1c71a137827255.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/db/00/02/db00029754102e8559216297b57eb906.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/db/00/02/db00029754102e8559216297b57eb906.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/db/00/02/db00029754102e8559216297b57eb906.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/db/00/02/db00029754102e8559216297b57eb906.jpg"
    }
  ],
  "pinCount": "8"
}, {
  "title": "Smart Home",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/smart-home/",
  "boardCover": {
    "alt": "Smart Home / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504120590_1413411749.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9e/75/c9/9e75c93d876805638b021fbdec677a95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9e/75/c9/9e75c93d876805638b021fbdec677a95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9e/75/c9/9e75c93d876805638b021fbdec677a95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9e/75/c9/9e75c93d876805638b021fbdec677a95.jpg"
    }
  ],
  "pinCount": "9"
}, {
  "title": "Startup Fashion Collection",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/startup-fashion-collection/",
  "boardCover": {
    "alt": "Startup Fashion Collection / In response to Banana Republic’s Guide to Startup Fashion, we decided to show what startup people actually wear. Presenting the TC Spring/Summer 2014 Startup Fashion Collection. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504115020_1413401343.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/23/ac/e2/23ace257e4f3be0e1454a89a639fd4ce.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/23/ac/e2/23ace257e4f3be0e1454a89a639fd4ce.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/23/ac/e2/23ace257e4f3be0e1454a89a639fd4ce.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/23/ac/e2/23ace257e4f3be0e1454a89a639fd4ce.jpg"
    }
  ],
  "pinCount": "9"
}, {
  "title": "Quotes of Disrupt",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/quotes-of-disrupt/",
  "boardCover": {
    "alt": "Quotes of Disrupt / These are the #disruptmeme memes of TechCrunch Disrupt NY 2014.  / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/bd/b7/0c/bdb70cdac3eb89b2ef4814a5f757fbad.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/52/c6/f2/52c6f2350605fcfad260be7d8037f3a5.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/52/c6/f2/52c6f2350605fcfad260be7d8037f3a5.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/52/c6/f2/52c6f2350605fcfad260be7d8037f3a5.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/52/c6/f2/52c6f2350605fcfad260be7d8037f3a5.jpg"
    }
  ],
  "pinCount": "27"
}, {
  "title": "Miscellaneous Gadgets",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/miscellaneous-gadgets/",
  "boardCover": {
    "alt": "Miscellaneous Gadgets / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504027252_1403920311.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/ca/e8/91/cae8915cfa4378f892f83ee38bcde47d.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/ca/e8/91/cae8915cfa4378f892f83ee38bcde47d.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/ca/e8/91/cae8915cfa4378f892f83ee38bcde47d.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/ca/e8/91/cae8915cfa4378f892f83ee38bcde47d.jpg"
    }
  ],
  "pinCount": "242"
}, {
  "title": "Apps",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/apps/",
  "boardCover": {
    "alt": "Apps / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504027251_1403919920.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b3/08/20/b30820aee15f462ed0cada1d609278ca.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b3/08/20/b30820aee15f462ed0cada1d609278ca.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b3/08/20/b30820aee15f462ed0cada1d609278ca.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b3/08/20/b30820aee15f462ed0cada1d609278ca.jpg"
    }
  ],
  "pinCount": "165"
}, {
  "title": "Tech Lifestyle",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/tech-lifestyle/",
  "boardCover": {
    "alt": "Tech Lifestyle / Tech companies big and small weren’t afraid to show their support for gay, lesbian, bisexual, transgender, and queer rights at the 2014 San Francisco Pride festival. Here’s how they celebrated. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/ed/83/f7/ed83f72206a2b0d9dec0502af3c25464.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f4/be/1f/f4be1f9bca7a74e4e0d01bca6280d17c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f4/be/1f/f4be1f9bca7a74e4e0d01bca6280d17c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f4/be/1f/f4be1f9bca7a74e4e0d01bca6280d17c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f4/be/1f/f4be1f9bca7a74e4e0d01bca6280d17c.jpg"
    }
  ],
  "pinCount": "47"
}, {
  "title": "Cool Apps",
  "boardByFullName": "Anil Tanwar - SEO & Social Media",
  "href": "/AnilTanwar/cool-apps/",
  "boardCover": {
    "alt": "Cool Apps / Catch me up on Twitter @AnilTanwar for invitation and help me to stop spamming. / by Anil Tanwar - SEO & Social Media",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/551831829280200705_1408182324.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/6d/7e/57/6d7e57381b86892930a7db4c1a5e84eb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/6d/7e/57/6d7e57381b86892930a7db4c1a5e84eb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/6d/7e/57/6d7e57381b86892930a7db4c1a5e84eb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/6d/7e/57/6d7e57381b86892930a7db4c1a5e84eb.jpg"
    }
  ],
  "pinCount": "254"
}]
userprofile :{
  "bio": "Breaking technology news, analysis, and opinions from TechCrunch. Your number guide for all things tech.",
  "website": "http://techcrunch.com/",
  "boardsCount": "19",
  "facebook": "",
  "twitter": "http://twitter.com/TechCrunch",
  "followersCount": "56,333",
  "followingCount": "0",
  "noOfLikes": "102",
  "location": "San Francisco, CA",
  "name": "TechCrunch",
  "pinsCount": "751"
}
userboard :[{
  "title": "TechCrunch 2014 Holiday Gift Guide",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/techcrunch-2014-holiday-gift-guide/",
  "boardCover": {
    "alt": "TechCrunch 2014 Holiday Gift Guide / Your 2014 gift guide for the tech lovers in your life.  / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/59/bc/2f/59bc2f796a79777fa9e3a75bff2c07c9.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f2/a5/5f/f2a55f6dbbc5a4409c343bb6a0aa458a.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f2/a5/5f/f2a55f6dbbc5a4409c343bb6a0aa458a.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f2/a5/5f/f2a55f6dbbc5a4409c343bb6a0aa458a.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f2/a5/5f/f2a55f6dbbc5a4409c343bb6a0aa458a.jpg"
    }
  ],
  "pinCount": "81"
}, {
  "title": "Phones",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/phones/",
  "boardCover": {
    "alt": "Phones / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504120148_1412810929.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/fb/aa/9b/fbaa9bbd5841097c5996f310d73ca546.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/fb/aa/9b/fbaa9bbd5841097c5996f310d73ca546.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/fb/aa/9b/fbaa9bbd5841097c5996f310d73ca546.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/fb/aa/9b/fbaa9bbd5841097c5996f310d73ca546.jpg"
    }
  ],
  "pinCount": "22"
}, {
  "title": "Phablets",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/phablets/",
  "boardCover": {
    "alt": "Phablets / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/53/e5/30/53e53036257ed15f4e3e38b4c29fbcd4.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9a/06/7b/9a067ba96dbf779b884e79505075b3e2.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9a/06/7b/9a067ba96dbf779b884e79505075b3e2.jpg"
    }
  ],
  "pinCount": "3"
}, {
  "title": "Tablets",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/tablets/",
  "boardCover": {
    "alt": "Tablets / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/f0/58/93/f058937d59049b529f258508a44d5ecc.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b8/9e/65/b89e65cb5791fc04e5a58c696dcb43cb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b8/9e/65/b89e65cb5791fc04e5a58c696dcb43cb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b8/9e/65/b89e65cb5791fc04e5a58c696dcb43cb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b8/9e/65/b89e65cb5791fc04e5a58c696dcb43cb.jpg"
    }
  ],
  "pinCount": "8"
}, {
  "title": "Super Sweet Smart Watches",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/super-sweet-smart-watches/",
  "boardCover": {
    "alt": "Super Sweet Smart Watches / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/cb/56/c7/cb56c726a6dd569a991a76171d06d3fb.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/76/b2/f3/76b2f31858b190a4a9ccc871c5ac8018.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/76/b2/f3/76b2f31858b190a4a9ccc871c5ac8018.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/76/b2/f3/76b2f31858b190a4a9ccc871c5ac8018.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/76/b2/f3/76b2f31858b190a4a9ccc871c5ac8018.jpg"
    }
  ],
  "pinCount": "24"
}, {
  "title": "Laptops",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/laptops/",
  "boardCover": {
    "alt": "Laptops / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/65/1b/42/651b42248f2dfc15f606a60e149b1392.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/22/0d/19/220d19d889eec5dd9fb2ca8d61fcafae.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/22/0d/19/220d19d889eec5dd9fb2ca8d61fcafae.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/22/0d/19/220d19d889eec5dd9fb2ca8d61fcafae.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/22/0d/19/220d19d889eec5dd9fb2ca8d61fcafae.jpg"
    }
  ],
  "pinCount": "19"
}, {
  "title": "Cameras",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/cameras/",
  "boardCover": {
    "alt": "Cameras / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/06/79/1c/06791cdd185f8693e0c72ce05fbbe13d.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/8d/39/70/8d3970a97788567966ce75038985073c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/8d/39/70/8d3970a97788567966ce75038985073c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/8d/39/70/8d3970a97788567966ce75038985073c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/8d/39/70/8d3970a97788567966ce75038985073c.jpg"
    }
  ],
  "pinCount": "12"
}, {
  "title": "Drones",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/drones/",
  "boardCover": {
    "alt": "Drones / Drones are fun. Drones are cool. And, for now, drones are legal. Here are a few great commercial/entry-level drones that can take to the air right now and a few that might make it into stores – and the air – later this year. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/8d/31/1a/8d311ab27544afee0b8a073357cdd1c1.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/97/3c/ee/973cee351c5bc0a5c41b18b92ccd3c95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/97/3c/ee/973cee351c5bc0a5c41b18b92ccd3c95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/97/3c/ee/973cee351c5bc0a5c41b18b92ccd3c95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/97/3c/ee/973cee351c5bc0a5c41b18b92ccd3c95.jpg"
    }
  ],
  "pinCount": "9"
}, {
  "title": "Headphones",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/headphones/",
  "boardCover": {
    "alt": "Headphones / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/69/9c/c9/699cc9b18f2a6bd4ba06600ded178d3d.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/d4/b0/e8/d4b0e8a3cb490411acc82c8a16e4af53.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/d4/b0/e8/d4b0e8a3cb490411acc82c8a16e4af53.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/d4/b0/e8/d4b0e8a3cb490411acc82c8a16e4af53.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/d4/b0/e8/d4b0e8a3cb490411acc82c8a16e4af53.jpg"
    }
  ],
  "pinCount": "9"
}, {
  "title": "Wearables",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/wearables/",
  "boardCover": {
    "alt": "Wearables / Wearables are no longer just plastic-y fitness trackers.  / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504115003_1413410850.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/91/79/a0/9179a0a263299166aa83f2ea7e67fd67.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/91/79/a0/9179a0a263299166aa83f2ea7e67fd67.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/91/79/a0/9179a0a263299166aa83f2ea7e67fd67.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/91/79/a0/9179a0a263299166aa83f2ea7e67fd67.jpg"
    }
  ],
  "pinCount": "34"
}, {
  "title": "3D Printing",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/3d-printing/",
  "boardCover": {
    "alt": "3D Printing / 3D printers and cool stuff that has been 3D printed.\n\n3D printing, also known as additive manufacturing, includes any of various processes of making a three-dimensional object from a 3D model or other electronic data source primarily through additive processes. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504120588_1413400614.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/61/72/b0/6172b03c254e8d938c6c53ee3fd8fb5f.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/61/72/b0/6172b03c254e8d938c6c53ee3fd8fb5f.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/61/72/b0/6172b03c254e8d938c6c53ee3fd8fb5f.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/61/72/b0/6172b03c254e8d938c6c53ee3fd8fb5f.jpg"
    }
  ],
  "pinCount": "5"
}, {
  "title": "Smart Kitchen",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/smart-kitchen/",
  "boardCover": {
    "alt": "Smart Kitchen / Some of the top tech gadgets making their way to our cookery in the near future. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/16/23/1c/16231c49f02c37feba1c71a137827255.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/db/00/02/db00029754102e8559216297b57eb906.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/db/00/02/db00029754102e8559216297b57eb906.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/db/00/02/db00029754102e8559216297b57eb906.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/db/00/02/db00029754102e8559216297b57eb906.jpg"
    }
  ],
  "pinCount": "8"
}, {
  "title": "Smart Home",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/smart-home/",
  "boardCover": {
    "alt": "Smart Home / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504120590_1413411749.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9e/75/c9/9e75c93d876805638b021fbdec677a95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9e/75/c9/9e75c93d876805638b021fbdec677a95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9e/75/c9/9e75c93d876805638b021fbdec677a95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9e/75/c9/9e75c93d876805638b021fbdec677a95.jpg"
    }
  ],
  "pinCount": "9"
}, {
  "title": "Startup Fashion Collection",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/startup-fashion-collection/",
  "boardCover": {
    "alt": "Startup Fashion Collection / In response to Banana Republic’s Guide to Startup Fashion, we decided to show what startup people actually wear. Presenting the TC Spring/Summer 2014 Startup Fashion Collection. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504115020_1413401343.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/23/ac/e2/23ace257e4f3be0e1454a89a639fd4ce.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/23/ac/e2/23ace257e4f3be0e1454a89a639fd4ce.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/23/ac/e2/23ace257e4f3be0e1454a89a639fd4ce.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/23/ac/e2/23ace257e4f3be0e1454a89a639fd4ce.jpg"
    }
  ],
  "pinCount": "9"
}, {
  "title": "Quotes of Disrupt",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/quotes-of-disrupt/",
  "boardCover": {
    "alt": "Quotes of Disrupt / These are the #disruptmeme memes of TechCrunch Disrupt NY 2014.  / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/bd/b7/0c/bdb70cdac3eb89b2ef4814a5f757fbad.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/52/c6/f2/52c6f2350605fcfad260be7d8037f3a5.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/52/c6/f2/52c6f2350605fcfad260be7d8037f3a5.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/52/c6/f2/52c6f2350605fcfad260be7d8037f3a5.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/52/c6/f2/52c6f2350605fcfad260be7d8037f3a5.jpg"
    }
  ],
  "pinCount": "27"
}, {
  "title": "Miscellaneous Gadgets",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/miscellaneous-gadgets/",
  "boardCover": {
    "alt": "Miscellaneous Gadgets / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504027252_1403920311.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/ca/e8/91/cae8915cfa4378f892f83ee38bcde47d.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/ca/e8/91/cae8915cfa4378f892f83ee38bcde47d.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/ca/e8/91/cae8915cfa4378f892f83ee38bcde47d.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/ca/e8/91/cae8915cfa4378f892f83ee38bcde47d.jpg"
    }
  ],
  "pinCount": "242"
}, {
  "title": "Apps",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/apps/",
  "boardCover": {
    "alt": "Apps / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504027251_1403919920.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b3/08/20/b30820aee15f462ed0cada1d609278ca.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b3/08/20/b30820aee15f462ed0cada1d609278ca.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b3/08/20/b30820aee15f462ed0cada1d609278ca.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b3/08/20/b30820aee15f462ed0cada1d609278ca.jpg"
    }
  ],
  "pinCount": "165"
}, {
  "title": "Tech Lifestyle",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/tech-lifestyle/",
  "boardCover": {
    "alt": "Tech Lifestyle / Tech companies big and small weren’t afraid to show their support for gay, lesbian, bisexual, transgender, and queer rights at the 2014 San Francisco Pride festival. Here’s how they celebrated. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/ed/83/f7/ed83f72206a2b0d9dec0502af3c25464.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f4/be/1f/f4be1f9bca7a74e4e0d01bca6280d17c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f4/be/1f/f4be1f9bca7a74e4e0d01bca6280d17c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f4/be/1f/f4be1f9bca7a74e4e0d01bca6280d17c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f4/be/1f/f4be1f9bca7a74e4e0d01bca6280d17c.jpg"
    }
  ],
  "pinCount": "47"
}, {
  "title": "Cool Apps",
  "boardByFullName": "Anil Tanwar - SEO & Social Media",
  "href": "/AnilTanwar/cool-apps/",
  "boardCover": {
    "alt": "Cool Apps / Catch me up on Twitter @AnilTanwar for invitation and help me to stop spamming. / by Anil Tanwar - SEO & Social Media",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/551831829280200705_1408182324.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/6d/7e/57/6d7e57381b86892930a7db4c1a5e84eb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/6d/7e/57/6d7e57381b86892930a7db4c1a5e84eb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/6d/7e/57/6d7e57381b86892930a7db4c1a5e84eb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/6d/7e/57/6d7e57381b86892930a7db4c1a5e84eb.jpg"
    }
  ],
  "pinCount": "254"
}]
userprofile :{
  "bio": "Breaking technology news, analysis, and opinions from TechCrunch. Your number guide for all things tech.",
  "website": "http://techcrunch.com/",
  "boardsCount": "19",
  "facebook": "",
  "twitter": "http://twitter.com/TechCrunch",
  "followersCount": "56,333",
  "followingCount": "0",
  "noOfLikes": "102",
  "location": "San Francisco, CA",
  "name": "TechCrunch",
  "pinsCount": "751"
}
userboard :[{
  "title": "TechCrunch 2014 Holiday Gift Guide",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/techcrunch-2014-holiday-gift-guide/",
  "boardCover": {
    "alt": "TechCrunch 2014 Holiday Gift Guide / Your 2014 gift guide for the tech lovers in your life.  / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/59/bc/2f/59bc2f796a79777fa9e3a75bff2c07c9.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f2/a5/5f/f2a55f6dbbc5a4409c343bb6a0aa458a.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f2/a5/5f/f2a55f6dbbc5a4409c343bb6a0aa458a.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f2/a5/5f/f2a55f6dbbc5a4409c343bb6a0aa458a.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f2/a5/5f/f2a55f6dbbc5a4409c343bb6a0aa458a.jpg"
    }
  ],
  "pinCount": "81"
}, {
  "title": "Phones",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/phones/",
  "boardCover": {
    "alt": "Phones / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504120148_1412810929.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/fb/aa/9b/fbaa9bbd5841097c5996f310d73ca546.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/fb/aa/9b/fbaa9bbd5841097c5996f310d73ca546.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/fb/aa/9b/fbaa9bbd5841097c5996f310d73ca546.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/fb/aa/9b/fbaa9bbd5841097c5996f310d73ca546.jpg"
    }
  ],
  "pinCount": "22"
}, {
  "title": "Phablets",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/phablets/",
  "boardCover": {
    "alt": "Phablets / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/53/e5/30/53e53036257ed15f4e3e38b4c29fbcd4.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9a/06/7b/9a067ba96dbf779b884e79505075b3e2.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9a/06/7b/9a067ba96dbf779b884e79505075b3e2.jpg"
    }
  ],
  "pinCount": "3"
}, {
  "title": "Tablets",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/tablets/",
  "boardCover": {
    "alt": "Tablets / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/f0/58/93/f058937d59049b529f258508a44d5ecc.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b8/9e/65/b89e65cb5791fc04e5a58c696dcb43cb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b8/9e/65/b89e65cb5791fc04e5a58c696dcb43cb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b8/9e/65/b89e65cb5791fc04e5a58c696dcb43cb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b8/9e/65/b89e65cb5791fc04e5a58c696dcb43cb.jpg"
    }
  ],
  "pinCount": "8"
}, {
  "title": "Super Sweet Smart Watches",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/super-sweet-smart-watches/",
  "boardCover": {
    "alt": "Super Sweet Smart Watches / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/cb/56/c7/cb56c726a6dd569a991a76171d06d3fb.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/76/b2/f3/76b2f31858b190a4a9ccc871c5ac8018.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/76/b2/f3/76b2f31858b190a4a9ccc871c5ac8018.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/76/b2/f3/76b2f31858b190a4a9ccc871c5ac8018.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/76/b2/f3/76b2f31858b190a4a9ccc871c5ac8018.jpg"
    }
  ],
  "pinCount": "24"
}, {
  "title": "Laptops",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/laptops/",
  "boardCover": {
    "alt": "Laptops / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/65/1b/42/651b42248f2dfc15f606a60e149b1392.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/22/0d/19/220d19d889eec5dd9fb2ca8d61fcafae.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/22/0d/19/220d19d889eec5dd9fb2ca8d61fcafae.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/22/0d/19/220d19d889eec5dd9fb2ca8d61fcafae.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/22/0d/19/220d19d889eec5dd9fb2ca8d61fcafae.jpg"
    }
  ],
  "pinCount": "19"
}, {
  "title": "Cameras",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/cameras/",
  "boardCover": {
    "alt": "Cameras / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/06/79/1c/06791cdd185f8693e0c72ce05fbbe13d.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/8d/39/70/8d3970a97788567966ce75038985073c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/8d/39/70/8d3970a97788567966ce75038985073c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/8d/39/70/8d3970a97788567966ce75038985073c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/8d/39/70/8d3970a97788567966ce75038985073c.jpg"
    }
  ],
  "pinCount": "12"
}, {
  "title": "Drones",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/drones/",
  "boardCover": {
    "alt": "Drones / Drones are fun. Drones are cool. And, for now, drones are legal. Here are a few great commercial/entry-level drones that can take to the air right now and a few that might make it into stores – and the air – later this year. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/8d/31/1a/8d311ab27544afee0b8a073357cdd1c1.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/97/3c/ee/973cee351c5bc0a5c41b18b92ccd3c95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/97/3c/ee/973cee351c5bc0a5c41b18b92ccd3c95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/97/3c/ee/973cee351c5bc0a5c41b18b92ccd3c95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/97/3c/ee/973cee351c5bc0a5c41b18b92ccd3c95.jpg"
    }
  ],
  "pinCount": "9"
}, {
  "title": "Headphones",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/headphones/",
  "boardCover": {
    "alt": "Headphones / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/69/9c/c9/699cc9b18f2a6bd4ba06600ded178d3d.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/d4/b0/e8/d4b0e8a3cb490411acc82c8a16e4af53.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/d4/b0/e8/d4b0e8a3cb490411acc82c8a16e4af53.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/d4/b0/e8/d4b0e8a3cb490411acc82c8a16e4af53.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/d4/b0/e8/d4b0e8a3cb490411acc82c8a16e4af53.jpg"
    }
  ],
  "pinCount": "9"
}, {
  "title": "Wearables",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/wearables/",
  "boardCover": {
    "alt": "Wearables / Wearables are no longer just plastic-y fitness trackers.  / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504115003_1413410850.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/91/79/a0/9179a0a263299166aa83f2ea7e67fd67.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/91/79/a0/9179a0a263299166aa83f2ea7e67fd67.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/91/79/a0/9179a0a263299166aa83f2ea7e67fd67.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/91/79/a0/9179a0a263299166aa83f2ea7e67fd67.jpg"
    }
  ],
  "pinCount": "34"
}, {
  "title": "3D Printing",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/3d-printing/",
  "boardCover": {
    "alt": "3D Printing / 3D printers and cool stuff that has been 3D printed.\n\n3D printing, also known as additive manufacturing, includes any of various processes of making a three-dimensional object from a 3D model or other electronic data source primarily through additive processes. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504120588_1413400614.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/61/72/b0/6172b03c254e8d938c6c53ee3fd8fb5f.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/61/72/b0/6172b03c254e8d938c6c53ee3fd8fb5f.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/61/72/b0/6172b03c254e8d938c6c53ee3fd8fb5f.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/61/72/b0/6172b03c254e8d938c6c53ee3fd8fb5f.jpg"
    }
  ],
  "pinCount": "5"
}, {
  "title": "Smart Kitchen",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/smart-kitchen/",
  "boardCover": {
    "alt": "Smart Kitchen / Some of the top tech gadgets making their way to our cookery in the near future. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/16/23/1c/16231c49f02c37feba1c71a137827255.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/db/00/02/db00029754102e8559216297b57eb906.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/db/00/02/db00029754102e8559216297b57eb906.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/db/00/02/db00029754102e8559216297b57eb906.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/db/00/02/db00029754102e8559216297b57eb906.jpg"
    }
  ],
  "pinCount": "8"
}, {
  "title": "Smart Home",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/smart-home/",
  "boardCover": {
    "alt": "Smart Home / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504120590_1413411749.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9e/75/c9/9e75c93d876805638b021fbdec677a95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9e/75/c9/9e75c93d876805638b021fbdec677a95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9e/75/c9/9e75c93d876805638b021fbdec677a95.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/9e/75/c9/9e75c93d876805638b021fbdec677a95.jpg"
    }
  ],
  "pinCount": "9"
}, {
  "title": "Startup Fashion Collection",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/startup-fashion-collection/",
  "boardCover": {
    "alt": "Startup Fashion Collection / In response to Banana Republic’s Guide to Startup Fashion, we decided to show what startup people actually wear. Presenting the TC Spring/Summer 2014 Startup Fashion Collection. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504115020_1413401343.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/23/ac/e2/23ace257e4f3be0e1454a89a639fd4ce.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/23/ac/e2/23ace257e4f3be0e1454a89a639fd4ce.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/23/ac/e2/23ace257e4f3be0e1454a89a639fd4ce.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/23/ac/e2/23ace257e4f3be0e1454a89a639fd4ce.jpg"
    }
  ],
  "pinCount": "9"
}, {
  "title": "Quotes of Disrupt",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/quotes-of-disrupt/",
  "boardCover": {
    "alt": "Quotes of Disrupt / These are the #disruptmeme memes of TechCrunch Disrupt NY 2014.  / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/bd/b7/0c/bdb70cdac3eb89b2ef4814a5f757fbad.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/52/c6/f2/52c6f2350605fcfad260be7d8037f3a5.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/52/c6/f2/52c6f2350605fcfad260be7d8037f3a5.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/52/c6/f2/52c6f2350605fcfad260be7d8037f3a5.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/52/c6/f2/52c6f2350605fcfad260be7d8037f3a5.jpg"
    }
  ],
  "pinCount": "27"
}, {
  "title": "Miscellaneous Gadgets",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/miscellaneous-gadgets/",
  "boardCover": {
    "alt": "Miscellaneous Gadgets / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504027252_1403920311.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/ca/e8/91/cae8915cfa4378f892f83ee38bcde47d.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/ca/e8/91/cae8915cfa4378f892f83ee38bcde47d.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/ca/e8/91/cae8915cfa4378f892f83ee38bcde47d.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/ca/e8/91/cae8915cfa4378f892f83ee38bcde47d.jpg"
    }
  ],
  "pinCount": "242"
}, {
  "title": "Apps",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/apps/",
  "boardCover": {
    "alt": "Apps / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/234891005504027251_1403919920.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b3/08/20/b30820aee15f462ed0cada1d609278ca.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b3/08/20/b30820aee15f462ed0cada1d609278ca.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b3/08/20/b30820aee15f462ed0cada1d609278ca.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/b3/08/20/b30820aee15f462ed0cada1d609278ca.jpg"
    }
  ],
  "pinCount": "165"
}, {
  "title": "Tech Lifestyle",
  "boardByFullName": "TechCrunch",
  "href": "/techcrunch/tech-lifestyle/",
  "boardCover": {
    "alt": "Tech Lifestyle / Tech companies big and small weren’t afraid to show their support for gay, lesbian, bisexual, transgender, and queer rights at the 2014 San Francisco Pride festival. Here’s how they celebrated. / by TechCrunch",
    "src": "https://s-media-cache-ak0.pinimg.com/216x146/ed/83/f7/ed83f72206a2b0d9dec0502af3c25464.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f4/be/1f/f4be1f9bca7a74e4e0d01bca6280d17c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f4/be/1f/f4be1f9bca7a74e4e0d01bca6280d17c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f4/be/1f/f4be1f9bca7a74e4e0d01bca6280d17c.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/f4/be/1f/f4be1f9bca7a74e4e0d01bca6280d17c.jpg"
    }
  ],
  "pinCount": "47"
}, {
  "title": "Cool Apps",
  "boardByFullName": "Anil Tanwar - SEO & Social Media",
  "href": "/AnilTanwar/cool-apps/",
  "boardCover": {
    "alt": "Cool Apps / Catch me up on Twitter @AnilTanwar for invitation and help me to stop spamming. / by Anil Tanwar - SEO & Social Media",
    "src": "https://s-media-cache-ak0.pinimg.com/custom_covers/216x146/551831829280200705_1408182324.jpg"
  },
  "boardThumbs": [
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/6d/7e/57/6d7e57381b86892930a7db4c1a5e84eb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/6d/7e/57/6d7e57381b86892930a7db4c1a5e84eb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/6d/7e/57/6d7e57381b86892930a7db4c1a5e84eb.jpg"
    },
    {
      "alt": "",
      "src": "https://s-media-cache-ak0.pinimg.com/45x45/6d/7e/57/6d7e57381b86892930a7db4c1a5e84eb.jpg"
    }
  ],
  "pinCount": "254"
}]

```
