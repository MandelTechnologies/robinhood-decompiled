package com.robinhood.android.acatsin.partials.option;

import com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AcatsInPartialOptionAssetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$onViewCreated$3$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInPartialOptionAssetFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    AcatsInPartialOptionAssetFragment3(Object obj) {
        super(0, obj, AcatsInPartialOptionAssetFragment.Callbacks.class, "onEditOptionSymbolClicked", "onEditOptionSymbolClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AcatsInPartialOptionAssetFragment.Callbacks) this.receiver).onEditOptionSymbolClicked();
    }
}
