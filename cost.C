{                       
   Float_t vals[] = {
      86,
      0.21+8.016+0.098+(0.0665+0.301)+0.3535, // adjust beam of head light + winder tires + mirror + oil change + oil change&filter
      1.2395+0.521+0.5*24, // 2 years of parking
      21.09, // fuel consumption till now
      10.68, // 2 years of insurance
      0.1435+0.66+2.197, // 1 inspection
      0.72*2, // 2 years of tax
   };
   const char *labs[] = {
      "car price",
      "maintenance",
      "parking",
      "fuel",
      "insurance",
      "inspection",
      "tax",
   };
   Int_t colors[] = {13,14,15,16,17,18,19};
                                                           
   TCanvas *can = new TCanvas;
   
   Int_t nvals = sizeof(vals)/sizeof(vals[0]);
   TPie *pie = new TPie("pie", "cost / 10,000 yen",nvals,vals,colors,labs);
   
   pie->SetAngularOffset(50.);
   pie->SetX(0.4);
   pie->SetAngle3D(70.);
   pie->SetHeight(.02);
   pie->SetEntryRadiusOffset(1, 0.20);
   pie->SetEntryRadiusOffset(2, 0.02);
   pie->SetEntryRadiusOffset(3, 0.25);
   pie->SetEntryRadiusOffset(5, 0.35);
   pie->SetEntryRadiusOffset(6, 0.15);
   pie->SetValueFormat("%.1f");
   pie->SetRadius(.35);
   pie->SetLabelsOffset(-.23);
   pie->SetLabelFormat("#splitline{%val (%perc)}{%txt}");
   pie->Draw("3d");

   can->Print("pie.eps");
}                                                            
