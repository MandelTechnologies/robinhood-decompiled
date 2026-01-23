package com.robinhood.compose.bento.component;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.portfolio.pnl.fixtures.ProfitAndLossTradeItemFixtures;
import com.robinhood.compose.bento.component.BentoPogBackgroundOverride;
import com.robinhood.compose.bento.component.BentoPogContent;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.PogStyle;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: BentoPog.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0012\u001aa\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001ac\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a[\u0010\u001a\u001a\u00020\u000e2\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a9\u0010\u001e\u001a\u00020\u000e2\b\b\u0001\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b!\u0010\"\u001a?\u0010.\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0015H\u0003¢\u0006\u0004\b,\u0010-\u001a'\u00100\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020/2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b0\u00101\u001a1\u00103\u001a\u00020\u000e2\u0006\u0010$\u001a\u0002022\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b3\u00104\u001a\u000f\u00105\u001a\u00020\u000eH\u0001¢\u0006\u0004\b5\u00106\u001a\u000f\u00107\u001a\u00020\u000eH\u0001¢\u0006\u0004\b7\u00106\u001a\u000f\u00108\u001a\u00020\u000eH\u0001¢\u0006\u0004\b8\u00106\u001a\u000f\u00109\u001a\u00020\u000eH\u0001¢\u0006\u0004\b9\u00106\u001a\u000f\u0010:\u001a\u00020\u000eH\u0001¢\u0006\u0004\b:\u00106\u001a\u0017\u0010<\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u0004H\u0003¢\u0006\u0004\b<\u0010=\u001a\u000f\u0010>\u001a\u00020\u000eH\u0001¢\u0006\u0004\b>\u00106\u001a\u000f\u0010?\u001a\u00020\u000eH\u0001¢\u0006\u0004\b?\u00106\u001a\u0017\u0010@\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u0004H\u0003¢\u0006\u0004\b@\u0010=\u001a\u000f\u0010A\u001a\u00020\u000eH\u0001¢\u0006\u0004\bA\u00106\u001a\u000f\u0010B\u001a\u00020\u000eH\u0001¢\u0006\u0004\bB\u00106\u001a\u000f\u0010C\u001a\u00020\u000eH\u0001¢\u0006\u0004\bC\u00106\u001a\u001f\u0010E\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0015H\u0003¢\u0006\u0004\bE\u0010F\u001a\u000f\u0010G\u001a\u00020\u000eH\u0001¢\u0006\u0004\bG\u00106\u001a\u000f\u0010H\u001a\u00020\u000eH\u0001¢\u0006\u0004\bH\u00106\u001a\u001d\u0010J\u001a\u00020\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0IH\u0003¢\u0006\u0004\bJ\u0010K\u001a\u000f\u0010L\u001a\u00020\u000eH\u0001¢\u0006\u0004\bL\u00106\"\u0014\u0010O\u001a\u00020\u001f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N\"\u0014\u0010Q\u001a\u00020\u001f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010N\"\u0014\u0010S\u001a\u00020\u001f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010N\"\u0014\u0010U\u001a\u00020\u001f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010N\"\u0014\u0010W\u001a\u00020\u001f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010N\"\u0014\u0010Y\u001a\u00020\u001f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010N¨\u0006[²\u0006\u000e\u0010Z\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "hasBorder", "Landroidx/compose/ui/graphics/Color;", "borderColor", "Lcom/robinhood/compose/bento/component/BentoPogSize;", "size", "Lcom/robinhood/compose/bento/component/BentoPogBackgroundOverride;", "backgroundOverride", "foregroundColorOverride", "", "BentoTextPog-ErYXqs8", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/graphics/Color;Lcom/robinhood/compose/bento/component/BentoPogSize;Lcom/robinhood/compose/bento/component/BentoPogBackgroundOverride;Landroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "BentoTextPog", "backgroundColorOverride", "BentoTextPog-TYpPzmw", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/graphics/Color;Lcom/robinhood/compose/bento/component/BentoPogSize;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "", "resource", "contentDescription", "BentoPictogramPog-Rhg8lNc", "(ILandroidx/compose/ui/Modifier;ZLcom/robinhood/compose/bento/component/BentoPogSize;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "BentoPictogramPog", InquiryField.FloatField.TYPE2, "BentoNumberPog-xqIIw2o", "(ILandroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "BentoNumberPog", "Lcom/robinhood/compose/bento/component/BentoPogState;", "state", "BentoPog", "(Lcom/robinhood/compose/bento/component/BentoPogState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/compose/bento/component/BentoPogContent$Text;", "content", "Lcom/robinhood/compose/theme/style/PogStyle$PogColors;", "colors", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/ui/unit/Dp;", "horizontalTextPadding", "maxLines", "TextPogContent-FJfuzF0", "(Lcom/robinhood/compose/bento/component/BentoPogContent$Text;Lcom/robinhood/compose/theme/style/PogStyle$PogColors;ZLandroidx/compose/ui/text/TextStyle;FILandroidx/compose/runtime/Composer;I)V", "TextPogContent", "Lcom/robinhood/compose/bento/component/BentoPogContent$Pictogram;", "PictogramPogContent", "(Lcom/robinhood/compose/bento/component/BentoPogContent$Pictogram;Lcom/robinhood/compose/theme/style/PogStyle$PogColors;ZLandroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/compose/bento/component/BentoPogContent$RemoteImage;", "RemoteImagePogContent", "(Lcom/robinhood/compose/bento/component/BentoPogContent$RemoteImage;Lcom/robinhood/compose/theme/style/PogStyle$PogColors;ZLcom/robinhood/compose/bento/component/BentoPogBackgroundOverride;Landroidx/compose/runtime/Composer;I)V", "PreviewTextPogDay", "(Landroidx/compose/runtime/Composer;I)V", "PreviewTextPogDayLoading", "PreviewTextPogNight", "PreviewTextPogNightLoading", "PreviewLongText", "isDay", "PreviewTextPogs", "(ZLandroidx/compose/runtime/Composer;I)V", "PreviewNumberPogsDay", "PreviewNumberPogsNight", "PreviewNumberPogs", "PreviewPictogramPogsMono", "PreviewPictogramPogsColor", "PreviewPictogramPogsColorLoading", "resId", "PictogramPogs", "(ZILandroidx/compose/runtime/Composer;I)V", "FigmaPogs", "PreviewTintedPog", "Lkotlin/Function0;", "DayNightHorizontal", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "PreviewBackgroundColorOverride", "getTestPog", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/BentoPogState;", "testPog", "getPog", "pog", "getPogDisabled", "pogDisabled", "getHeroPog", "heroPog", "getHeroPogDisabled", "heroPogDisabled", "getPogLongText", "pogLongText", "showBackupText", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class BentoPogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumberPog_xqIIw2o$lambda$6(int i, Modifier modifier, boolean z, Color color, int i2, int i3, Composer composer, int i4) {
        m20683BentoNumberPogxqIIw2o(i, modifier, z, color, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoPictogramPog_Rhg8lNc$lambda$4(int i, Modifier modifier, boolean z, BentoPogSize bentoPogSize, String str, Color color, Color color2, int i2, int i3, Composer composer, int i4) {
        m20684BentoPictogramPogRhg8lNc(i, modifier, z, bentoPogSize, str, color, color2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoPog$lambda$11(BentoPogState bentoPogState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BentoPog(bentoPogState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextPog_ErYXqs8$lambda$0(String str, Modifier modifier, boolean z, boolean z2, Color color, BentoPogSize bentoPogSize, BentoPogBackgroundOverride bentoPogBackgroundOverride, Color color2, int i, int i2, Composer composer, int i3) {
        m20685BentoTextPogErYXqs8(str, modifier, z, z2, color, bentoPogSize, bentoPogBackgroundOverride, color2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextPog_TYpPzmw$lambda$2(String str, Modifier modifier, boolean z, boolean z2, Color color, BentoPogSize bentoPogSize, Color color2, Color color3, int i, int i2, Composer composer, int i3) {
        m20686BentoTextPogTYpPzmw(str, modifier, z, z2, color, bentoPogSize, color2, color3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DayNightHorizontal$lambda$44(Function2 function2, int i, Composer composer, int i2) {
        DayNightHorizontal(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FigmaPogs$lambda$40(int i, Composer composer, int i2) {
        FigmaPogs(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PictogramPogContent$lambda$13(BentoPogContent.Pictogram pictogram, PogStyle.PogColors pogColors, boolean z, int i, Composer composer, int i2) {
        PictogramPogContent(pictogram, pogColors, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PictogramPogContent$lambda$15(BentoPogContent.Pictogram pictogram, PogStyle.PogColors pogColors, boolean z, int i, Composer composer, int i2) {
        PictogramPogContent(pictogram, pogColors, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PictogramPogs$lambda$36(boolean z, int i, int i2, Composer composer, int i3) {
        PictogramPogs(z, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBackgroundColorOverride$lambda$45(int i, Composer composer, int i2) {
        PreviewBackgroundColorOverride(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLongText$lambda$26(int i, Composer composer, int i2) {
        PreviewLongText(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewNumberPogs$lambda$30(boolean z, int i, Composer composer, int i2) {
        PreviewNumberPogs(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewNumberPogsDay$lambda$28(int i, Composer composer, int i2) {
        PreviewNumberPogsDay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewNumberPogsNight$lambda$29(int i, Composer composer, int i2) {
        PreviewNumberPogsNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPictogramPogsColor$lambda$34(int i, Composer composer, int i2) {
        PreviewPictogramPogsColor(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPictogramPogsColorLoading$lambda$35(int i, Composer composer, int i2) {
        PreviewPictogramPogsColorLoading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPictogramPogsMono$lambda$32(int i, Composer composer, int i2) {
        PreviewPictogramPogsMono(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTextPogDay$lambda$22(int i, Composer composer, int i2) {
        PreviewTextPogDay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTextPogDayLoading$lambda$23(int i, Composer composer, int i2) {
        PreviewTextPogDayLoading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTextPogNight$lambda$24(int i, Composer composer, int i2) {
        PreviewTextPogNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTextPogNightLoading$lambda$25(int i, Composer composer, int i2) {
        PreviewTextPogNightLoading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTextPogs$lambda$27(boolean z, int i, Composer composer, int i2) {
        PreviewTextPogs(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTintedPog$lambda$42(int i, Composer composer, int i2) {
        PreviewTintedPog(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RemoteImagePogContent$lambda$21(BentoPogContent.RemoteImage remoteImage, PogStyle.PogColors pogColors, boolean z, BentoPogBackgroundOverride bentoPogBackgroundOverride, int i, Composer composer, int i2) {
        RemoteImagePogContent(remoteImage, pogColors, z, bentoPogBackgroundOverride, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextPogContent_FJfuzF0$lambda$12(BentoPogContent.Text text, PogStyle.PogColors pogColors, boolean z, TextStyle textStyle, float f, int i, int i2, Composer composer, int i3) {
        m20687TextPogContentFJfuzF0(text, pogColors, z, textStyle, f, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    /* renamed from: BentoTextPog-ErYXqs8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20685BentoTextPogErYXqs8(final String text, Modifier modifier, boolean z, boolean z2, Color color, BentoPogSize bentoPogSize, final BentoPogBackgroundOverride bentoPogBackgroundOverride, Color color2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        Color color3;
        int i7;
        int i8;
        Color color4;
        final Color color5;
        final BentoPogSize bentoPogSize2;
        final boolean z5;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1452675362);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            color3 = color;
                            i3 |= composerStartRestartGroup.changed(color3) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changed(bentoPogSize == null ? -1 : bentoPogSize.ordinal()) ? 131072 : 65536;
                        }
                        if ((i2 & 64) == 0) {
                            if ((i & 1572864) == 0) {
                                i3 |= composerStartRestartGroup.changed(bentoPogBackgroundOverride) ? 1048576 : 524288;
                            }
                            i8 = i2 & 128;
                            if (i8 == 0) {
                                i3 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                i3 |= composerStartRestartGroup.changed(color2) ? 8388608 : 4194304;
                            }
                            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                if (i9 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                boolean z7 = i4 == 0 ? true : z3;
                                boolean z8 = i5 == 0 ? false : z4;
                                color4 = i6 == 0 ? null : color3;
                                BentoPogSize bentoPogSize3 = i7 == 0 ? BentoPogSize.Standard : bentoPogSize;
                                Color color6 = i8 == 0 ? null : color2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1452675362, i3, -1, "com.robinhood.compose.bento.component.BentoTextPog (BentoPog.kt:60)");
                                }
                                BentoPog(new BentoPogState(new BentoPogContent.Text(text, color6, null), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getPog(composerStartRestartGroup, 0).getColors(), bentoPogSize3, z7, z8, color4, bentoPogBackgroundOverride, null), modifier2, composerStartRestartGroup, i3 & 112, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                color5 = color6;
                                bentoPogSize2 = bentoPogSize3;
                                z5 = z7;
                                z6 = z8;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                bentoPogSize2 = bentoPogSize;
                                color5 = color2;
                                z5 = z3;
                                z6 = z4;
                                color4 = color3;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final Modifier modifier3 = modifier2;
                                final Color color7 = color4;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return BentoPogKt.BentoTextPog_ErYXqs8$lambda$0(text, modifier3, z5, z6, color7, bentoPogSize2, bentoPogBackgroundOverride, color5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 1572864;
                        i8 = i2 & 128;
                        if (i8 == 0) {
                        }
                        if ((i3 & 4793491) == 4793490) {
                            if (i9 != 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            BentoPog(new BentoPogState(new BentoPogContent.Text(text, color6, null), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getPog(composerStartRestartGroup, 0).getColors(), bentoPogSize3, z7, z8, color4, bentoPogBackgroundOverride, null), modifier2, composerStartRestartGroup, i3 & 112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            color5 = color6;
                            bentoPogSize2 = bentoPogSize3;
                            z5 = z7;
                            z6 = z8;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    color3 = color;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    if ((i3 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                color3 = color;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((i2 & 64) == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            color3 = color;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        color3 = color;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean RemoteImagePogContent$lambda$17(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /* renamed from: BentoTextPog-TYpPzmw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20686BentoTextPogTYpPzmw(final String text, Modifier modifier, boolean z, boolean z2, Color color, BentoPogSize bentoPogSize, Color color2, Color color3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        Color color4;
        int i7;
        int i8;
        Color color5;
        int i9;
        int i10;
        final BentoPogSize bentoPogSize2;
        Composer composer2;
        final Color color6;
        final Color color7;
        final boolean z5;
        final boolean z6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1196112787);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            color4 = color;
                            i3 |= composerStartRestartGroup.changed(color4) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changed(bentoPogSize == null ? -1 : bentoPogSize.ordinal()) ? 131072 : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                            color5 = color2;
                        } else {
                            color5 = color2;
                            if ((i & 1572864) == 0) {
                                i3 |= composerStartRestartGroup.changed(color5) ? 1048576 : 524288;
                            }
                        }
                        i9 = i2 & 128;
                        if (i9 == 0) {
                            if ((i & 12582912) == 0) {
                                i10 = i9;
                                i3 |= composerStartRestartGroup.changed(color3) ? 8388608 : 4194304;
                            }
                            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    z3 = true;
                                }
                                boolean z7 = i5 == 0 ? false : z4;
                                Color color8 = i6 == 0 ? null : color4;
                                BentoPogSize bentoPogSize3 = i7 == 0 ? BentoPogSize.Standard : bentoPogSize;
                                if (i8 != 0) {
                                    color5 = null;
                                }
                                Color color9 = i10 == 0 ? null : color3;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1196112787, i3, -1, "com.robinhood.compose.bento.component.BentoTextPog (BentoPog.kt:85)");
                                }
                                int i12 = 29884414 & i3;
                                boolean z8 = z3;
                                m20685BentoTextPogErYXqs8(text, modifier4, z8, z7, color8, bentoPogSize3, color5 != null ? new BentoPogBackgroundOverride.ColorOverride(color5.getValue(), null) : null, color9, composerStartRestartGroup, i12, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                bentoPogSize2 = bentoPogSize3;
                                composer2 = composerStartRestartGroup;
                                color6 = color8;
                                color7 = color9;
                                z5 = z7;
                                z6 = z8;
                                modifier3 = modifier4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z6 = z3;
                                composer2 = composerStartRestartGroup;
                                z5 = z4;
                                color6 = color4;
                                bentoPogSize2 = bentoPogSize;
                                color7 = color3;
                            }
                            final Color color10 = color5;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return BentoPogKt.BentoTextPog_TYpPzmw$lambda$2(text, modifier3, z6, z5, color6, bentoPogSize2, color10, color7, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i10 = i9;
                        if ((i3 & 4793491) == 4793490) {
                            if (i11 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i122 = 29884414 & i3;
                            boolean z82 = z3;
                            m20685BentoTextPogErYXqs8(text, modifier4, z82, z7, color8, bentoPogSize3, color5 != null ? new BentoPogBackgroundOverride.ColorOverride(color5.getValue(), null) : null, color9, composerStartRestartGroup, i122, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            bentoPogSize2 = bentoPogSize3;
                            composer2 = composerStartRestartGroup;
                            color6 = color8;
                            color7 = color9;
                            z5 = z7;
                            z6 = z82;
                            modifier3 = modifier4;
                        }
                        final Color color102 = color5;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    color4 = color;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    if ((i3 & 4793491) == 4793490) {
                    }
                    final Color color1022 = color5;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                color4 = color;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i3 & 4793491) == 4793490) {
                }
                final Color color10222 = color5;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            color4 = color;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i3 & 4793491) == 4793490) {
            }
            final Color color102222 = color5;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        color4 = color;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i3 & 4793491) == 4793490) {
        }
        final Color color1022222 = color5;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0105  */
    /* renamed from: BentoPictogramPog-Rhg8lNc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20684BentoPictogramPogRhg8lNc(final int i, Modifier modifier, boolean z, BentoPogSize bentoPogSize, String str, Color color, Color color2, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        String str2;
        int i8;
        Color color3;
        int i9;
        Modifier modifier3;
        final Color color4;
        final BentoPogSize bentoPogSize2;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-922052798);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(bentoPogSize == null ? -1 : bentoPogSize.ordinal()) ? 2048 : 1024;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        str2 = str;
                        i4 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 != 0) {
                        if ((196608 & i2) == 0) {
                            color3 = color;
                            i4 |= composerStartRestartGroup.changed(color3) ? 131072 : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(color2) ? 1048576 : 524288;
                        }
                        if ((i4 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z4 = i5 == 0 ? true : z2;
                            BentoPogSize bentoPogSize3 = i6 == 0 ? BentoPogSize.Standard : bentoPogSize;
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i8 != 0) {
                                color3 = null;
                            }
                            Color color5 = i9 == 0 ? null : color2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-922052798, i4, -1, "com.robinhood.compose.bento.component.BentoPictogramPog (BentoPog.kt:110)");
                            }
                            BentoPog(new BentoPogState(new BentoPogContent.Pictogram(i, str2, color3, null), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getPog(composerStartRestartGroup, 0).getColors(), bentoPogSize3, z4, false, null, color5 == null ? new BentoPogBackgroundOverride.ColorOverride(color5.getValue(), null) : null, 48, null), modifier3, composerStartRestartGroup, i4 & 112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            color4 = color5;
                            bentoPogSize2 = bentoPogSize3;
                            z3 = z4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            bentoPogSize2 = bentoPogSize;
                            modifier3 = modifier2;
                            z3 = z2;
                            color4 = color2;
                        }
                        final String str3 = str2;
                        final Color color6 = color3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoPogKt.BentoPictogramPog_Rhg8lNc$lambda$4(i, modifier4, z3, bentoPogSize2, str3, color6, color4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 196608;
                    color3 = color;
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    if ((i4 & 599187) != 599186) {
                        if (i10 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        BentoPog(new BentoPogState(new BentoPogContent.Pictogram(i, str2, color3, null), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getPog(composerStartRestartGroup, 0).getColors(), bentoPogSize3, z4, false, null, color5 == null ? new BentoPogBackgroundOverride.ColorOverride(color5.getValue(), null) : null, 48, null), modifier3, composerStartRestartGroup, i4 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        color4 = color5;
                        bentoPogSize2 = bentoPogSize3;
                        z3 = z4;
                    }
                    final String str32 = str2;
                    final Color color62 = color3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str2 = str;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                color3 = color;
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                if ((i4 & 599187) != 599186) {
                }
                final String str322 = str2;
                final Color color622 = color3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            str2 = str;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            color3 = color;
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if ((i4 & 599187) != 599186) {
            }
            final String str3222 = str2;
            final Color color6222 = color3;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        str2 = str;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        color3 = color;
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if ((i4 & 599187) != 599186) {
        }
        final String str32222 = str2;
        final Color color62222 = color3;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* renamed from: BentoNumberPog-xqIIw2o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20683BentoNumberPogxqIIw2o(int i, Modifier modifier, boolean z, Color color, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z2;
        int i7;
        Color color2;
        Modifier modifier3;
        final Color color3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1534801382);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            i4 = i;
        } else if ((i2 & 6) == 0) {
            i4 = i;
            i5 = (composerStartRestartGroup.changed(i4) ? 4 : 2) | i2;
        } else {
            i4 = i;
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i3 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    z2 = z;
                    i5 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i7 = i3 & 8;
                if (i7 == 0) {
                    if ((i2 & 3072) == 0) {
                        color2 = color;
                        i5 |= composerStartRestartGroup.changed(color2) ? 2048 : 1024;
                    }
                    if ((i5 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z4 = i6 == 0 ? true : z2;
                        Color color4 = i7 == 0 ? null : color2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1534801382, i5, -1, "com.robinhood.compose.bento.component.BentoNumberPog (BentoPog.kt:136)");
                        }
                        BentoPog(new BentoPogState(new BentoPogContent.Text(String.valueOf(i4), null, 2, null), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getPog(composerStartRestartGroup, 0).getColors(), BentoPogSize.Number, z4, false, null, color4 == null ? new BentoPogBackgroundOverride.ColorOverride(color4.getValue(), null) : null, 48, null), modifier3, composerStartRestartGroup, i5 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        color3 = color4;
                        z3 = z4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        color3 = color2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final int i9 = i4;
                        final Modifier modifier4 = modifier3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoPogKt.BentoNumberPog_xqIIw2o$lambda$6(i9, modifier4, z3, color3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 3072;
                color2 = color;
                if ((i5 & 1171) == 1170) {
                    if (i8 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    BentoPog(new BentoPogState(new BentoPogContent.Text(String.valueOf(i4), null, 2, null), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getPog(composerStartRestartGroup, 0).getColors(), BentoPogSize.Number, z4, false, null, color4 == null ? new BentoPogBackgroundOverride.ColorOverride(color4.getValue(), null) : null, 48, null), modifier3, composerStartRestartGroup, i5 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    color3 = color4;
                    z3 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i7 = i3 & 8;
            if (i7 == 0) {
            }
            color2 = color;
            if ((i5 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        color2 = color;
        if ((i5 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoPog(final BentoPogState state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        BentoPogBackgroundOverride backgroundOverride;
        Modifier modifierM4872backgroundbw27NRU$default;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        BentoPogContent content;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-132867106);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-132867106, i3, -1, "com.robinhood.compose.bento.component.BentoPog (BentoPog.kt:153)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(200955712);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierClip = Clip.clip(SizeKt.m5169size3ABfNKs(companion3, state.getSize().getSizeDp()), RoundedCornerShape2.getCircleShape());
                backgroundOverride = state.getBackgroundOverride();
                if (!(backgroundOverride instanceof BentoPogBackgroundOverride.BrushOverride)) {
                    if (state.getEnabled()) {
                        modifierM4872backgroundbw27NRU$default = Background3.background$default(companion3, ((BentoPogBackgroundOverride.BrushOverride) state.getBackgroundOverride()).getBrush(), null, 0.0f, 6, null);
                    } else {
                        modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion3, state.getColors().m21883backgroundCY1FfXs(false, null), null, 2, null);
                    }
                } else if (backgroundOverride instanceof BentoPogBackgroundOverride.ColorOverride) {
                    modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion3, state.getColors().m21883backgroundCY1FfXs(state.getEnabled(), Color.m6701boximpl(((BentoPogBackgroundOverride.ColorOverride) state.getBackgroundOverride()).m20660getColor0d7_KjU())), null, 2, null);
                } else {
                    if (backgroundOverride != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion3, state.getColors().m21883backgroundCY1FfXs(state.getEnabled(), null), null, 2, null);
                }
                Modifier modifierThen = modifierClip.then(modifierM4872backgroundbw27NRU$default);
                if (state.getHasBorder()) {
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                    Color colorM20693getBorderColorQN2ZGVo = state.m20693getBorderColorQN2ZGVo();
                    modifierThen = BorderKt.m4876borderxT4_qwU(modifierThen, fM7995constructorimpl, colorM20693getBorderColorQN2ZGVo != null ? colorM20693getBorderColorQN2ZGVo.getValue() : state.getColors().m21893getBorderColor0d7_KjU(), RoundedCornerShape2.getCircleShape());
                }
                Modifier modifierWithBentoCirclePlaceholder$default = LocalShowPlaceholder.withBentoCirclePlaceholder$default(modifierThen, false, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWithBentoCirclePlaceholder$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                content = state.getContent();
                if (!(content instanceof BentoPogContent.Text)) {
                    composerStartRestartGroup.startReplaceGroup(-62353737);
                    m20687TextPogContentFJfuzF0((BentoPogContent.Text) state.getContent(), state.getColors(), state.getEnabled(), state.getSize().textStyle(composerStartRestartGroup, 0), state.getSize().getHorizontalTextPadding(), state.getSize().getMaxLines(), composerStartRestartGroup, PogStyle.PogColors.$stable << 3);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else if (content instanceof BentoPogContent.Pictogram) {
                    composerStartRestartGroup.startReplaceGroup(-62341176);
                    PictogramPogContent((BentoPogContent.Pictogram) state.getContent(), state.getColors(), state.getEnabled(), composerStartRestartGroup, PogStyle.PogColors.$stable << 3);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(content instanceof BentoPogContent.RemoteImage)) {
                        composerStartRestartGroup.startReplaceGroup(-62355188);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-62333909);
                    RemoteImagePogContent((BentoPogContent.RemoteImage) state.getContent(), state.getColors(), state.getEnabled(), state.getBackgroundOverride(), composerStartRestartGroup, PogStyle.PogColors.$stable << 3);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoPogKt.BentoPog$lambda$11(state, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(200955712);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierClip2 = Clip.clip(SizeKt.m5169size3ABfNKs(companion32, state.getSize().getSizeDp()), RoundedCornerShape2.getCircleShape());
                backgroundOverride = state.getBackgroundOverride();
                if (!(backgroundOverride instanceof BentoPogBackgroundOverride.BrushOverride)) {
                }
                Modifier modifierThen2 = modifierClip2.then(modifierM4872backgroundbw27NRU$default);
                if (state.getHasBorder()) {
                }
                Modifier modifierWithBentoCirclePlaceholder$default2 = LocalShowPlaceholder.withBentoCirclePlaceholder$default(modifierThen2, false, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWithBentoCirclePlaceholder$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    content = state.getContent();
                    if (!(content instanceof BentoPogContent.Text)) {
                    }
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: TextPogContent-FJfuzF0, reason: not valid java name */
    private static final void m20687TextPogContentFJfuzF0(BentoPogContent.Text text, final PogStyle.PogColors pogColors, final boolean z, final TextStyle textStyle, final float f, final int i, Composer composer, final int i2) {
        BentoPogContent.Text text2;
        int i3;
        TextStyle textStyle2;
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1179430524);
        if ((i2 & 6) == 0) {
            text2 = text;
            i3 = (composerStartRestartGroup.changed(text2) ? 4 : 2) | i2;
        } else {
            text2 = text;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(pogColors) : composerStartRestartGroup.changedInstance(pogColors) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            textStyle2 = textStyle;
            i3 |= composerStartRestartGroup.changed(textStyle2) ? 2048 : 1024;
        } else {
            textStyle2 = textStyle;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 = i;
            i3 |= composerStartRestartGroup.changed(i4) ? 131072 : 65536;
        } else {
            i4 = i;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1179430524, i3, -1, "com.robinhood.compose.bento.component.TextPogContent (BentoPog.kt:228)");
            }
            composer2 = composerStartRestartGroup;
            TextStyle textStyle3 = textStyle2;
            int i5 = i4;
            BentoText2.m20747BentoText38GnDrw(text2.getText(), PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, f, 0.0f, 2, null), Color.m6701boximpl(pogColors.m21890foregroundCY1FfXs(z, text2.getForegroundColorOverride())), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, i5, 0, null, 0, textStyle3, composer2, ((i3 << 12) & 1879048192) | 24576, i3 & 7168, 7592);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final BentoPogContent.Text text3 = text2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.TextPogContent_FJfuzF0$lambda$12(text3, pogColors, z, textStyle, f, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PictogramPogContent(final BentoPogContent.Pictogram pictogram, final PogStyle.PogColors pogColors, final boolean z, Composer composer, final int i) {
        int i2;
        ColorFilter colorFilterM6729tintxETnrds$default;
        ColorFilter colorFilter;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2105564659);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(pictogram) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(pogColors) : composerStartRestartGroup.changedInstance(pogColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2105564659, i2, -1, "com.robinhood.compose.bento.component.PictogramPogContent (BentoPog.kt:245)");
            }
            int assetId = pictogram.getAssetId();
            if (assetId == C20690R.drawable.empty) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoPogKt.PictogramPogContent$lambda$13(pictogram, pogColors, z, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (z) {
                Color foregroundColorOverride = pictogram.getForegroundColorOverride();
                if (foregroundColorOverride != null) {
                    colorFilterM6729tintxETnrds$default = ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, foregroundColorOverride.getValue(), 0, 2, null);
                } else {
                    colorFilter = null;
                    ImageKt.Image(PainterResources_androidKt.painterResource(assetId, composerStartRestartGroup, 0), pictogram.getContentDescription(), LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, 1, null), (Alignment) null, (ContentScale) null, 0.0f, colorFilter, composerStartRestartGroup, 0, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            } else {
                colorFilterM6729tintxETnrds$default = ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, pogColors.m21894getForegroundDisabled0d7_KjU(), 0, 2, null);
            }
            colorFilter = colorFilterM6729tintxETnrds$default;
            ImageKt.Image(PainterResources_androidKt.painterResource(assetId, composerStartRestartGroup, 0), pictogram.getContentDescription(), LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, 1, null), (Alignment) null, (ContentScale) null, 0.0f, colorFilter, composerStartRestartGroup, 0, 56);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PictogramPogContent$lambda$15(pictogram, pogColors, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RemoteImagePogContent(final BentoPogContent.RemoteImage remoteImage, final PogStyle.PogColors pogColors, final boolean z, final BentoPogBackgroundOverride bentoPogBackgroundOverride, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1771901267);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(remoteImage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(pogColors) : composerStartRestartGroup.changedInstance(pogColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(bentoPogBackgroundOverride) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1771901267, i2, -1, "com.robinhood.compose.bento.component.RemoteImagePogContent (BentoPog.kt:271)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(StringsKt.isBlank(remoteImage.getUrl())), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            String backupText = remoteImage.getBackupText();
            if (!(backupText == null || StringsKt.isBlank(backupText)) && RemoteImagePogContent$lambda$17(snapshotState)) {
                composerStartRestartGroup.startReplaceGroup(-1562241780);
                m20685BentoTextPogErYXqs8(remoteImage.getBackupText(), null, z, false, null, null, bentoPogBackgroundOverride, remoteImage.getForegroundColorOverride(), composerStartRestartGroup, (i2 & 896) | ((i2 << 9) & 3670016), 58);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1561997221);
                String url = remoteImage.getUrl();
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BentoPogKt.RemoteImagePogContent$lambda$20$lambda$19(snapshotState, (AsyncImagePainter.State.Error) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                AsyncImagePainter asyncImagePainterM9121rememberAsyncImagePainterHtA5bXE = SingletonAsyncImagePainter.m9121rememberAsyncImagePainterHtA5bXE(url, null, null, null, null, null, (Function1) objRememberedValue2, null, 0, null, composerStartRestartGroup, 1572864, 958);
                composerStartRestartGroup = composerStartRestartGroup;
                ImageKt.Image(asyncImagePainterM9121rememberAsyncImagePainterHtA5bXE, (String) null, LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, z ? null : ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, pogColors.m21894getForegroundDisabled0d7_KjU(), 0, 2, null), composerStartRestartGroup, 24624, 40);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.RemoteImagePogContent$lambda$21(remoteImage, pogColors, z, bentoPogBackgroundOverride, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RemoteImagePogContent$lambda$18(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RemoteImagePogContent$lambda$20$lambda$19(SnapshotState snapshotState, AsyncImagePainter.State.Error it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RemoteImagePogContent$lambda$18(snapshotState, true);
        return Unit.INSTANCE;
    }

    public static final void PreviewTextPogDay(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(101596351);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(101596351, i, -1, "com.robinhood.compose.bento.component.PreviewTextPogDay (BentoPog.kt:432)");
            }
            PreviewTextPogs(true, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PreviewTextPogDay$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewTextPogDayLoading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-760326599);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-760326599, i, -1, "com.robinhood.compose.bento.component.PreviewTextPogDayLoading (BentoPog.kt:438)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$BentoPogKt.INSTANCE.m20793getLambda$1657115703$lib_compose_bento_externalRelease(), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PreviewTextPogDayLoading$lambda$23(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewTextPogNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1429053315);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1429053315, i, -1, "com.robinhood.compose.bento.component.PreviewTextPogNight (BentoPog.kt:446)");
            }
            PreviewTextPogs(false, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PreviewTextPogNight$lambda$24(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewTextPogNightLoading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-834466059);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-834466059, i, -1, "com.robinhood.compose.bento.component.PreviewTextPogNightLoading (BentoPog.kt:452)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$BentoPogKt.INSTANCE.getLambda$639631493$lib_compose_bento_externalRelease(), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PreviewTextPogNightLoading$lambda$25(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewLongText(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(338912567);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(338912567, i, -1, "com.robinhood.compose.bento.component.PreviewLongText (BentoPog.kt:465)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$BentoPogKt.INSTANCE.getLambda$1954432639$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PreviewLongText$lambda$26(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PreviewTextPogs(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1673892796);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1673892796, i2, -1, "com.robinhood.compose.bento.component.PreviewTextPogs (BentoPog.kt:472)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(z), null, null, null, null, null, null, null, ComposableSingletons$BentoPogKt.INSTANCE.getLambda$1416956412$lib_compose_bento_externalRelease(), composerStartRestartGroup, (i2 & 14) | 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PreviewTextPogs$lambda$27(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewNumberPogsDay(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-977136084);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-977136084, i, -1, "com.robinhood.compose.bento.component.PreviewNumberPogsDay (BentoPog.kt:496)");
            }
            PreviewNumberPogs(true, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PreviewNumberPogsDay$lambda$28(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewNumberPogsNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-145698384);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-145698384, i, -1, "com.robinhood.compose.bento.component.PreviewNumberPogsNight (BentoPog.kt:502)");
            }
            PreviewNumberPogs(false, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PreviewNumberPogsNight$lambda$29(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewNumberPogs(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1809292832);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1809292832, i2, -1, "com.robinhood.compose.bento.component.PreviewNumberPogs (BentoPog.kt:507)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(z), null, null, null, null, null, null, null, ComposableSingletons$BentoPogKt.INSTANCE.getLambda$674394520$lib_compose_bento_externalRelease(), composerStartRestartGroup, (i2 & 14) | 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PreviewNumberPogs$lambda$30(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewPictogramPogsMono(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2013611050);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2013611050, i, -1, "com.robinhood.compose.bento.component.PreviewPictogramPogsMono (BentoPog.kt:527)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            PictogramPogs(true, C20690R.drawable.pict_mono_rds_megaphone, composerStartRestartGroup, 6);
            PictogramPogs(false, C20690R.drawable.pict_mono_rds_megaphone, composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PreviewPictogramPogsMono$lambda$32(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewPictogramPogsColor(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(62798052);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(62798052, i, -1, "com.robinhood.compose.bento.component.PreviewPictogramPogsColor (BentoPog.kt:536)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            PictogramPogs(true, C20690R.drawable.pict_clr_rds_prime_flower, composerStartRestartGroup, 6);
            PictogramPogs(false, C20690R.drawable.pict_clr_rds_prime_flower, composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PreviewPictogramPogsColor$lambda$34(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewPictogramPogsColorLoading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1915333004);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1915333004, i, -1, "com.robinhood.compose.bento.component.PreviewPictogramPogsColorLoading (BentoPog.kt:545)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$BentoPogKt.INSTANCE.getLambda$268164100$lib_compose_bento_externalRelease(), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PreviewPictogramPogsColorLoading$lambda$35(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PictogramPogs(final boolean z, final int i, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(755539502);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539502, i3, -1, "com.robinhood.compose.bento.component.PictogramPogs (BentoPog.kt:555)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(z), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1055740442, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoPogKt.PictogramPogs.1
                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1055740442, i4, -1, "com.robinhood.compose.bento.component.PictogramPogs.<anonymous> (BentoPog.kt:557)");
                    }
                    float f = 8;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, 6).m21371getBg0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(f));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(f));
                    int i5 = i;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer2, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoPogSize bentoPogSize = BentoPogSize.Standard;
                    BentoPogKt.m20684BentoPictogramPogRhg8lNc(i5, null, true, bentoPogSize, null, null, null, composer2, 3456, 114);
                    BentoPogKt.m20684BentoPictogramPogRhg8lNc(i5, null, false, bentoPogSize, null, null, null, composer2, 3456, 114);
                    BentoPogSize bentoPogSize2 = BentoPogSize.Hero;
                    BentoPogKt.m20684BentoPictogramPogRhg8lNc(i5, null, true, bentoPogSize2, null, null, null, composer2, 3456, 114);
                    BentoPogKt.m20684BentoPictogramPogRhg8lNc(i5, null, false, bentoPogSize2, null, null, null, composer2, 3456, 114);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PictogramPogs$lambda$36(z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void FigmaPogs(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1652887493);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1652887493, i, -1, "com.robinhood.compose.bento.component.FigmaPogs (BentoPog.kt:575)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1472091945, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoPogKt$FigmaPogs$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1472091945, i2, -1, "com.robinhood.compose.bento.component.FigmaPogs.<anonymous>.<anonymous> (BentoPog.kt:601)");
                    }
                    BentoPogKt.FigmaPogs$PogSet(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(24)), composerStartRestartGroup, 6);
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1215831790, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoPogKt$FigmaPogs$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1215831790, i2, -1, "com.robinhood.compose.bento.component.FigmaPogs.<anonymous>.<anonymous> (BentoPog.kt:605)");
                    }
                    BentoPogKt.FigmaPogs$PogSet(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.FigmaPogs$lambda$40(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void FigmaPogs$PogRow(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(-1957025209);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1957025209, i, -1, "com.robinhood.compose.bento.component.FigmaPogs.PogRow (BentoPog.kt:577)");
        }
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(16));
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        int i2 = (i << 6) & 896;
        m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_megaphone, null, z, null, null, null, null, composer, i2, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_clr_rds_prime_flower, null, z, null, null, null, null, composer, i2, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        m20686BentoTextPogTYpPzmw(ProfitAndLossTradeItemFixtures.REQUEST_SYMBOL, null, z, false, null, null, null, null, composer, i2 | 6, 250);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FigmaPogs$PogSet(Composer composer, int i) {
        composer.startReplaceGroup(-851199801);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-851199801, i, -1, "com.robinhood.compose.bento.component.FigmaPogs.PogSet (BentoPog.kt:587)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composer, 6).m21371getBg0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(16));
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        FigmaPogs$PogRow(true, composer, 6);
        Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(24)), composer, 6);
        FigmaPogs$PogRow(false, composer, 6);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public static final void PreviewTintedPog(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1694524986);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1694524986, i, -1, "com.robinhood.compose.bento.component.PreviewTintedPog (BentoPog.kt:612)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            PreviewTintedPog$EnabledAndDisabledPogs(true, composerStartRestartGroup, 6);
            PreviewTintedPog$EnabledAndDisabledPogs(false, composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PreviewTintedPog$lambda$42(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PreviewTintedPog$Pog(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(1643901066);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1643901066, i, -1, "com.robinhood.compose.bento.component.PreviewTintedPog.Pog (BentoPog.kt:614)");
        }
        m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_warning, null, z, null, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, 6).getLumen()), null, composer, (i << 6) & 896, 90);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    private static final void PreviewTintedPog$EnabledAndDisabledPogs(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(516988377);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(516988377, i, -1, "com.robinhood.compose.bento.component.PreviewTintedPog.EnabledAndDisabledPogs (BentoPog.kt:623)");
        }
        BentoTheme2.BentoTheme(Boolean.valueOf(z), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(569232785, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoPogKt$PreviewTintedPog$EnabledAndDisabledPogs$1
            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(569232785, i2, -1, "com.robinhood.compose.bento.component.PreviewTintedPog.EnabledAndDisabledPogs.<anonymous> (BentoPog.kt:625)");
                }
                float f = 16;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5092spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(C2002Dp.m7995constructorimpl(f));
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, 6).m21371getBg0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(f));
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5092spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, 6);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                BentoPogKt.PreviewTintedPog$Pog(true, composer2, 6);
                BentoPogKt.PreviewTintedPog$Pog(false, composer2, 6);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }
        }, composer, 54), composer, (i & 14) | 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    private static final void DayNightHorizontal(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-206080829);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-206080829, i2, -1, "com.robinhood.compose.bento.component.DayNightHorizontal (BentoPog.kt:644)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1794802137, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoPogKt$DayNightHorizontal$1$1
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1794802137, i3, -1, "com.robinhood.compose.bento.component.DayNightHorizontal.<anonymous>.<anonymous> (BentoPog.kt:647)");
                    }
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, 6).m21371getBg0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(16));
                    Function2<Composer, Integer, Unit> function22 = function2;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function22.invoke(composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(944668816, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoPogKt$DayNightHorizontal$1$2
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(944668816, i3, -1, "com.robinhood.compose.bento.component.DayNightHorizontal.<anonymous>.<anonymous> (BentoPog.kt:656)");
                    }
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, 6).m21371getBg0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(16));
                    Function2<Composer, Integer, Unit> function22 = function2;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function22.invoke(composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.DayNightHorizontal$lambda$44(function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewBackgroundColorOverride(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(969031667);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(969031667, i, -1, "com.robinhood.compose.bento.component.PreviewBackgroundColorOverride (BentoPog.kt:669)");
            }
            DayNightHorizontal(ComposableSingletons$BentoPogKt.INSTANCE.m20794getLambda$900201184$lib_compose_bento_externalRelease(), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoPogKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoPogKt.PreviewBackgroundColorOverride$lambda$45(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @JvmName
    private static final BentoPogState getTestPog(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182832298, i, -1, "com.robinhood.compose.bento.component.<get-testPog> (BentoPog.kt:680)");
        }
        BentoPogState bentoPogState = new BentoPogState(new BentoPogContent.Text(ProfitAndLossTradeItemFixtures.REQUEST_SYMBOL, null, 2, null), BentoPogDefaults.INSTANCE.getDefaultColors(composer, 6), BentoPogSize.Standard, true, false, null, null, 112, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bentoPogState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public static final BentoPogState getPog(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(908634182, i, -1, "com.robinhood.compose.bento.component.<get-pog> (BentoPog.kt:689)");
        }
        BentoPogState testPog = getTestPog(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return testPog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public static final BentoPogState getPogDisabled(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(878287374, i, -1, "com.robinhood.compose.bento.component.<get-pogDisabled> (BentoPog.kt:692)");
        }
        BentoPogState bentoPogStateM20690copylMAxDYE$default = BentoPogState.m20690copylMAxDYE$default(getPog(composer, 0), null, null, null, false, false, null, null, 119, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bentoPogStateM20690copylMAxDYE$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public static final BentoPogState getHeroPog(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-798738566, i, -1, "com.robinhood.compose.bento.component.<get-heroPog> (BentoPog.kt:695)");
        }
        BentoPogState bentoPogStateM20690copylMAxDYE$default = BentoPogState.m20690copylMAxDYE$default(getTestPog(composer, 0), null, null, BentoPogSize.Hero, false, false, null, null, 123, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bentoPogStateM20690copylMAxDYE$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public static final BentoPogState getHeroPogDisabled(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1002510014, i, -1, "com.robinhood.compose.bento.component.<get-heroPogDisabled> (BentoPog.kt:698)");
        }
        BentoPogState bentoPogStateM20690copylMAxDYE$default = BentoPogState.m20690copylMAxDYE$default(getHeroPog(composer, 0), null, null, null, false, false, null, null, 119, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bentoPogStateM20690copylMAxDYE$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public static final BentoPogState getPogLongText(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1372826188, i, -1, "com.robinhood.compose.bento.component.<get-pogLongText> (BentoPog.kt:701)");
        }
        BentoPogState bentoPogStateM20690copylMAxDYE$default = BentoPogState.m20690copylMAxDYE$default(getPog(composer, 0), new BentoPogContent.Text("MEOWWWWWWW", null, 2, null), null, null, false, false, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bentoPogStateM20690copylMAxDYE$default;
    }
}
