package com.robinhood.android.common.margin.p083ui;

import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginDefinitionsBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.margin.ui.MarginDefinitionsBottomSheetFragment$onViewCreated$2$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class MarginDefinitionsBottomSheetFragment4 extends FunctionReferenceImpl implements Function1<ProductMarketingContent, Unit> {
    MarginDefinitionsBottomSheetFragment4(Object obj) {
        super(1, obj, MarginDefinitionsBottomSheetFragment.class, "bindUi", "bindUi(Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProductMarketingContent productMarketingContent) {
        invoke2(productMarketingContent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductMarketingContent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((MarginDefinitionsBottomSheetFragment) this.receiver).bindUi(p0);
    }
}
