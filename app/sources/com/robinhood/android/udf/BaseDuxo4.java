package com.robinhood.android.udf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/udf/BaseIdentityDuxo;", "VS", "", "Lcom/robinhood/android/udf/BaseDuxo;", "initialViewState", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljava/lang/Object;Lcom/robinhood/android/udf/DuxoBundle;)V", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.udf.BaseIdentityDuxo, reason: use source file name */
/* loaded from: classes20.dex */
public class BaseDuxo4<VS> extends BaseDuxo<VS, VS> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDuxo4(VS initialViewState, DuxoBundle duxoBundle) {
        super(initialViewState, new StateProvider() { // from class: com.robinhood.android.udf.BaseIdentityDuxo.1
            @Override // com.robinhood.android.udf.StateProvider
            public final VS reduce(VS it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        }, duxoBundle);
        Intrinsics.checkNotNullParameter(initialViewState, "initialViewState");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
    }
}
