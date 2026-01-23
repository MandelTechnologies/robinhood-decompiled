package com.robinhood.android.lib.trade.view;

import com.robinhood.android.common.C11048R;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import kotlin.Metadata;

/* compiled from: TradeBarOverlay.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/view/TradeBarOverlayOverlay;", "Lcom/robinhood/scarlet/ScarletOverlay;", "<init>", "()V", "styleReference", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getStyleReference", "()Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "priority", "", "getPriority", "()I", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.trade.view.TradeBarOverlayOverlay, reason: use source file name */
/* loaded from: classes8.dex */
public final class TradeBarOverlay implements ScarletOverlay {
    public static final TradeBarOverlay INSTANCE = new TradeBarOverlay();
    private static final DirectResourceReference<StyleResource> styleReference = new DirectResourceReference<>(ResourceType.STYLE.INSTANCE, C11048R.style.ThemeOverlay_Robinhood_TradeBarOverlay);
    public static final int $stable = DirectResourceReference.$stable;

    @Override // com.robinhood.scarlet.ScarletOverlay
    public int getPriority() {
        return 3000;
    }

    private TradeBarOverlay() {
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public DirectResourceReference<StyleResource> getStyleReference() {
        return styleReference;
    }
}
