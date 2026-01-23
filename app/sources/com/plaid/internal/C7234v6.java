package com.plaid.internal;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.v6 */
/* loaded from: classes16.dex */
public final class C7234v6<T> {

    /* renamed from: a */
    public final ArrayList f3244a;

    /* renamed from: b */
    public int f3245b;

    /* renamed from: c */
    public int f3246c;

    /* renamed from: d */
    public int f3247d;

    public C7234v6() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 50; i++) {
            arrayList.add(null);
        }
        this.f3244a = arrayList;
    }

    /* renamed from: a */
    public final ArrayList m1625a() {
        ArrayList arrayList = new ArrayList();
        int i = this.f3246c;
        int i2 = this.f3245b;
        if (i <= i2) {
            int size = this.f3244a.size();
            while (i2 < size) {
                Object obj = this.f3244a.get(i2);
                if (obj != null) {
                    arrayList.add(obj);
                }
                i2++;
            }
            int i3 = this.f3246c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object obj2 = this.f3244a.get(i4);
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        } else if (i2 <= i) {
            while (true) {
                Object obj3 = this.f3244a.get(i2);
                if (obj3 != null) {
                    arrayList.add(obj3);
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CollectionsKt.joinToString$default(m1625a(), ", ", "{", "}", 0, null, null, 56, null));
        sb.append(" [capacity=" + this.f3247d + ", H=" + this.f3245b + ", T=" + this.f3246c + "]");
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }
}
