package com.robinhood.compose.bento.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.RadioButtonStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: BentoRadioButton.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoRadioButtonDefaults;", "", "<init>", "()V", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/RadioButtonStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/RadioButtonStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.BentoRadioButtonDefaults, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoRadioButton {
    public static final int $stable = 0;
    public static final BentoRadioButton INSTANCE = new BentoRadioButton();

    private BentoRadioButton() {
    }

    @JvmName
    public final RadioButtonStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(434232895, i, -1, "com.robinhood.compose.bento.component.BentoRadioButtonDefaults.<get-style> (BentoRadioButton.kt:42)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        RadioButtonStyle radioButtonStyle = new RadioButtonStyle(bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return radioButtonStyle;
    }
}
