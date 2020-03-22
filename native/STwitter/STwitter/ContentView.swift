//
//  ContentView.swift
//  STwitter
//
//  Created by Vyacheslav Dulnev on 22.03.2020.
//  Copyright © 2020 Vyacheslav Dulnev. All rights reserved.
//

import SwiftUI
import SharedCode

struct ContentView: View {
    var body: some View {
        Text(CommonKt.createApplicationScreenMessage())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
