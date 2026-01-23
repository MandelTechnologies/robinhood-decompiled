package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
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
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.extensions.ResourceTypes;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoValuePropRow.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001a;\u0010\u000b\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u000b\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\r\u001aQ\u0010\u0015\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\n0\u000ej\u0002`\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aM\u0010\u000b\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0004\b\u0016\u0010\u0014\u001a#\u0010\u001a\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001c\u0010\u001e\u001a\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\nH\u0001¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\nH\u0001¢\u0006\u0004\b#\u0010\"\u001a\u000f\u0010$\u001a\u00020\nH\u0007¢\u0006\u0004\b$\u0010\"\u001a1\u0010)\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b)\u0010*\"\u0014\u0010+\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010,\"\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\"\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;\"\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>*\u0016\u0010?\"\b\u0012\u0004\u0012\u00020\n0\u000e2\b\u0012\u0004\u0012\u00020\n0\u000e¨\u0006@"}, m3636d2 = {"", "title", "Landroidx/compose/ui/text/AnnotatedString;", CarResultComposable2.BODY, "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;", "bullet", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowAlignment;", "alignment", "Landroidx/compose/ui/Modifier;", "modifier", "", "BentoValuePropRow", "(Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowAlignment;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowAlignment;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "Lcom/robinhood/compose/bento/component/rows/ValuePropMarkdownOrRichtextBody;", "bodyContent", "Landroidx/compose/ui/graphics/Color;", "titleColor", "BentoValuePropRowWithMarkdownOrRichtext-FV1VA1c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowAlignment;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "BentoValuePropRowWithMarkdownOrRichtext", "BentoValuePropRow-FV1VA1c", ResourceTypes.COLOR, "ValuePropTitle-bMF-p3s", "(Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;I)V", "ValuePropTitle", "text", "ValuePropTextBody", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/runtime/Composer;I)V", "ValuePropBullet", "(Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "BentoValuePropRowPreviewDay", "(Landroidx/compose/runtime/Composer;I)V", "BentoValuePropRowPreviewNight", "ValuePropPreviews", "startBullet", "", "showTitle", "useAnnotatedBody", "ValuePropRowPreview", "(Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;ZZLcom/robinhood/compose/bento/component/rows/BentoValuePropRowAlignment;Landroidx/compose/runtime/Composer;II)V", "titleText", "Ljava/lang/String;", "bodyText", "annotatedBodyText", "Landroidx/compose/ui/text/AnnotatedString;", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Pog;", "pog", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Pog;", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Icon;", "icon", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Icon;", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Checkmark;", "checkmark", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Checkmark;", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Number;", InquiryField.FloatField.TYPE2, "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Number;", "", "bullets", "Ljava/util/List;", "ValuePropMarkdownOrRichtextBody", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoValuePropRow3 {
    private static final AnnotatedString annotatedBodyText;
    private static final String bodyText = "Body content lorem ipsum dolor sit amet, consectetur adipiscing elit.";
    private static final List<BentoValuePropRow2> bullets;
    private static final BentoValuePropRow2.Checkmark checkmark;
    private static final BentoValuePropRow2.Icon icon;
    private static final BentoValuePropRow2.Number number;
    private static final BentoValuePropRow2.Pog pog;
    private static final String titleText = "Title";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoValuePropRow$lambda$0(String str, AnnotatedString annotatedString, BentoValuePropRow2 bentoValuePropRow2, BentoValuePropRow bentoValuePropRow, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BentoValuePropRow(str, annotatedString, bentoValuePropRow2, bentoValuePropRow, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoValuePropRow$lambda$1(String str, String str2, BentoValuePropRow2 bentoValuePropRow2, BentoValuePropRow bentoValuePropRow, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BentoValuePropRow(str, str2, bentoValuePropRow2, bentoValuePropRow, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoValuePropRowPreviewDay$lambda$12(int i, Composer composer, int i2) {
        BentoValuePropRowPreviewDay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoValuePropRowPreviewNight$lambda$13(int i, Composer composer, int i2) {
        BentoValuePropRowPreviewNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoValuePropRowWithMarkdownOrRichtext_FV1VA1c$lambda$2(String str, Function2 function2, BentoValuePropRow2 bentoValuePropRow2, BentoValuePropRow bentoValuePropRow, Modifier modifier, Color color, int i, int i2, Composer composer, int i3) {
        m21026BentoValuePropRowWithMarkdownOrRichtextFV1VA1c(str, function2, bentoValuePropRow2, bentoValuePropRow, modifier, color, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoValuePropRow_FV1VA1c$lambda$6(String str, Function2 function2, BentoValuePropRow2 bentoValuePropRow2, BentoValuePropRow bentoValuePropRow, Modifier modifier, Color color, int i, int i2, Composer composer, int i3) {
        m21025BentoValuePropRowFV1VA1c(str, function2, bentoValuePropRow2, bentoValuePropRow, modifier, color, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValuePropBullet$lambda$11(BentoValuePropRow2 bentoValuePropRow2, Modifier modifier, int i, Composer composer, int i2) {
        ValuePropBullet(bentoValuePropRow2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValuePropPreviews$lambda$18(int i, Composer composer, int i2) {
        ValuePropPreviews(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValuePropRowPreview$lambda$19(BentoValuePropRow2 bentoValuePropRow2, boolean z, boolean z2, BentoValuePropRow bentoValuePropRow, int i, int i2, Composer composer, int i3) {
        ValuePropRowPreview(bentoValuePropRow2, z, z2, bentoValuePropRow, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValuePropTextBody$lambda$8(String str, int i, Composer composer, int i2) {
        ValuePropTextBody(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValuePropTextBody$lambda$9(AnnotatedString annotatedString, int i, Composer composer, int i2) {
        ValuePropTextBody(annotatedString, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValuePropTitle_bMF_p3s$lambda$7(String str, Color color, int i, Composer composer, int i2) {
        m21027ValuePropTitlebMFp3s(str, color, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoValuePropRow(final String str, final AnnotatedString body, final BentoValuePropRow2 bullet, final BentoValuePropRow alignment, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(bullet, "bullet");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1697289913);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(body) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(bullet) : composerStartRestartGroup.changedInstance(bullet) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(alignment.ordinal()) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1697289913, i3, -1, "com.robinhood.compose.bento.component.rows.BentoValuePropRow (BentoValuePropRow.kt:45)");
                }
                m21025BentoValuePropRowFV1VA1c(str, ComposableLambda3.rememberComposableLambda(1997232743, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt.BentoValuePropRow.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1997232743, i5, -1, "com.robinhood.compose.bento.component.rows.BentoValuePropRow.<anonymous> (BentoValuePropRow.kt:47)");
                        }
                        BentoValuePropRow3.ValuePropTextBody(body, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), bullet, alignment, modifier4, null, composerStartRestartGroup, (i3 & 14) | 48 | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoValuePropRow3.BentoValuePropRow$lambda$0(str, body, bullet, alignment, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            m21025BentoValuePropRowFV1VA1c(str, ComposableLambda3.rememberComposableLambda(1997232743, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt.BentoValuePropRow.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1997232743, i5, -1, "com.robinhood.compose.bento.component.rows.BentoValuePropRow.<anonymous> (BentoValuePropRow.kt:47)");
                    }
                    BentoValuePropRow3.ValuePropTextBody(body, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), bullet, alignment, modifier4, null, composerStartRestartGroup, (i3 & 14) | 48 | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 32);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoValuePropRow(final String str, final String body, final BentoValuePropRow2 bullet, final BentoValuePropRow alignment, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(bullet, "bullet");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Composer composerStartRestartGroup = composer.startRestartGroup(2045697297);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(body) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(bullet) : composerStartRestartGroup.changedInstance(bullet) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(alignment.ordinal()) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2045697297, i3, -1, "com.robinhood.compose.bento.component.rows.BentoValuePropRow (BentoValuePropRow.kt:60)");
                }
                m21025BentoValuePropRowFV1VA1c(str, ComposableLambda3.rememberComposableLambda(816785393, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt.BentoValuePropRow.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(816785393, i5, -1, "com.robinhood.compose.bento.component.rows.BentoValuePropRow.<anonymous> (BentoValuePropRow.kt:62)");
                        }
                        BentoValuePropRow3.ValuePropTextBody(body, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), bullet, alignment, modifier4, null, composerStartRestartGroup, (i3 & 14) | 48 | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoValuePropRow3.BentoValuePropRow$lambda$1(str, body, bullet, alignment, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            m21025BentoValuePropRowFV1VA1c(str, ComposableLambda3.rememberComposableLambda(816785393, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt.BentoValuePropRow.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(816785393, i5, -1, "com.robinhood.compose.bento.component.rows.BentoValuePropRow.<anonymous> (BentoValuePropRow.kt:62)");
                    }
                    BentoValuePropRow3.ValuePropTextBody(body, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), bullet, alignment, modifier4, null, composerStartRestartGroup, (i3 & 14) | 48 | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 32);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: BentoValuePropRowWithMarkdownOrRichtext-FV1VA1c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21026BentoValuePropRowWithMarkdownOrRichtextFV1VA1c(final String str, final Function2<? super Composer, ? super Integer, Unit> bodyContent, final BentoValuePropRow2 bullet, final BentoValuePropRow alignment, Modifier modifier, Color color, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Color color2;
        Composer composer2;
        final Color color3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(bodyContent, "bodyContent");
        Intrinsics.checkNotNullParameter(bullet, "bullet");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Composer composerStartRestartGroup = composer.startRestartGroup(1709730207);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(bodyContent) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(bullet) : composerStartRestartGroup.changedInstance(bullet) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(alignment.ordinal()) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    color2 = color;
                    i3 |= composerStartRestartGroup.changed(color2) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    color3 = color2;
                } else {
                    Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    Color color4 = i4 == 0 ? null : color2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1709730207, i3, -1, "com.robinhood.compose.bento.component.rows.BentoValuePropRowWithMarkdownOrRichtext (BentoValuePropRow.kt:81)");
                    }
                    m21025BentoValuePropRowFV1VA1c(str, bodyContent, bullet, alignment, modifier3, color4, composerStartRestartGroup, i3 & 524286, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = composerStartRestartGroup;
                    color3 = color4;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoValuePropRow3.BentoValuePropRowWithMarkdownOrRichtext_FV1VA1c$lambda$2(str, bodyContent, bullet, alignment, modifier2, color3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            color2 = color;
            if ((74899 & i3) == 74898) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                m21025BentoValuePropRowFV1VA1c(str, bodyContent, bullet, alignment, modifier3, color4, composerStartRestartGroup, i3 & 524286, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = composerStartRestartGroup;
                color3 = color4;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        color2 = color;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /* renamed from: BentoValuePropRow-FV1VA1c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21025BentoValuePropRowFV1VA1c(final String str, final Function2<? super Composer, ? super Integer, Unit> body, final BentoValuePropRow2 bullet, final BentoValuePropRow alignment, Modifier modifier, Color color, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Color color2;
        Modifier modifier3;
        float fM7995constructorimpl;
        float fM7995constructorimpl2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(bullet, "bullet");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Composer composerStartRestartGroup = composer.startRestartGroup(1627147808);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(body) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(bullet) : composerStartRestartGroup.changedInstance(bullet) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(alignment.ordinal()) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    color2 = color;
                    i3 |= composerStartRestartGroup.changed(color2) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        color2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1627147808, i3, -1, "com.robinhood.compose.bento.component.rows.BentoValuePropRow (BentoValuePropRow.kt:102)");
                    }
                    boolean z = str == null;
                    if (!(bullet instanceof BentoValuePropRow2.Pog)) {
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(12);
                        fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(0);
                    } else {
                        if (!Intrinsics.areEqual(bullet, BentoValuePropRow2.Checkmark.INSTANCE) && !(bullet instanceof BentoValuePropRow2.Icon) && !(bullet instanceof BentoValuePropRow2.Number)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(8);
                        fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(z ? 12 : 0);
                    }
                    float f = fM7995constructorimpl2;
                    int i6 = i3 >> 12;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composerStartRestartGroup, i6 & 14, 1), 0.0f, 1, null);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, fM7995constructorimpl, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                    int i7 = i3;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    float f2 = 24;
                    ValuePropBullet(bullet, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Row6.INSTANCE.align(SizeKt.m5154defaultMinSizeVpY3zN4(companion3, C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f2)), (z && alignment == BentoValuePropRow.Center) ? companion.getCenterVertically() : companion.getTop()), 0.0f, f, 0.0f, 0.0f, 13, null), composerStartRestartGroup, (i7 >> 6) & 14);
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, C2002Dp.m7995constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor3);
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    m21027ValuePropTitlebMFp3s(str, color2, composerStartRestartGroup, (i7 & 14) | (i6 & 112));
                    body.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                final Color color3 = color2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoValuePropRow3.BentoValuePropRow_FV1VA1c$lambda$6(str, body, bullet, alignment, modifier4, color3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            color2 = color;
            if ((74899 & i3) == 74898) {
                if (i5 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (str == null) {
                }
                if (!(bullet instanceof BentoValuePropRow2.Pog)) {
                }
                float f3 = fM7995constructorimpl2;
                int i62 = i3 >> 12;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composerStartRestartGroup, i62 & 14, 1), 0.0f, 1, null);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierM5144paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion32, 0.0f, fM7995constructorimpl, 1, null);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                    int i72 = i3;
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        if (z) {
                            float f22 = 24;
                            ValuePropBullet(bullet, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Row6.INSTANCE.align(SizeKt.m5154defaultMinSizeVpY3zN4(companion32, C2002Dp.m7995constructorimpl(f22), C2002Dp.m7995constructorimpl(f22)), (z && alignment == BentoValuePropRow.Center) ? companion4.getCenterVertically() : companion4.getTop()), 0.0f, f3, 0.0f, 0.0f, 13, null), composerStartRestartGroup, (i72 >> 6) & 14);
                            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion32, C2002Dp.m7995constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                            Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting()) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                m21027ValuePropTitlebMFp3s(str, color2, composerStartRestartGroup, (i72 & 14) | (i62 & 112));
                                body.invoke(composerStartRestartGroup, Integer.valueOf((i72 >> 3) & 14));
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }
                    }
                }
            }
            final Color color32 = color2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        color2 = color;
        if ((74899 & i3) == 74898) {
        }
        final Color color322 = color2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* renamed from: ValuePropTitle-bMF-p3s, reason: not valid java name */
    private static final void m21027ValuePropTitlebMFp3s(final String str, final Color color, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1091559793);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(color) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1091559793, i2, -1, "com.robinhood.compose.bento.component.rows.ValuePropTitle (BentoValuePropRow.kt:152)");
            }
            if (str != null) {
                BentoText2.m20747BentoText38GnDrw(str, null, color, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, (i2 & 14) | 24576 | ((i2 << 3) & 896), 0, 16362);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoValuePropRow3.ValuePropTitle_bMF_p3s$lambda$7(str, color, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ValuePropTextBody(final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1592606569);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1592606569, i2, -1, "com.robinhood.compose.bento.component.rows.ValuePropTextBody (BentoValuePropRow.kt:159)");
            }
            BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i2 & 14, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoValuePropRow3.ValuePropTextBody$lambda$8(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ValuePropTextBody(final AnnotatedString annotatedString, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(579035145);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(annotatedString) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(579035145, i2, -1, "com.robinhood.compose.bento.component.rows.ValuePropTextBody (BentoValuePropRow.kt:164)");
            }
            BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, null, null, null, null, null, 0, false, 0, 0, null, null, null, composerStartRestartGroup, i2 & 14, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoValuePropRow3.ValuePropTextBody$lambda$9(annotatedString, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ValuePropBullet(final BentoValuePropRow2 bentoValuePropRow2, final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1505308238);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bentoValuePropRow2) : composerStartRestartGroup.changedInstance(bentoValuePropRow2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1505308238, i2, -1, "com.robinhood.compose.bento.component.rows.ValuePropBullet (BentoValuePropRow.kt:169)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (bentoValuePropRow2 instanceof BentoValuePropRow2.Icon) {
                composerStartRestartGroup.startReplaceGroup(-1065424426);
                Modifier modifierWithBentoCirclePlaceholder$default = LocalShowPlaceholder.withBentoCirclePlaceholder$default(Modifier.INSTANCE, false, 1, null);
                BentoValuePropRow2.Icon icon2 = (BentoValuePropRow2.Icon) bentoValuePropRow2;
                Painter painterPainterResource = PainterResources_androidKt.painterResource(icon2.getAsset().getResourceId(), composerStartRestartGroup, 0);
                Color color = icon2.getColor();
                composerStartRestartGroup.startReplaceGroup(2043847916);
                long jM21425getFg0d7_KjU = color == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU() : color.getValue();
                composerStartRestartGroup.endReplaceGroup();
                IconKt.m5871Iconww6aTOc(painterPainterResource, "", modifierWithBentoCirclePlaceholder$default, jM21425getFg0d7_KjU, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (bentoValuePropRow2 instanceof BentoValuePropRow2.Checkmark) {
                composerStartRestartGroup.startReplaceGroup(-1065108970);
                IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.CHECKMARK_24.getResourceId(), composerStartRestartGroup, 0), "", LocalShowPlaceholder.withBentoCirclePlaceholder$default(Modifier.INSTANCE, false, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21456getPositive0d7_KjU(), composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (bentoValuePropRow2 instanceof BentoValuePropRow2.Number) {
                composerStartRestartGroup.startReplaceGroup(2043861486);
                BentoPogKt.m20683BentoNumberPogxqIIw2o(((BentoValuePropRow2.Number) bentoValuePropRow2).getNumber(), null, false, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(bentoValuePropRow2 instanceof BentoValuePropRow2.Pog)) {
                    composerStartRestartGroup.startReplaceGroup(2043839931);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(2043864380);
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(((BentoValuePropRow2.Pog) bentoValuePropRow2).getAsset().getResourceId(), null, false, null, null, null, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoValuePropRow3.ValuePropBullet$lambda$11(bentoValuePropRow2, modifier, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoValuePropRowPreviewDay(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1345841591);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1345841591, i, -1, "com.robinhood.compose.bento.component.rows.BentoValuePropRowPreviewDay (BentoValuePropRow.kt:214)");
            }
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, BentoValuePropRow4.INSTANCE.getLambda$1176006033$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoValuePropRow3.BentoValuePropRowPreviewDay$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoValuePropRowPreviewNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2128389069);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2128389069, i, -1, "com.robinhood.compose.bento.component.rows.BentoValuePropRowPreviewNight (BentoValuePropRow.kt:222)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, BentoValuePropRow4.INSTANCE.m21038getLambda$1032566507$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoValuePropRow3.BentoValuePropRowPreviewNight$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ValuePropPreviews(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-683997270);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-683997270, i, -1, "com.robinhood.compose.bento.component.rows.ValuePropPreviews (BentoValuePropRow.kt:229)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composerStartRestartGroup, 6).m21371getBg0d7_KjU(), null, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw("Title, annotated body, top aligned", null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, 6).getDisplayCapsuleSmall(), composerStartRestartGroup, 6, 0, 8190);
            composerStartRestartGroup.startReplaceGroup(-471081870);
            Iterator<T> it = bullets.iterator();
            while (it.hasNext()) {
                ValuePropRowPreview((BentoValuePropRow2) it.next(), true, true, null, composerStartRestartGroup, 432, 8);
            }
            composerStartRestartGroup.endReplaceGroup();
            float f = 24;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(f)), composerStartRestartGroup, 6);
            BentoText2.m20747BentoText38GnDrw("No title, string body, top aligned", null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getDisplayCapsuleSmall(), composerStartRestartGroup, 6, 0, 8190);
            composerStartRestartGroup.startReplaceGroup(-471072364);
            Iterator<T> it2 = bullets.iterator();
            while (it2.hasNext()) {
                ValuePropRowPreview((BentoValuePropRow2) it2.next(), false, false, null, composerStartRestartGroup, 432, 8);
            }
            composerStartRestartGroup.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(f)), composerStartRestartGroup, 6);
            BentoText2.m20747BentoText38GnDrw("No title, string body, center aligned", null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getDisplayCapsuleSmall(), composerStartRestartGroup, 6, 0, 8190);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(-471062574);
            Iterator<T> it3 = bullets.iterator();
            while (it3.hasNext()) {
                ValuePropRowPreview((BentoValuePropRow2) it3.next(), false, false, BentoValuePropRow.Center, composerStartRestartGroup, 3504, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoValuePropRow3.ValuePropPreviews$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ValuePropRowPreview(BentoValuePropRow2 bentoValuePropRow2, final boolean z, final boolean z2, BentoValuePropRow bentoValuePropRow, Composer composer, final int i, final int i2) {
        int i3;
        BentoValuePropRow2 bentoValuePropRow22;
        final BentoValuePropRow bentoValuePropRow3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-309975350);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bentoValuePropRow2) : composerStartRestartGroup.changedInstance(bentoValuePropRow2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(bentoValuePropRow == null ? -1 : bentoValuePropRow.ordinal()) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                bentoValuePropRow = BentoValuePropRow.Top;
            }
            BentoValuePropRow bentoValuePropRow4 = bentoValuePropRow;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-309975350, i3, -1, "com.robinhood.compose.bento.component.rows.ValuePropRowPreview (BentoValuePropRow.kt:265)");
            }
            String str = z ? titleText : null;
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-295659354);
                bentoValuePropRow22 = bentoValuePropRow2;
                BentoValuePropRow(str, annotatedBodyText, bentoValuePropRow22, bentoValuePropRow4, (Modifier) null, composerStartRestartGroup, ((i3 << 6) & 896) | 48 | (i3 & 7168), 16);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                bentoValuePropRow22 = bentoValuePropRow2;
                composerStartRestartGroup.startReplaceGroup(-295477105);
                BentoValuePropRow(str, bodyText, bentoValuePropRow22, bentoValuePropRow4, (Modifier) null, composerStartRestartGroup, ((i3 << 6) & 896) | 48 | (i3 & 7168), 16);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            bentoValuePropRow3 = bentoValuePropRow4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            bentoValuePropRow22 = bentoValuePropRow2;
            bentoValuePropRow3 = bentoValuePropRow;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final BentoValuePropRow2 bentoValuePropRow23 = bentoValuePropRow22;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoValuePropRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoValuePropRow3.ValuePropRowPreview$lambda$19(bentoValuePropRow23, z, z2, bentoValuePropRow3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
        try {
            builder.append("Body content ");
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            builder.append("lorem ipsum dolor sit amet, consectetur adipiscing elit.");
            annotatedBodyText = builder.toAnnotatedString();
            BentoValuePropRow2.Pog pog2 = new BentoValuePropRow2.Pog(ServerToBentoAssetMapper3.MEGAPHONE);
            pog = pog2;
            BentoValuePropRow2.Icon icon2 = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null);
            icon = icon2;
            BentoValuePropRow2.Checkmark checkmark2 = BentoValuePropRow2.Checkmark.INSTANCE;
            checkmark = checkmark2;
            BentoValuePropRow2.Number number2 = new BentoValuePropRow2.Number(1);
            number = number2;
            bullets = CollectionsKt.listOf((Object[]) new BentoValuePropRow2[]{icon2, number2, checkmark2, pog2});
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }
}
