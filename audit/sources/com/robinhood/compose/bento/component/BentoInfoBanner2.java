package com.robinhood.compose.bento.component;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.compose.C11917R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: BentoInfoBanner.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\u001ak\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001ak\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001ay\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001ag\u0010\u001d\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010 \u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001aI\u0010!\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b!\u0010\"\u001aW\u0010#\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b#\u0010$\u001aI\u0010%\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b%\u0010\"\u001a\u000f\u0010&\u001a\u00020\bH\u0001¢\u0006\u0004\b&\u0010'\" \u0010(\u001a\u00020\u00028\u0000X\u0081D¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+\" \u0010.\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0012\n\u0004\b.\u0010)\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010+¨\u00061"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "text", "Lcom/robinhood/compose/bento/component/BentoIcons;", "icon", "ctaText", "Lkotlin/Function0;", "", "onCtaClicked", "onDismissClicked", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "backgroundColor", "BentoInfoBanner-SxpAMN0", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoIcons;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JJLandroidx/compose/runtime/Composer;II)V", "BentoInfoBanner", "Landroidx/compose/ui/text/AnnotatedString;", "BentoInfoBanner-njYn8yo", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;JJLandroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoIcons;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "markdownText", "onTextClick", "Lkotlin/Function1;", "onClickUri", "BentoInfoBanner-RakH_j8", "(Ljava/lang/String;JJLandroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoIcons;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "textContent", "BentoInfoBannerLayout-Y2T6KM0", "(JJLkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoIcons;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BentoInfoBannerLayout", "BentoInfoBannerDismissButton-RPmYEkk", "(Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "BentoInfoBannerDismissButton", "BentoUrgentInfoBanner", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoIcons;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BentoDismissableInfoBanner", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoIcons;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BentoPinnedInfoBanner", "BentoInfoBannerPreview", "(Landroidx/compose/runtime/Composer;I)V", "InfoBannerMainContentTag", "Ljava/lang/String;", "getInfoBannerMainContentTag", "()Ljava/lang/String;", "getInfoBannerMainContentTag$annotations", "()V", "InfoBannerDismissTag", "getInfoBannerDismissTag", "getInfoBannerDismissTag$annotations", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoInfoBannerKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoInfoBanner2 {
    private static final String InfoBannerDismissTag = "info_banner_dismiss";
    private static final String InfoBannerMainContentTag = "info_banner_main_content";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoDismissableInfoBanner$lambda$8(Modifier modifier, String str, BentoIcon4 bentoIcon4, String str2, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        BentoDismissableInfoBanner(modifier, str, bentoIcon4, str2, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInfoBannerDismissButton_RPmYEkk$lambda$6(Function0 function0, long j, int i, Composer composer, int i2) {
        m20655BentoInfoBannerDismissButtonRPmYEkk(function0, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInfoBannerLayout_Y2T6KM0$lambda$5(long j, long j2, Function2 function2, Modifier modifier, BentoIcon4 bentoIcon4, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        m20656BentoInfoBannerLayoutY2T6KM0(j, j2, function2, modifier, bentoIcon4, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInfoBannerPreview$lambda$10(int i, Composer composer, int i2) {
        BentoInfoBannerPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInfoBanner_RakH_j8$lambda$2(String str, long j, long j2, Modifier modifier, BentoIcon4 bentoIcon4, Function0 function0, Function0 function02, Function1 function1, int i, int i2, Composer composer, int i3) {
        m20652BentoInfoBannerRakH_j8(str, j, j2, modifier, bentoIcon4, function0, function02, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInfoBanner_SxpAMN0$lambda$0(Modifier modifier, String str, BentoIcon4 bentoIcon4, String str2, Function0 function0, Function0 function02, long j, long j2, int i, int i2, Composer composer, int i3) {
        m20653BentoInfoBannerSxpAMN0(modifier, str, bentoIcon4, str2, function0, function02, j, j2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInfoBanner_njYn8yo$lambda$1(AnnotatedString annotatedString, String str, long j, long j2, Modifier modifier, BentoIcon4 bentoIcon4, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        m20654BentoInfoBannernjYn8yo(annotatedString, str, j, j2, modifier, bentoIcon4, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoPinnedInfoBanner$lambda$9(Modifier modifier, String str, BentoIcon4 bentoIcon4, String str2, Function0 function0, int i, int i2, Composer composer, int i3) {
        BentoPinnedInfoBanner(modifier, str, bentoIcon4, str2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoUrgentInfoBanner$lambda$7(Modifier modifier, String str, BentoIcon4 bentoIcon4, String str2, Function0 function0, int i, int i2, Composer composer, int i3) {
        BentoUrgentInfoBanner(modifier, str, bentoIcon4, str2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getInfoBannerDismissTag$annotations() {
    }

    public static /* synthetic */ void getInfoBannerMainContentTag$annotations() {
    }

    public static final String getInfoBannerMainContentTag() {
        return InfoBannerMainContentTag;
    }

    public static final String getInfoBannerDismissTag() {
        return InfoBannerDismissTag;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0115  */
    /* renamed from: BentoInfoBanner-SxpAMN0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20653BentoInfoBannerSxpAMN0(Modifier modifier, final String text, BentoIcon4 bentoIcon4, final String str, Function0<Unit> function0, Function0<Unit> function02, final long j, final long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        BentoIcon4 bentoIcon42;
        int i4;
        Function0<Unit> function03;
        int i5;
        Function0<Unit> function04;
        final Modifier modifier3;
        final Function0<Unit> function05;
        final Function0<Unit> function06;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-9397369);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                bentoIcon42 = bentoIcon4;
                i3 |= composerStartRestartGroup.changed(bentoIcon42) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function03 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function03) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    function04 = function02;
                } else {
                    function04 = function02;
                    if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function04) ? 131072 : 65536;
                    }
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changed(j) ? 1048576 : 524288;
                }
                if ((i2 & 128) == 0) {
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(j2) ? 8388608 : 4194304;
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i7 != 0) {
                            bentoIcon42 = null;
                        }
                        Function0<Unit> function07 = i4 == 0 ? null : function03;
                        Function0<Unit> function08 = i5 == 0 ? null : function04;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-9397369, i3, -1, "com.robinhood.compose.bento.component.BentoInfoBanner (BentoInfoBanner.kt:64)");
                        }
                        int i8 = i3 >> 18;
                        int i9 = i3 << 3;
                        Modifier modifier4 = modifier2;
                        m20656BentoInfoBannerLayoutY2T6KM0(j, j2, ComposableLambda3.rememberComposableLambda(-1708196246, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$BentoInfoBanner$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i10) {
                                AnnotatedString annotatedString;
                                if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1708196246, i10, -1, "com.robinhood.compose.bento.component.BentoInfoBanner.<anonymous> (BentoInfoBanner.kt:73)");
                                }
                                String str2 = str;
                                if (str2 != null) {
                                    long j3 = j;
                                    String str3 = text;
                                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                                    int iPushStyle = builder.pushStyle(new SpanStyle(j3, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                    try {
                                        builder.append(str3);
                                        Unit unit = Unit.INSTANCE;
                                        builder.pop(iPushStyle);
                                        builder.append(' ');
                                        iPushStyle = builder.pushStyle(new SpanStyle(j3, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null));
                                        try {
                                            builder.append(str2);
                                            builder.pop(iPushStyle);
                                            annotatedString = builder.toAnnotatedString();
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } else {
                                    annotatedString = new AnnotatedString(text, null, 2, null);
                                }
                                BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, null, ((Styles) composer2.consume(Styles2.getLocalStyles())).getInfoBanner(composer2, 0).getTypography().getTextStyle(), composer2, 0, 0, 8186);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), modifier4, bentoIcon42, function07, function08, composerStartRestartGroup, (i8 & 112) | (i8 & 14) | 384 | ((i3 << 9) & 7168) | (57344 & (i3 << 6)) | (458752 & i9) | (i9 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        function05 = function07;
                        function06 = function08;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function06 = function04;
                        modifier3 = modifier2;
                        function05 = function03;
                    }
                    final BentoIcon4 bentoIcon43 = bentoIcon42;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoInfoBanner2.BentoInfoBanner_SxpAMN0$lambda$0(modifier3, text, bentoIcon43, str, function05, function06, j, j2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i3 >> 18;
                    int i92 = i3 << 3;
                    Modifier modifier42 = modifier2;
                    m20656BentoInfoBannerLayoutY2T6KM0(j, j2, ComposableLambda3.rememberComposableLambda(-1708196246, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$BentoInfoBanner$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            AnnotatedString annotatedString;
                            if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1708196246, i10, -1, "com.robinhood.compose.bento.component.BentoInfoBanner.<anonymous> (BentoInfoBanner.kt:73)");
                            }
                            String str2 = str;
                            if (str2 != null) {
                                long j3 = j;
                                String str3 = text;
                                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                                int iPushStyle = builder.pushStyle(new SpanStyle(j3, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                try {
                                    builder.append(str3);
                                    Unit unit = Unit.INSTANCE;
                                    builder.pop(iPushStyle);
                                    builder.append(' ');
                                    iPushStyle = builder.pushStyle(new SpanStyle(j3, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null));
                                    try {
                                        builder.append(str2);
                                        builder.pop(iPushStyle);
                                        annotatedString = builder.toAnnotatedString();
                                    } finally {
                                    }
                                } finally {
                                }
                            } else {
                                annotatedString = new AnnotatedString(text, null, 2, null);
                            }
                            BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, null, ((Styles) composer2.consume(Styles2.getLocalStyles())).getInfoBanner(composer2, 0).getTypography().getTextStyle(), composer2, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), modifier42, bentoIcon42, function07, function08, composerStartRestartGroup, (i82 & 112) | (i82 & 14) | 384 | ((i3 << 9) & 7168) | (57344 & (i3 << 6)) | (458752 & i92) | (i92 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    function05 = function07;
                    function06 = function08;
                }
                final BentoIcon4 bentoIcon432 = bentoIcon42;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function03 = function0;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            final BentoIcon4 bentoIcon4322 = bentoIcon42;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        bentoIcon42 = bentoIcon4;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        final BentoIcon4 bentoIcon43222 = bentoIcon42;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    /* renamed from: BentoInfoBanner-njYn8yo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20654BentoInfoBannernjYn8yo(final AnnotatedString text, final String str, final long j, final long j2, Modifier modifier, BentoIcon4 bentoIcon4, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        int i4;
        Modifier modifier2;
        int i5;
        BentoIcon4 bentoIcon42;
        int i6;
        int i7;
        int i8;
        final Modifier modifier3;
        final BentoIcon4 bentoIcon43;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(123036013);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                j3 = j2;
                i3 |= composerStartRestartGroup.changed(j3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        bentoIcon42 = bentoIcon4;
                        i3 |= composerStartRestartGroup.changed(bentoIcon42) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                        if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
                        }
                        if ((i3 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            if (i4 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            BentoIcon4 bentoIcon44 = i5 == 0 ? null : bentoIcon42;
                            Function0<Unit> function05 = i6 == 0 ? null : function0;
                            Function0<Unit> function06 = i8 == 0 ? null : function02;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(123036013, i3, -1, "com.robinhood.compose.bento.component.BentoInfoBanner (BentoInfoBanner.kt:108)");
                            }
                            int i9 = i3 >> 6;
                            int i10 = i3 >> 3;
                            Modifier modifier4 = modifier2;
                            Function0<Unit> function07 = function05;
                            m20656BentoInfoBannerLayoutY2T6KM0(j, j3, ComposableLambda3.rememberComposableLambda(1556385258, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$BentoInfoBanner$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i11) {
                                    if ((i11 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1556385258, i11, -1, "com.robinhood.compose.bento.component.BentoInfoBanner.<anonymous> (BentoInfoBanner.kt:117)");
                                    }
                                    long j4 = j;
                                    String str2 = str;
                                    AnnotatedString annotatedString = text;
                                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                                    int iPushStyle = builder.pushStyle(new SpanStyle(j4, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                    try {
                                        builder.append(annotatedString);
                                        Unit unit = Unit.INSTANCE;
                                        if (str2 != null && !StringsKt.isBlank(str2)) {
                                            builder.append(' ');
                                            builder.pushStringAnnotation("ctaTextAction", str2);
                                            iPushStyle = builder.pushStyle(new SpanStyle(j4, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null));
                                            try {
                                                builder.append(str2);
                                                builder.pop(iPushStyle);
                                                builder.pop();
                                            } finally {
                                            }
                                        }
                                        BentoText2.m20748BentoTextQnj7Zds(builder.toAnnotatedString(), null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, null, ((Styles) composer2.consume(Styles2.getLocalStyles())).getInfoBanner(composer2, 0).getTypography().getTextStyle(), composer2, 0, 0, 8186);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } finally {
                                    }
                                }
                            }, composerStartRestartGroup, 54), modifier4, bentoIcon44, function07, function06, composerStartRestartGroup, (i9 & 112) | (i9 & 14) | 384 | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            bentoIcon43 = bentoIcon44;
                            function03 = function07;
                            function04 = function06;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function03 = function0;
                            modifier3 = modifier2;
                            bentoIcon43 = bentoIcon42;
                            function04 = function02;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoInfoBanner2.BentoInfoBanner_njYn8yo$lambda$1(text, str, j, j2, modifier3, bentoIcon43, function03, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 12582912;
                    i8 = i7;
                    if ((i3 & 4793491) != 4793490) {
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i92 = i3 >> 6;
                        int i102 = i3 >> 3;
                        Modifier modifier42 = modifier2;
                        Function0<Unit> function072 = function05;
                        m20656BentoInfoBannerLayoutY2T6KM0(j, j3, ComposableLambda3.rememberComposableLambda(1556385258, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$BentoInfoBanner$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11) {
                                if ((i11 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1556385258, i11, -1, "com.robinhood.compose.bento.component.BentoInfoBanner.<anonymous> (BentoInfoBanner.kt:117)");
                                }
                                long j4 = j;
                                String str2 = str;
                                AnnotatedString annotatedString = text;
                                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                                int iPushStyle = builder.pushStyle(new SpanStyle(j4, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                try {
                                    builder.append(annotatedString);
                                    Unit unit = Unit.INSTANCE;
                                    if (str2 != null && !StringsKt.isBlank(str2)) {
                                        builder.append(' ');
                                        builder.pushStringAnnotation("ctaTextAction", str2);
                                        iPushStyle = builder.pushStyle(new SpanStyle(j4, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null));
                                        try {
                                            builder.append(str2);
                                            builder.pop(iPushStyle);
                                            builder.pop();
                                        } finally {
                                        }
                                    }
                                    BentoText2.m20748BentoTextQnj7Zds(builder.toAnnotatedString(), null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, null, ((Styles) composer2.consume(Styles2.getLocalStyles())).getInfoBanner(composer2, 0).getTypography().getTextStyle(), composer2, 0, 0, 8186);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } finally {
                                }
                            }
                        }, composerStartRestartGroup, 54), modifier42, bentoIcon44, function072, function06, composerStartRestartGroup, (i92 & 112) | (i92 & 14) | 384 | (i102 & 7168) | (57344 & i102) | (458752 & i102) | (i102 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        bentoIcon43 = bentoIcon44;
                        function03 = function072;
                        function04 = function06;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                bentoIcon42 = bentoIcon4;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i7;
                if ((i3 & 4793491) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            bentoIcon42 = bentoIcon4;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i3 & 4793491) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        j3 = j2;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        bentoIcon42 = bentoIcon4;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i3 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /* renamed from: BentoInfoBanner-RakH_j8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20652BentoInfoBannerRakH_j8(final String markdownText, final long j, final long j2, Modifier modifier, BentoIcon4 bentoIcon4, Function0<Unit> function0, Function0<Unit> function02, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        long j4;
        int i4;
        Modifier modifier2;
        int i5;
        BentoIcon4 bentoIcon42;
        int i6;
        Function0<Unit> function03;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        final Function0<Unit> function04;
        final Function1<? super String, Unit> function12;
        final Modifier modifier3;
        final BentoIcon4 bentoIcon43;
        final Function0<Unit> function05;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(markdownText, "markdownText");
        Composer composerStartRestartGroup = composer.startRestartGroup(1050857219);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(markdownText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j3 = j;
        } else {
            j3 = j;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(j3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                j4 = j2;
                i3 |= composerStartRestartGroup.changed(j4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        bentoIcon42 = bentoIcon4;
                        i3 |= composerStartRestartGroup.changed(bentoIcon42) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            function03 = function0;
                            i3 |= composerStartRestartGroup.changedInstance(function03) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 == 0) {
                            if ((i & 12582912) == 0) {
                                i9 = i8;
                                i3 |= composerStartRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                            }
                            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                if (i4 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                BentoIcon4 bentoIcon44 = i5 == 0 ? null : bentoIcon42;
                                Function0<Unit> function06 = i6 == 0 ? null : function03;
                                Function0<Unit> function07 = i7 == 0 ? null : function02;
                                Function1<? super String, Unit> function13 = i9 == 0 ? function1 : null;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1050857219, i3, -1, "com.robinhood.compose.bento.component.BentoInfoBanner (BentoInfoBanner.kt:153)");
                                }
                                final Function1<? super String, Unit> function14 = function13;
                                final Function0<Unit> function08 = function07;
                                final long j5 = j3;
                                int i10 = i3 >> 3;
                                composer2 = composerStartRestartGroup;
                                Modifier modifier4 = modifier2;
                                m20656BentoInfoBannerLayoutY2T6KM0(j, j4, ComposableLambda3.rememberComposableLambda(-266838720, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$BentoInfoBanner$5
                                    public final void invoke(Composer composer3, int i11) {
                                        if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-266838720, i11, -1, "com.robinhood.compose.bento.component.BentoInfoBanner.<anonymous> (BentoInfoBanner.kt:161)");
                                        }
                                        String str = markdownText;
                                        long j6 = j5;
                                        Function0<Unit> function09 = function08;
                                        Function1<String, Unit> function15 = function14;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(((Styles) composer3.consume(Styles2.getLocalStyles())).getInfoBanner(composer3, 0).getTypography().getTextStyle(), 0, j6, j6, false, composer3, 196608, 18), function09, function15, composer3, MarkdownStyle.$stable << 6, 2);
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composerStartRestartGroup, 54), modifier4, bentoIcon44, null, function06, composer2, (i10 & 112) | (i10 & 14) | 384 | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016), 32);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function04 = function08;
                                function12 = function14;
                                modifier3 = modifier4;
                                bentoIcon43 = bentoIcon44;
                                function05 = function06;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                function12 = function1;
                                composer2 = composerStartRestartGroup;
                                modifier3 = modifier2;
                                bentoIcon43 = bentoIcon42;
                                function05 = function03;
                                function04 = function02;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return BentoInfoBanner2.BentoInfoBanner_RakH_j8$lambda$2(markdownText, j, j2, modifier3, bentoIcon43, function05, function04, function12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i9 = i8;
                        if ((i3 & 4793491) == 4793490) {
                            if (i4 != 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final Function1<? super String, Unit> function142 = function13;
                            final Function0<Unit> function082 = function07;
                            final long j52 = j3;
                            int i102 = i3 >> 3;
                            composer2 = composerStartRestartGroup;
                            Modifier modifier42 = modifier2;
                            m20656BentoInfoBannerLayoutY2T6KM0(j, j4, ComposableLambda3.rememberComposableLambda(-266838720, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$BentoInfoBanner$5
                                public final void invoke(Composer composer3, int i11) {
                                    if ((i11 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-266838720, i11, -1, "com.robinhood.compose.bento.component.BentoInfoBanner.<anonymous> (BentoInfoBanner.kt:161)");
                                    }
                                    String str = markdownText;
                                    long j6 = j52;
                                    Function0<Unit> function09 = function082;
                                    Function1<String, Unit> function15 = function142;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(((Styles) composer3.consume(Styles2.getLocalStyles())).getInfoBanner(composer3, 0).getTypography().getTextStyle(), 0, j6, j6, false, composer3, 196608, 18), function09, function15, composer3, MarkdownStyle.$stable << 6, 2);
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composerStartRestartGroup, 54), modifier42, bentoIcon44, null, function06, composer2, (i102 & 112) | (i102 & 14) | 384 | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016), 32);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function04 = function082;
                            function12 = function142;
                            modifier3 = modifier42;
                            bentoIcon43 = bentoIcon44;
                            function05 = function06;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function03 = function0;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    if ((i3 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                bentoIcon42 = bentoIcon4;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function03 = function0;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            bentoIcon42 = bentoIcon4;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function03 = function0;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        j4 = j2;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        bentoIcon42 = bentoIcon4;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function03 = function0;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0148  */
    /* renamed from: BentoInfoBannerLayout-Y2T6KM0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m20656BentoInfoBannerLayoutY2T6KM0(long j, final long j2, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, BentoIcon4 bentoIcon4, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        BentoIcon4 bentoIcon42;
        int i5;
        Function0<Unit> function03;
        int i6;
        Function0<Unit> function04;
        Function0<Unit> function05;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        RoundedCornerShape mainContentShapeWithoutDismiss;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final long j3;
        Modifier modifier3;
        int i7;
        BentoIcon4 bentoIcon43;
        final BentoIcon4 bentoIcon44;
        Composer composer2;
        final Function0<Unit> function06;
        final Modifier modifier4;
        final Function0<Unit> function07;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(718442520);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    bentoIcon42 = bentoIcon4;
                    i3 |= composerStartRestartGroup.changed(bentoIcon42) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        function03 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function03) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) != 599186 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        j3 = j;
                        function06 = function02;
                        modifier4 = modifier2;
                        composer2 = composerStartRestartGroup;
                        bentoIcon44 = bentoIcon42;
                        function07 = function03;
                    } else {
                        Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            bentoIcon42 = null;
                        }
                        function04 = i5 == 0 ? null : function03;
                        function05 = i6 == 0 ? null : function02;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(718442520, i3, -1, "com.robinhood.compose.bento.component.BentoInfoBannerLayout (BentoInfoBanner.kt:186)");
                        }
                        Modifier modifierHeight = Intrinsic3.height(modifier5, Intrinsic4.Min);
                        BentoInfoBanner bentoInfoBanner = BentoInfoBanner.INSTANCE;
                        Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifierHeight, j2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoInfoBanner.m20647getCornerRadiusD9Ej5fM()));
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Modifier modifier6 = modifier5;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        Modifier modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                        Modifier modifierWeight$default = Row5.weight$default(row6, TestTag3.testTag(modifierM4893clickableXHw0xAI$default, InfoBannerMainContentTag), 1.0f, false, 2, null);
                        if (function05 == null) {
                            mainContentShapeWithoutDismiss = bentoInfoBanner.getMainContentShapeWithDismiss();
                        } else {
                            mainContentShapeWithoutDismiss = bentoInfoBanner.getMainContentShapeWithoutDismiss();
                        }
                        Modifier modifierClip = Clip.clip(modifierWeight$default, mainContentShapeWithoutDismiss);
                        if (function04 == null) {
                            modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4893clickableXHw0xAI$default, false, null, null, function04, 7, null);
                        }
                        Modifier modifierPadding = PaddingKt.padding(modifierClip.then(modifierM4893clickableXHw0xAI$default), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getSpacing().getPadding());
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getSpacing().m21803getSpaceBetweenItemsD9Ej5fM()), companion.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding);
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        composerStartRestartGroup.startReplaceGroup(-873008166);
                        if (bentoIcon42 == null) {
                            bentoIcon43 = bentoIcon42;
                            modifier3 = modifier6;
                            i7 = i3;
                            BentoIcon2.m20644BentoIconFU0evQE(bentoIcon43, null, j, null, null, false, composerStartRestartGroup, ((i3 >> 12) & 14) | 48 | ((i3 << 6) & 896), 56);
                            j3 = j;
                        } else {
                            j3 = j;
                            modifier3 = modifier6;
                            i7 = i3;
                            bentoIcon43 = bentoIcon42;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 6) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(955511453);
                        if (function05 != null) {
                            m20655BentoInfoBannerDismissButtonRPmYEkk(function05, j3, composerStartRestartGroup, ((i7 >> 18) & 14) | ((i7 << 3) & 112));
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        bentoIcon44 = bentoIcon43;
                        composer2 = composerStartRestartGroup;
                        function06 = function05;
                        modifier4 = modifier3;
                        function07 = function04;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoInfoBanner2.BentoInfoBannerLayout_Y2T6KM0$lambda$5(j3, j2, function2, modifier4, bentoIcon44, function07, function06, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                function03 = function0;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i3 & 599187) != 599186) {
                    if (i8 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierHeight2 = Intrinsic3.height(modifier5, Intrinsic4.Min);
                    BentoInfoBanner bentoInfoBanner2 = BentoInfoBanner.INSTANCE;
                    Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(modifierHeight2, j2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoInfoBanner2.m20647getCornerRadiusD9Ej5fM()));
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Modifier modifier62 = modifier5;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        Modifier modifierM4893clickableXHw0xAI$default2 = Modifier.INSTANCE;
                        Modifier modifierWeight$default2 = Row5.weight$default(row62, TestTag3.testTag(modifierM4893clickableXHw0xAI$default2, InfoBannerMainContentTag), 1.0f, false, 2, null);
                        if (function05 == null) {
                        }
                        Modifier modifierClip2 = Clip.clip(modifierWeight$default2, mainContentShapeWithoutDismiss);
                        if (function04 == null) {
                        }
                        Modifier modifierPadding2 = PaddingKt.padding(modifierClip2.then(modifierM4893clickableXHw0xAI$default2), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getSpacing().getPadding());
                        MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getSpacing().m21803getSpaceBetweenItemsD9Ej5fM()), companion3.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            composerStartRestartGroup.startReplaceGroup(-873008166);
                            if (bentoIcon42 == null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 6) & 14));
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.startReplaceGroup(955511453);
                            if (function05 != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            bentoIcon44 = bentoIcon43;
                            composer2 = composerStartRestartGroup;
                            function06 = function05;
                            modifier4 = modifier3;
                            function07 = function04;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            bentoIcon42 = bentoIcon4;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            function03 = function0;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i3 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        bentoIcon42 = bentoIcon4;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        function03 = function0;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i3 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: BentoInfoBannerDismissButton-RPmYEkk, reason: not valid java name */
    private static final void m20655BentoInfoBannerDismissButtonRPmYEkk(final Function0<Unit> function0, final long j, Composer composer, final int i) {
        int i2;
        final long j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-469978999);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-469978999, i3, -1, "com.robinhood.compose.bento.component.BentoInfoBannerDismissButton (BentoInfoBanner.kt:244)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, InfoBannerDismissTag);
            BentoInfoBanner bentoInfoBanner = BentoInfoBanner.INSTANCE;
            int i4 = (i3 & 14) | 818089008;
            j2 = j;
            ButtonKt.Button(function0, SizeKt.fillMaxHeight$default(SizeKt.m5174width3ABfNKs(modifierTestTag, bentoInfoBanner.m20648getDismissWidthD9Ej5fM()), 0.0f, 1, null), false, bentoInfoBanner.getDismissButtonShape(), ButtonDefaults.INSTANCE.m5719buttonColorsro_MJ88(Color.INSTANCE.m6725getTransparent0d7_KjU(), j, 0L, 0L, composerStartRestartGroup, (i3 & 112) | 6 | (ButtonDefaults.$stable << 12), 12), null, null, PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)), null, ComposableLambda3.rememberComposableLambda(69121145, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$BentoInfoBannerDismissButton$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                    invoke(row5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 Button, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(69121145, i5, -1, "com.robinhood.compose.bento.component.BentoInfoBannerDismissButton.<anonymous> (BentoInfoBanner.kt:259)");
                    }
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CLOSE_16), StringResources_androidKt.stringResource(C11917R.string.content_description_dismiss, composer2, 0), j, null, null, false, composer2, 0, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i4, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            j2 = j;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoInfoBanner2.BentoInfoBannerDismissButton_RPmYEkk$lambda$6(function0, j2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoUrgentInfoBanner(Modifier modifier, final String text, BentoIcon4 bentoIcon4, final String str, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        BentoIcon4 bentoIcon42;
        int i4;
        Function0<Unit> function02;
        final BentoIcon4 bentoIcon43;
        final Function0<Unit> function03;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-310569792);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                bentoIcon42 = bentoIcon4;
                i3 |= composerStartRestartGroup.changed(bentoIcon42) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 == 0) {
                    if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i6 != 0) {
                            bentoIcon42 = null;
                        }
                        if (i4 != 0) {
                            function02 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-310569792, i3, -1, "com.robinhood.compose.bento.component.BentoUrgentInfoBanner (BentoInfoBanner.kt:278)");
                        }
                        int i7 = i3 & 65520;
                        Function0<Unit> function04 = function02;
                        BentoIcon4 bentoIcon44 = bentoIcon42;
                        m20653BentoInfoBannerSxpAMN0(LocalShowPlaceholder.withBentoPlaceholder$default(modifier4, false, null, 3, null), text, bentoIcon44, str, function04, null, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21799getUrgentForeground0d7_KjU(), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21798getUrgentBackground0d7_KjU(), composerStartRestartGroup, i7, 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        bentoIcon43 = bentoIcon44;
                        function03 = function04;
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        bentoIcon43 = bentoIcon42;
                        function03 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoInfoBanner2.BentoUrgentInfoBanner$lambda$7(modifier3, text, bentoIcon43, str, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function02 = function0;
                if ((i3 & 9363) == 9362) {
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i72 = i3 & 65520;
                    Function0<Unit> function042 = function02;
                    BentoIcon4 bentoIcon442 = bentoIcon42;
                    m20653BentoInfoBannerSxpAMN0(LocalShowPlaceholder.withBentoPlaceholder$default(modifier4, false, null, 3, null), text, bentoIcon442, str, function042, null, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21799getUrgentForeground0d7_KjU(), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21798getUrgentBackground0d7_KjU(), composerStartRestartGroup, i72, 32);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    bentoIcon43 = bentoIcon442;
                    function03 = function042;
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i4 = i2 & 16;
            if (i4 == 0) {
            }
            function02 = function0;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        bentoIcon42 = bentoIcon4;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoDismissableInfoBanner(Modifier modifier, final String text, BentoIcon4 bentoIcon4, final String str, Function0<Unit> function0, final Function0<Unit> onDismissClicked, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        BentoIcon4 bentoIcon42;
        String str2;
        int i4;
        Function0<Unit> function02;
        final Modifier modifier3;
        final BentoIcon4 bentoIcon43;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onDismissClicked, "onDismissClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1248973279);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                bentoIcon42 = bentoIcon4;
                i3 |= composerStartRestartGroup.changed(bentoIcon42) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 == 0) {
                    if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(onDismissClicked) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i6 != 0) {
                            bentoIcon42 = null;
                        }
                        if (i4 != 0) {
                            function02 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1248973279, i3, -1, "com.robinhood.compose.bento.component.BentoDismissableInfoBanner (BentoInfoBanner.kt:304)");
                        }
                        int i7 = 524286 & i3;
                        Function0<Unit> function04 = function02;
                        Modifier modifier5 = modifier4;
                        BentoIcon4 bentoIcon44 = bentoIcon42;
                        m20653BentoInfoBannerSxpAMN0(modifier5, text, bentoIcon44, str2, function04, onDismissClicked, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21797getDefaultForeground0d7_KjU(), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21796getDefaultBackground0d7_KjU(), composerStartRestartGroup, i7, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        bentoIcon43 = bentoIcon44;
                        function03 = function04;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        bentoIcon43 = bentoIcon42;
                        function03 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoInfoBanner2.BentoDismissableInfoBanner$lambda$8(modifier3, text, bentoIcon43, str, function03, onDismissClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function02 = function0;
                if ((i2 & 32) == 0) {
                }
                if ((74899 & i3) == 74898) {
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i72 = 524286 & i3;
                    Function0<Unit> function042 = function02;
                    Modifier modifier52 = modifier4;
                    BentoIcon4 bentoIcon442 = bentoIcon42;
                    m20653BentoInfoBannerSxpAMN0(modifier52, text, bentoIcon442, str2, function042, onDismissClicked, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21797getDefaultForeground0d7_KjU(), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21796getDefaultBackground0d7_KjU(), composerStartRestartGroup, i72, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    bentoIcon43 = bentoIcon442;
                    function03 = function042;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str2 = str;
            i4 = i2 & 16;
            if (i4 == 0) {
            }
            function02 = function0;
            if ((i2 & 32) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        bentoIcon42 = bentoIcon4;
        if ((i2 & 8) == 0) {
        }
        str2 = str;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoPinnedInfoBanner(Modifier modifier, final String text, BentoIcon4 bentoIcon4, final String str, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        BentoIcon4 bentoIcon42;
        int i4;
        Function0<Unit> function02;
        final Modifier modifier3;
        final BentoIcon4 bentoIcon43;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1751245705);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                bentoIcon42 = bentoIcon4;
                i3 |= composerStartRestartGroup.changed(bentoIcon42) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 == 0) {
                    if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i6 != 0) {
                            bentoIcon42 = null;
                        }
                        if (i4 != 0) {
                            function02 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1751245705, i3, -1, "com.robinhood.compose.bento.component.BentoPinnedInfoBanner (BentoInfoBanner.kt:329)");
                        }
                        int i7 = 65534 & i3;
                        Modifier modifier5 = modifier4;
                        BentoIcon4 bentoIcon44 = bentoIcon42;
                        Function0<Unit> function04 = function02;
                        m20653BentoInfoBannerSxpAMN0(modifier5, text, bentoIcon44, str, function04, null, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21797getDefaultForeground0d7_KjU(), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21796getDefaultBackground0d7_KjU(), composerStartRestartGroup, i7, 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        bentoIcon43 = bentoIcon44;
                        function03 = function04;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        bentoIcon43 = bentoIcon42;
                        function03 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoInfoBanner2.BentoPinnedInfoBanner$lambda$9(modifier3, text, bentoIcon43, str, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function02 = function0;
                if ((i3 & 9363) == 9362) {
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i72 = 65534 & i3;
                    Modifier modifier52 = modifier4;
                    BentoIcon4 bentoIcon442 = bentoIcon42;
                    Function0<Unit> function042 = function02;
                    m20653BentoInfoBannerSxpAMN0(modifier52, text, bentoIcon442, str, function042, null, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21797getDefaultForeground0d7_KjU(), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21796getDefaultBackground0d7_KjU(), composerStartRestartGroup, i72, 32);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    bentoIcon43 = bentoIcon442;
                    function03 = function042;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i4 = i2 & 16;
            if (i4 == 0) {
            }
            function02 = function0;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        bentoIcon42 = bentoIcon4;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void BentoInfoBannerPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-158971864);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-158971864, i, -1, "com.robinhood.compose.bento.component.BentoInfoBannerPreview (BentoInfoBanner.kt:378)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoInfoBanner7.INSTANCE.getLambda$728320880$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoInfoBannerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoInfoBanner2.BentoInfoBannerPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
