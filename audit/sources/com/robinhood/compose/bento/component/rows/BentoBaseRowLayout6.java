package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutId2;
import com.adjust.sdk.Constants;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoBaseRowLayout.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0005H\u0016J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0005H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoRowScopeImpl;", "Lcom/robinhood/compose/bento/component/rows/BentoRowScope;", "<init>", "()V", "middle", "Landroidx/compose/ui/Modifier;", Constants.REFERRER_API_META, "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.rows.BentoRowScopeImpl, reason: use source file name */
/* loaded from: classes15.dex */
final class BentoBaseRowLayout6 implements BentoBaseRowLayout5 {
    public static final BentoBaseRowLayout6 INSTANCE = new BentoBaseRowLayout6();

    private BentoBaseRowLayout6() {
    }

    @Override // com.robinhood.compose.bento.component.rows.BentoBaseRowLayout5
    public Modifier middle(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return LayoutId2.layoutId(modifier, BentoBaseRowLayout5.Slot.Middle);
    }

    @Override // com.robinhood.compose.bento.component.rows.BentoBaseRowLayout5
    public Modifier meta(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return LayoutId2.layoutId(modifier, BentoBaseRowLayout5.Slot.Meta);
    }
}
