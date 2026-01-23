package com.robinhood.android.feature.margin.hub;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.models.serverdriven.experimental.api.BuyingPowerHubAction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginStatusDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.hub.MarginStatusDetailFragment$ComposeContent$2$2$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class MarginStatusDetailFragment4 extends FunctionReferenceImpl implements Function1<BuyingPowerHubAction, Boolean> {
    MarginStatusDetailFragment4(Object obj) {
        super(1, obj, SduiActionHandler.class, "handle", "handle(Ljava/lang/Object;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(BuyingPowerHubAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(((SduiActionHandler) this.receiver).mo15941handle(p0));
    }
}
