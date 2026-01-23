package com.robinhood.android.chart.blackwidowadvancedchart;

import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import kotlin.Metadata;

/* compiled from: ScarletOverlay.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/WebViewDarkDesignThemeOverlay;", "Lcom/robinhood/scarlet/ScarletOverlay;", "<init>", "()V", "styleReference", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getStyleReference", "()Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "priority", "", "getPriority", "()I", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.WebViewDarkDesignThemeOverlay, reason: use source file name */
/* loaded from: classes7.dex */
public final class ScarletOverlay2 implements ScarletOverlay {
    public static final int $stable = DirectResourceReference.$stable;
    private final DirectResourceReference<StyleResource> styleReference = new DirectResourceReference<>(ResourceType.STYLE.INSTANCE, C10963R.style.WebView_Dark);

    @Override // com.robinhood.scarlet.ScarletOverlay
    public int getPriority() {
        return 110;
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public DirectResourceReference<StyleResource> getStyleReference() {
        return this.styleReference;
    }
}
