const list = [
  {
    id: 1,
    title: "IPhone 13 Pro",
    author: "Serious power. Serious value..",
    price: 139999,
    img: "http://cdn.shopify.com/s/files/1/0083/6380/2720/products/61D84NtVgVL._SX679.jpg?v=1660111583",
    amount: 1,
  },
  {
    id: 2,
    title: "IPhone SE",
    author: "A total powerhouse.",
    price: 49999,
    img: "data:image/webp;base64,UklGRjwEAABXRUJQVlA4IDAEAABwFACdASpaAFoAPkEUkEgikVFJGCgEBLSAKwDpndqtPJXbPmODzEL7Q/y2c03sDJP+v4zu2q9RO92jm+gD5Bs8f1H/3fcK/mX9G/z/Xf/Zb2L/1yU1W7kLlrfyaOY5TrfVxvnQCDN/y0pjAo3Ii3pBRpIkq+ONh+syMT7voggZm4nTQwwkpN81OEaq0zuZPuXGfDuc5A5Ue3gF//m2Cy7g6sDsFieOgtjm1wHAAP7+tDa/qVeT8xv/KpqULSSS6hCsIqAHGIBXDSfRv+ERgN+nT5HFnXH2GFS6Xl6MuLuZZ/lWAmbcCH5QacaurWTf9EjgmqujyuDhLyUkzFlqECc46RrrGxZHg61+YqPhBKlYsdH1bCQabP/HRe17ejLeAvp2X/oHzK6pPBrzXZ2s99bTPxBa72YTuT12rxCEpNB2uGvDAkBR2ZiTPI4bO3K+f+Z5M/eYG3+D1BHX1GnxTB20pFrLMAv6FQVFpfnDu64H/tEiT5T6HOXBLBwt/HysXMS84DKdKtlxikDMkbUHzLFuc/iy7osjxt1zi5rGXD5rS7h/mkIJ38E4w71DQtY+lR9v9QzBsqpxSLy/onNy9mCao+f9txbAW9XWqykqP6PMGCibCNIjxO0zlJAwOU/29xc3hmsQf82SImQ8sR951A0CISJWKLrQ5ptaMaWgdTFrWHkqB3eDvxiLfJ0hDYBt8plpTNQwDet4KdDVAxRjZBCgeaXrPNdXIb+XJ7oxJib7833ePRxqDfrBCrA7Dz3rxY8T03LKmhtNufS4hwrYgPzOly0rqHJDelWmJ9TXiHs9QPA+8F9eXlt8Hvso/a10VZc0OUqEfY10X0Pfck+XIobPxBwWQ78OQGrs0ikMNnsibU7zo0qVIjzmTBt+9Ary5Dc+ApRJYZD7JaitFs58xPJpfmtzTsoiPve37jZJh/2IlLkpRsKo0fO7lIsglA3a/ulQcvrxU84bMKy9Vr5YqIjHeO3K2uup1hcuSiGM3+wi8TcKUY/rM/6kGeEyDye2CQt/BWoA2MBf+ZDa/gTLNDutN8mxienMnAQoW3ZsqPg25ICiAoRBwOBMJT+A6v8rPNt7MEwP/ozPXzHRnhkBVQSKdHsUuGcv73dzevYK7ZHNrwXUR1v7sLe+UxZXwla2oRBHb9huWdy+Uo2knb/PQVqZuOCB/F7Hodz+RGZzz9QrrJ1nRW1ZocF98CEZrHjA2qd6rfwYlfA3boYbzQHQawDMzh+Y9yMoCqDwL8XeLj8Ixn1qqnkDb3Dq6uu6S+dRqCb5FudrAFXhfDBKqzOyx+3af/pRWLaxC6P8lIOM0W6aZHlq7RFi+nYAFeLCwUcwLz2qVNKU/1Fqbf4+E/hP1pHZFYtI0ZI4DcsgqzCBS/7DpdYeKvHWOD9A1ytD2if/f///nwEPAxzRsaUaVOnuAAAA",
    amount: 1,
  },
  {
    id: 3,
    title: "IPhone 14 Plus",
    author: "Switching to iPhone is super simple",
    price: 109999,
    img: "https://encrypted-tbn0.gstatic.com/shopping?q=tbn:ANd9GcQDKow8hw-XK4-ZKhNVW_LcEUd4uk6WvYGaZM3_i_R_mKhSIm-pXcwVOAEMHL3Iw8eXdanlkIfKuf1M9lTEoSNK7u7RtCCMt2Q&usqp=CAc",
    amount: 1,
  },
  {
    id: 4,
    title: "IPhone 14 Pro Max",
    author: "The ultimate iPhone",
    price:169999 ,
    img: "https://encrypted-tbn0.gstatic.com/shopping?q=tbn:ANd9GcTa2HFSlHojjLVkuoBI42s13tdtmjU2C9yqr2U7u_vaXsHTX78HEBAVZyKhX-CxAZAOLQd1QM0ty8jy_IvuIjmEXl_B_aFenDo&usqp=CAc",
    amount: 1,
  },
  {
    id: 5,
    title: "IPhone 14 Pro",
    author: "The ultimate iPhone..",
    price: 149999,
    img: "https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcSOhwQ1MEf4xhE4qTeRV1kqdNZU6Qp5lt364Sh8FpWm3NYlOX_oimrrHqN4Nvzgv0zMJwD9hS0NwalI9FL0i9-CeHosaOz4Oqc&usqp=CAc",
    amount: 1,
  },
  {
    id: 6,
    title: "IPhone 12 ",
    author: "Switching to iPhone is super simple",
    price: 99990,
    img: "https://d2d22nphq0yz8t.cloudfront.net/88e6cc4b-eaa1-4053-af65-563d88ba8b26/https://media.croma.com/image/upload/v1662424212/Croma%20Assets/Communication/Mobiles/Images/234252_czgdvc.png/mxw_1440,f_auto",
    amount: 1,
  },
  {
    id: 7,
    title: "IPhone 12 Pro ",
    author: "The ultimate iPhone.",
    price: 109999,
    img: "https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcSG3SfKxP7TJJlxfr-X27gLfp9G5l4V2NTJIIV3ibvWs-lRKtPVAHZQLYTN-K93HVu0cOy5s9bzEblLLaRNs8CiixseSIF8Xg&usqp=CAc",
    amount: 1,
  },
  {
    id: 8,
    title: "IPhone 12 Pro Max",
    author: "The ultimate iPhone.",
    price: 125999,
    img: "https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcT3B-ndouAZPoM_qhO30wI_Fo-47uQ4sempcbTEr2yIFYyEypqTKTIFH_sPtt8j4AFbzeoqVM4z1rq4hZnmBr3FvxB94adrXZV2&usqp=CAc",
    amount: 1,
  },
  {
    id: 9,
    title: "IPhone 12  Mini ",
    author: "The ultimate iPhone.",
    price: 79999,
    img: "https://cdn.shopify.com/s/files/1/0568/5942/7015/products/MGJF3HN_A_1.png?v=1631166537",
    amount: 1,
  },
  {
    id: 10,
    title: "IPhone 11",
    author: "Switching to iPhoneis super simple",
    price: 49999,
    img: "https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcRuV-olSOIPpiUQ6_DfWBXHmik6kKmyxnu5CqD5BL91Fqwpsjl_-3HFo-XWlLHdiFgQvfivxcq1FgvDuWok8azdnM6v1E3O2P_z&usqp=CAc",
    amount: 1,
  },
  {
    id: 11,
    title: "IPhone 11 Pro",
    author: "The ultimate iPhone.",
    price: 65999,
    img: "https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcTnAQAMuTlB5WoqH_gu3K2n1_4Ub6wVuJhRVtvBuZcOmSn0fchKjYROc7aQxqGkBmViSkSrsXGQ8uITC65Ps7roXWOcBlXxkOU&usqp=CAc",
    amount: 1,
  },
  {
    id: 12,
    title: "IPhone 11 Mini",
    author: "Switching to iPhoneis super simple",
    price: 55999,
    img: "https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcShDarwVnCT5E1ybjRmpa-3WMIzyc1vhNRh5zy1MU7V4N2lDZwMREJN0-4Mry3R&usqp=CAc",
    amount: 1,
  },
];

export default list;
