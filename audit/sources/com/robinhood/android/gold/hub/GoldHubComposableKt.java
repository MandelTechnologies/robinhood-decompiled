package com.robinhood.android.gold.hub;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.gold.C11182R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.engagement.goldeventhub.GoldEventHubManager;
import com.robinhood.android.gold.contracts.GoldHubSettingsComponentTargetType;
import com.robinhood.android.gold.hub.GoldHubViewState;
import com.robinhood.android.gold.hub.animations.AnimatedAmountContentComposable;
import com.robinhood.android.gold.hub.boost.GoldDepositBoostHubComposableKt;
import com.robinhood.android.gold.lib.hub.api.AnimatedAmountContent;
import com.robinhood.android.gold.lib.hub.api.ApiGoldEarningsTracker;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHub;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubBilling;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubBillingSection;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubCard;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubFeature;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubFeatureSection;
import com.robinhood.android.gold.lib.hub.api.GoldEarningsSourceRow;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleInfoTag;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GoldHubAction;
import com.robinhood.models.serverdriven.experimental.api.InfoTag;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import microgram.android.RemoteMicrogramApplication;
import okhttp3.HttpUrl;

/* compiled from: GoldHubComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a\u007f\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0003¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010#\u001a\u00020\u0001*\u00020\u0016H\u0003¢\u0006\u0002\u0010$\u001a=\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010)H\u0003¢\u0006\u0004\b*\u0010+\u001a-\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020.2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010/\u001a3\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u0002022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010)H\u0003¢\u0006\u0002\u00103\u001a+\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u0002062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u00107\u001a\u00020\u0012H\u0003¢\u0006\u0002\u00108\u001a\u0017\u00109\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010:\u001a#\u0010;\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u00192\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0002\u0010=¨\u0006>²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002"}, m3636d2 = {"GoldHubComposable", "", "state", "Lcom/robinhood/android/gold/hub/GoldHubViewState;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldHubAction;", "genericActionHandler", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "duxo", "Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceCellDuxo;", "onBackClick", "Lkotlin/Function0;", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "modifier", "Landroidx/compose/ui/Modifier;", "showBackButton", "", "(Lcom/robinhood/android/gold/hub/GoldHubViewState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceCellDuxo;Lkotlin/jvm/functions/Function0;Landroidx/fragment/app/FragmentManager;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "GoldHub", "goldHub", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHub;", "isGoldEventActive", "cardToShow", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCard;", "scrollTarget", "Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;", "(Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHub;ZLcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCard;Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceCellDuxo;ZLkotlin/jvm/functions/Function0;Landroidx/fragment/app/FragmentManager;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;Landroidx/compose/runtime/Composer;III)V", "GoldEventSection", "appBarHeight", "Landroidx/compose/ui/unit/Dp;", "initialHeight", "GoldEventSection-WMci_g0", "(Landroidx/fragment/app/FragmentManager;FFLandroidx/compose/runtime/Composer;II)V", "GoldImageHeader", "(Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHub;Landroidx/compose/runtime/Composer;I)V", "GoldEarningsTrackerHeader", "earningsTracker", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsTracker;", "infoTag", "Lcom/robinhood/models/serverdriven/experimental/api/InfoTag;", "GoldEarningsTrackerHeader-6a0pyJM", "(Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsTracker;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;FLcom/robinhood/models/serverdriven/experimental/api/InfoTag;Landroidx/compose/runtime/Composer;I)V", "BillingSection", "goldHubBillingSection", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBillingSection;", "(Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBillingSection;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FeatureSection", "goldHubFeatureSection", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubFeatureSection;", "(Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubFeatureSection;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/models/serverdriven/experimental/api/InfoTag;Landroidx/compose/runtime/Composer;I)V", "Feature", "feature", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubFeature;", "active", "(Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubFeature;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;ZLandroidx/compose/runtime/Composer;I)V", "GoldHubFailed", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Card", "goldHubCard", "(Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCard;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/runtime/Composer;I)V", "feature-gold-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldHubComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BillingSection$lambda$26(ApiGoldHubBillingSection apiGoldHubBillingSection, SduiActionHandler sduiActionHandler, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BillingSection(apiGoldHubBillingSection, sduiActionHandler, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Card$lambda$49(ApiGoldHubCard apiGoldHubCard, SduiActionHandler sduiActionHandler, int i, Composer composer, int i2) {
        Card(apiGoldHubCard, sduiActionHandler, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Feature$lambda$34(ApiGoldHubFeature apiGoldHubFeature, SduiActionHandler sduiActionHandler, boolean z, int i, Composer composer, int i2) {
        Feature(apiGoldHubFeature, sduiActionHandler, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeatureSection$lambda$32(ApiGoldHubFeatureSection apiGoldHubFeatureSection, SduiActionHandler sduiActionHandler, InfoTag infoTag, int i, Composer composer, int i2) {
        FeatureSection(apiGoldHubFeatureSection, sduiActionHandler, infoTag, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldEarningsTrackerHeader_6a0pyJM$lambda$10(ApiGoldEarningsTracker apiGoldEarningsTracker, SduiActionHandler sduiActionHandler, float f, InfoTag infoTag, int i, Composer composer, int i2) {
        m15028GoldEarningsTrackerHeader6a0pyJM(apiGoldEarningsTracker, sduiActionHandler, f, infoTag, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldEventSection_WMci_g0$lambda$6(FragmentManager fragmentManager, float f, float f2, int i, int i2, Composer composer, int i3) {
        m15029GoldEventSectionWMci_g0(fragmentManager, f, f2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldHub$lambda$5(ApiGoldHub apiGoldHub, boolean z, SduiActionHandler sduiActionHandler, SduiActionHandler sduiActionHandler2, ApiGoldHubCard apiGoldHubCard, MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo, boolean z2, Function0 function0, FragmentManager fragmentManager, Modifier modifier, GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType, int i, int i2, int i3, Composer composer, int i4) {
        GoldHub(apiGoldHub, z, sduiActionHandler, sduiActionHandler2, apiGoldHubCard, moneyMovementPaymentPreferenceCellDuxo, z2, function0, fragmentManager, modifier, goldHubSettingsComponentTargetType, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldHubComposable$lambda$0(GoldHubViewState goldHubViewState, SduiActionHandler sduiActionHandler, SduiActionHandler sduiActionHandler2, MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo, Function0 function0, FragmentManager fragmentManager, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        GoldHubComposable(goldHubViewState, sduiActionHandler, sduiActionHandler2, moneyMovementPaymentPreferenceCellDuxo, function0, fragmentManager, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldHubFailed$lambda$36(Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldHubFailed(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldImageHeader$lambda$9(ApiGoldHub apiGoldHub, int i, Composer composer, int i2) {
        GoldImageHeader(apiGoldHub, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float GoldHub$lambda$2(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldHubComposable(final GoldHubViewState state, final SduiActionHandler<? super GoldHubAction> actionHandler, final SduiActionHandler<? super GenericAction> genericActionHandler, final MoneyMovementPaymentPreferenceCellDuxo duxo, final Function0<Unit> onBackClick, final FragmentManager childFragmentManager, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        final Modifier modifier3;
        final boolean z3;
        final Modifier modifier4;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(genericActionHandler, "genericActionHandler");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Composer composerStartRestartGroup = composer.startRestartGroup(1353394730);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(genericActionHandler) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(duxo) : composerStartRestartGroup.changedInstance(duxo) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(childFragmentManager) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= 1572864;
        } else {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z5 = i4 == 0 ? true : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1353394730, i3, -1, "com.robinhood.android.gold.hub.GoldHubComposable (GoldHubComposable.kt:128)");
                    }
                    if (!Intrinsics.areEqual(state, GoldHubViewState.Loading.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(-762740374);
                        LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-1650958814, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt.GoldHubComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i6) {
                                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1650958814, i6, -1, "com.robinhood.android.gold.hub.GoldHubComposable.<anonymous> (GoldHubComposable.kt:132)");
                                }
                                GoldHubViewState.Companion companion = GoldHubViewState.INSTANCE;
                                ApiGoldHub goldHub = companion.getLoadingMock().getGoldHub();
                                composer2.startReplaceGroup(1849434622);
                                Object objRememberedValue = composer2.rememberedValue();
                                Composer.Companion companion2 = Composer.INSTANCE;
                                if (objRememberedValue == companion2.getEmpty()) {
                                    objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldHubComposable$1$1$1
                                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                        public final boolean mo15941handle(GoldHubAction it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            return true;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (objRememberedValue2 == companion2.getEmpty()) {
                                    objRememberedValue2 = new SduiActionHandler() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldHubComposable$1$2$1
                                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                        public final boolean mo15941handle(GenericAction it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            return true;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                GoldHubComposableKt.GoldHub(goldHub, false, sduiActionHandler, (SduiActionHandler) objRememberedValue2, companion.getLoadingMock().getCardToShow(), duxo, false, onBackClick, childFragmentManager, null, companion.getLoadingMock().getScrollTarget(), composer2, (MoneyMovementPaymentPreferenceCellDuxo.$stable << 15) | 1572912, 0, 512);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier5;
                        z3 = z5;
                    } else if (state instanceof GoldHubViewState.Loaded) {
                        composerStartRestartGroup.startReplaceGroup(-762718044);
                        modifier3 = modifier5;
                        z3 = z5;
                        GoldThemeOverlay.GoldThemeOverlay(ComposableLambda3.rememberComposableLambda(-1858638315, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt.GoldHubComposable.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i6) {
                                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1858638315, i6, -1, "com.robinhood.android.gold.hub.GoldHubComposable.<anonymous> (GoldHubComposable.kt:149)");
                                }
                                OverrideSystemBarsStyle.OverrideStatusBarStyle(false, composer2, 6);
                                GoldHubComposableKt.GoldHub(((GoldHubViewState.Loaded) state).getGoldHub(), ((GoldHubViewState.Loaded) state).isGoldEventActive(), actionHandler, genericActionHandler, ((GoldHubViewState.Loaded) state).getCardToShow(), duxo, z3, onBackClick, childFragmentManager, ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), ((GoldHubViewState.Loaded) state).getScrollTarget(), composer2, MoneyMovementPaymentPreferenceCellDuxo.$stable << 15, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        modifier3 = modifier5;
                        z3 = z5;
                        if (!(state instanceof GoldHubViewState.Error)) {
                            composerStartRestartGroup.startReplaceGroup(-762741389);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-762691175);
                        GoldHubFailed(null, composerStartRestartGroup, 0, 1);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z4 = z3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GoldHubComposableKt.GoldHubComposable$lambda$0(state, actionHandler, genericActionHandler, duxo, onBackClick, childFragmentManager, modifier4, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            z2 = z;
            if ((4793491 & i3) != 4793490) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!Intrinsics.areEqual(state, GoldHubViewState.Loading.INSTANCE)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        z2 = z;
        if ((4793491 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldHub(final ApiGoldHub apiGoldHub, final boolean z, final SduiActionHandler<? super GoldHubAction> sduiActionHandler, final SduiActionHandler<? super GenericAction> sduiActionHandler2, final ApiGoldHubCard apiGoldHubCard, final MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo, final boolean z2, final Function0<Unit> function0, final FragmentManager fragmentManager, Modifier modifier, GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z3;
        SduiActionHandler<? super GenericAction> sduiActionHandler3;
        ApiGoldHubCard apiGoldHubCard2;
        boolean z4;
        Function0<Unit> function02;
        FragmentManager fragmentManager2;
        int i5;
        int i6;
        int i7;
        int i8;
        float fDimensionResource;
        Object objRememberedValue;
        Modifier modifier2;
        Composer composer2;
        final GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-286824173);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(apiGoldHub) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                z3 = z;
                i4 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(sduiActionHandler) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
                sduiActionHandler3 = sduiActionHandler2;
            } else {
                sduiActionHandler3 = sduiActionHandler2;
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(sduiActionHandler3) ? 2048 : 1024;
                }
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    apiGoldHubCard2 = apiGoldHubCard;
                    i4 |= composerStartRestartGroup.changedInstance(apiGoldHubCard2) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(moneyMovementPaymentPreferenceCellDuxo) : composerStartRestartGroup.changedInstance(moneyMovementPaymentPreferenceCellDuxo) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                    }
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else {
                    if ((i & 12582912) == 0) {
                        function02 = function0;
                        i4 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
                    }
                    if ((i3 & 256) == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            fragmentManager2 = fragmentManager;
                            i4 |= composerStartRestartGroup.changedInstance(fragmentManager2) ? 67108864 : 33554432;
                        }
                        i5 = i3 & 512;
                        if (i5 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= composerStartRestartGroup.changed(modifier) ? 536870912 : 268435456;
                        }
                        i6 = i3 & 1024;
                        if (i6 != 0) {
                            i8 = i2 | 6;
                        } else {
                            if ((i2 & 6) != 0) {
                                i7 = i2;
                                if ((i4 & 306783379) == 306783378 || (i7 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier;
                                    GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType3 = i6 == 0 ? null : goldHubSettingsComponentTargetType;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-286824173, i4, i7, "com.robinhood.android.gold.hub.GoldHub (GoldHubComposable.kt:182)");
                                    }
                                    ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                    if (apiGoldHub.getEarningsTracker() == null) {
                                        composerStartRestartGroup.startReplaceGroup(-2088402429);
                                        fDimensionResource = PrimitiveResources_androidKt.dimensionResource(C17785R.dimen.gold_hub_tracker_header_size, composerStartRestartGroup, 0);
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(-2088321271);
                                        fDimensionResource = PrimitiveResources_androidKt.dimensionResource(C17785R.dimen.gold_hub_header_height, composerStartRestartGroup, 0);
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                    float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(C11182R.dimen.bento_app_bar_with_transition_default_height, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue != Composer.INSTANCE.getEmpty()) {
                                        modifier2 = modifier4;
                                        objRememberedValue = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(fDimensionResource2), null, 2, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    } else {
                                        modifier2 = modifier4;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1901311199, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldHub$1$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                                            invoke(bentoButtonBar3, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i9) {
                                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                            if ((i9 & 17) == 16 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1901311199, i9, -1, "com.robinhood.android.gold.hub.GoldHub.<anonymous>.<anonymous> (GoldHubComposable.kt:198)");
                                            }
                                            Button<GoldHubAction> fullWidthCta = apiGoldHub.getFullWidthCta();
                                            if (fullWidthCta != null) {
                                                SduiActionHandler<GoldHubAction> sduiActionHandler4 = sduiActionHandler;
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(companion);
                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                Arrangement.Vertical top = arrangement.getTop();
                                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierNavigationBarsPadding);
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                                Column6 column6 = Column6.INSTANCE;
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i10 = BentoTheme.$stable;
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM()), composer3, 0);
                                                ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(fullWidthCta);
                                                Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer3, 6, 1), Component.ComponentType.BUTTON, fullWidthCta.getLogging_identifier(), false, composer3, 48, 4);
                                                HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                                composer3.startReplaceGroup(-1772220517);
                                                SduiColumns.SduiColumn(immutableList3PersistentListOf, GoldHubAction.class, modifierAutoLogEvents, null, sduiActionHandler4, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composer3, 100859904, 0);
                                                composer3.endReplaceGroup();
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM()), composer3, 0);
                                                composer3.endNode();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54);
                                    Modifier modifier5 = modifier2;
                                    GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType4 = goldHubSettingsComponentTargetType3;
                                    GoldHubComposableKt$GoldHub$1$2 goldHubComposableKt$GoldHub$1$2 = new GoldHubComposableKt$GoldHub$1$2(goldHubSettingsComponentTargetType4, modifier5, scrollStateRememberScrollState, apiGoldHub, fDimensionResource, booleanRef, linkedHashMap, z3, fragmentManager2, apiGoldHubCard2, (SnapshotState) objRememberedValue, sduiActionHandler3, sduiActionHandler, moneyMovementPaymentPreferenceCellDuxo, z4, function02);
                                    composer2 = composerStartRestartGroup;
                                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-1410622770, true, goldHubComposableKt$GoldHub$1$2, composer2, 54), composer2, 3456, 3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    goldHubSettingsComponentTargetType2 = goldHubSettingsComponentTargetType4;
                                    modifier3 = modifier5;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    goldHubSettingsComponentTargetType2 = goldHubSettingsComponentTargetType;
                                    composer2 = composerStartRestartGroup;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return GoldHubComposableKt.GoldHub$lambda$5(apiGoldHub, z, sduiActionHandler, sduiActionHandler2, apiGoldHubCard, moneyMovementPaymentPreferenceCellDuxo, z2, function0, fragmentManager, modifier3, goldHubSettingsComponentTargetType2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i8 = i2 | (composerStartRestartGroup.changed(goldHubSettingsComponentTargetType == null ? -1 : goldHubSettingsComponentTargetType.ordinal()) ? 4 : 2);
                        }
                        i7 = i8;
                        if ((i4 & 306783379) == 306783378) {
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                            if (apiGoldHub.getEarningsTracker() == null) {
                            }
                            float fDimensionResource22 = PrimitiveResources_androidKt.dimensionResource(C11182R.dimen.bento_app_bar_with_transition_default_height, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue != Composer.INSTANCE.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1901311199, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldHub$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                                    invoke(bentoButtonBar3, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i9) {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i9 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1901311199, i9, -1, "com.robinhood.android.gold.hub.GoldHub.<anonymous>.<anonymous> (GoldHubComposable.kt:198)");
                                    }
                                    Button<GoldHubAction> fullWidthCta = apiGoldHub.getFullWidthCta();
                                    if (fullWidthCta != null) {
                                        SduiActionHandler<GoldHubAction> sduiActionHandler4 = sduiActionHandler;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(companion);
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.Vertical top = arrangement.getTop();
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierNavigationBarsPadding);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i10 = BentoTheme.$stable;
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM()), composer3, 0);
                                        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(fullWidthCta);
                                        Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer3, 6, 1), Component.ComponentType.BUTTON, fullWidthCta.getLogging_identifier(), false, composer3, 48, 4);
                                        HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                        composer3.startReplaceGroup(-1772220517);
                                        SduiColumns.SduiColumn(immutableList3PersistentListOf, GoldHubAction.class, modifierAutoLogEvents, null, sduiActionHandler4, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composer3, 100859904, 0);
                                        composer3.endReplaceGroup();
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM()), composer3, 0);
                                        composer3.endNode();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54);
                            Modifier modifier52 = modifier2;
                            GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType42 = goldHubSettingsComponentTargetType3;
                            GoldHubComposableKt$GoldHub$1$2 goldHubComposableKt$GoldHub$1$22 = new GoldHubComposableKt$GoldHub$1$2(goldHubSettingsComponentTargetType42, modifier52, scrollStateRememberScrollState2, apiGoldHub, fDimensionResource, booleanRef2, linkedHashMap2, z3, fragmentManager2, apiGoldHubCard2, (SnapshotState) objRememberedValue, sduiActionHandler3, sduiActionHandler, moneyMovementPaymentPreferenceCellDuxo, z4, function02);
                            composer2 = composerStartRestartGroup;
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(-1410622770, true, goldHubComposableKt$GoldHub$1$22, composer2, 54), composer2, 3456, 3);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            goldHubSettingsComponentTargetType2 = goldHubSettingsComponentTargetType42;
                            modifier3 = modifier52;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    fragmentManager2 = fragmentManager;
                    i5 = i3 & 512;
                    if (i5 != 0) {
                    }
                    i6 = i3 & 1024;
                    if (i6 != 0) {
                    }
                    i7 = i8;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function02 = function0;
                if ((i3 & 256) == 0) {
                }
                fragmentManager2 = fragmentManager;
                i5 = i3 & 512;
                if (i5 != 0) {
                }
                i6 = i3 & 1024;
                if (i6 != 0) {
                }
                i7 = i8;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            apiGoldHubCard2 = apiGoldHubCard;
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            function02 = function0;
            if ((i3 & 256) == 0) {
            }
            fragmentManager2 = fragmentManager;
            i5 = i3 & 512;
            if (i5 != 0) {
            }
            i6 = i3 & 1024;
            if (i6 != 0) {
            }
            i7 = i8;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z3 = z;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        apiGoldHubCard2 = apiGoldHubCard;
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        function02 = function0;
        if ((i3 & 256) == 0) {
        }
        fragmentManager2 = fragmentManager;
        i5 = i3 & 512;
        if (i5 != 0) {
        }
        i6 = i3 & 1024;
        if (i6 != 0) {
        }
        i7 = i8;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GoldHub$lambda$3(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: GoldEventSection-WMci_g0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15029GoldEventSectionWMci_g0(final FragmentManager fragmentManager, final float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        float f3;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-909790109);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(fragmentManager) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                f3 = f2;
                i3 |= composerStartRestartGroup.changed(f3) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                final float fM7995constructorimpl = i4 == 0 ? C2002Dp.m7995constructorimpl(400) : f3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-909790109, i3, -1, "com.robinhood.android.gold.hub.GoldEventSection (GoldHubComposable.kt:416)");
                }
                float f5 = fM7995constructorimpl;
                BentoTheme2.BentoTheme(Boolean.FALSE, Boolean.TRUE, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(223559083, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldEventSection$1
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
                            ComposerKt.traceEventStart(223559083, i5, -1, "com.robinhood.android.gold.hub.GoldEventSection.<anonymous> (GoldHubComposable.kt:418)");
                        }
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(WindowInsetsPadding_androidKt.statusBarsPadding(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getJet(), null, 2, null)), 0.0f, f, 0.0f, 0.0f, 13, null);
                        RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication(GoldEventHubManager.APP_NAME, null, 2, null);
                        FragmentManager fragmentManager2 = fragmentManager;
                        final float f6 = fM7995constructorimpl;
                        MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, fragmentManager2, modifierM5146paddingqDBjuR0$default, null, ComposableLambda3.rememberComposableLambda(-1547188774, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldEventSection$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1547188774, i6, -1, "com.robinhood.android.gold.hub.GoldEventSection.<anonymous>.<anonymous> (GoldHubComposable.kt:424)");
                                }
                                BoxKt.Box(com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f6), true, null, 2, null), composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, false, null, composer2, 24576, 488);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663350, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = f5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                f4 = f3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldHubComposableKt.GoldEventSection_WMci_g0$lambda$6(fragmentManager, f, f4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        f3 = f2;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float f52 = fM7995constructorimpl;
            BentoTheme2.BentoTheme(Boolean.FALSE, Boolean.TRUE, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(223559083, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldEventSection$1
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
                        ComposerKt.traceEventStart(223559083, i5, -1, "com.robinhood.android.gold.hub.GoldEventSection.<anonymous> (GoldHubComposable.kt:418)");
                    }
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(WindowInsetsPadding_androidKt.statusBarsPadding(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getJet(), null, 2, null)), 0.0f, f, 0.0f, 0.0f, 13, null);
                    RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication(GoldEventHubManager.APP_NAME, null, 2, null);
                    FragmentManager fragmentManager2 = fragmentManager;
                    final float f6 = fM7995constructorimpl;
                    MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, fragmentManager2, modifierM5146paddingqDBjuR0$default, null, ComposableLambda3.rememberComposableLambda(-1547188774, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldEventSection$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1547188774, i6, -1, "com.robinhood.android.gold.hub.GoldEventSection.<anonymous>.<anonymous> (GoldHubComposable.kt:424)");
                            }
                            BoxKt.Box(com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f6), true, null, 2, null), composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, null, false, null, composer2, 24576, 488);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663350, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            f4 = f52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GoldImageHeader(final ApiGoldHub apiGoldHub, Composer composer, final int i) {
        int i2;
        BentoTheme bentoTheme;
        int i3;
        Painter painterPainterResource;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(993548602);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(apiGoldHub) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(993548602, i2, -1, "com.robinhood.android.gold.hub.GoldImageHeader (GoldHubComposable.kt:438)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(SizeKt.m5156height3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme2.getColors(composerStartRestartGroup, i4).getJet(), null, 2, null), PrimitiveResources_androidKt.dimensionResource(C17785R.dimen.gold_hub_header_height, composerStartRestartGroup, 0)), false, RectangleShape2.getRectangleShape(), 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWithBentoPlaceholder$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (apiGoldHub.getImagePath() != null) {
                composerStartRestartGroup.startReplaceGroup(354660937);
                String imagePath = apiGoldHub.getImagePath();
                Intrinsics.checkNotNull(imagePath);
                i3 = i4;
                bentoTheme = bentoTheme2;
                painterPainterResource = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(imagePath, null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                bentoTheme = bentoTheme2;
                i3 = i4;
                composerStartRestartGroup.startReplaceGroup(354877875);
                painterPainterResource = PainterResources_androidKt.painterResource(C17785R.drawable.gold_hub_background, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            int i5 = i3;
            BentoTheme bentoTheme3 = bentoTheme;
            ImageKt.Image(painterPainterResource, (String) null, TestTag3.testTag(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), "headerImage"), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, 104);
            String title = apiGoldHub.getTitle();
            composerStartRestartGroup.startReplaceGroup(1812572847);
            if (title == null) {
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(boxScopeInstance.align(companion, companion2.getBottomStart()), bentoTheme3.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), composerStartRestartGroup, 0, 0), Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i5).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i5).getBookCoverCapsuleSmall(), composer2, 0, 0, 8184);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldHubComposableKt.GoldImageHeader$lambda$9(apiGoldHub, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GoldEarningsTrackerHeader-6a0pyJM, reason: not valid java name */
    public static final void m15028GoldEarningsTrackerHeader6a0pyJM(final ApiGoldEarningsTracker apiGoldEarningsTracker, final SduiActionHandler<? super GenericAction> sduiActionHandler, final float f, final InfoTag<? extends GenericAction> infoTag, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1116439574);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(apiGoldEarningsTracker) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiActionHandler) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(infoTag) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1116439574, i2, -1, "com.robinhood.android.gold.hub.GoldEarningsTrackerHeader (GoldHubComposable.kt:480)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1294912050, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldEarningsTrackerHeader$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    SduiActionHandler<GenericAction> sduiActionHandler2;
                    Unit unit;
                    ApiGoldEarningsTracker apiGoldEarningsTracker2;
                    BentoTheme bentoTheme;
                    int i4;
                    Modifier.Companion companion;
                    boolean z;
                    BentoTheme bentoTheme2;
                    Modifier.Companion companion2;
                    int i5;
                    int i6;
                    float f2;
                    int i7;
                    BentoTheme bentoTheme3;
                    int i8;
                    int i9;
                    Unit unit2;
                    Modifier.Companion companion3;
                    BentoTheme bentoTheme4;
                    int i10;
                    int i11;
                    Modifier.Companion companion4;
                    int i12;
                    String amount;
                    Composer composer3 = composer2;
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1294912050, i3, -1, "com.robinhood.android.gold.hub.GoldEarningsTrackerHeader.<anonymous> (GoldHubComposable.kt:482)");
                    }
                    ApiGoldEarningsTracker apiGoldEarningsTracker3 = apiGoldEarningsTracker;
                    float f3 = f;
                    final InfoTag<GenericAction> infoTag2 = infoTag;
                    SduiActionHandler<GenericAction> sduiActionHandler3 = sduiActionHandler;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    BentoTheme bentoTheme5 = BentoTheme.INSTANCE;
                    int i13 = BentoTheme.$stable;
                    Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme5.getColors(composer3, i13).m21371getBg0d7_KjU(), null, 2, null));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierStatusBarsPadding);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion6.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, f3), composer3, 0);
                    composer3.startReplaceGroup(-840292483);
                    if (infoTag2 == null) {
                        bentoTheme = bentoTheme5;
                        sduiActionHandler2 = sduiActionHandler3;
                        companion = companion5;
                        i4 = i13;
                        z = false;
                        apiGoldEarningsTracker2 = apiGoldEarningsTracker3;
                        unit = null;
                    } else {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme5.getSpacing(composer3, i13).m21593getSmallD9Ej5fM()), composer3, 0);
                        ThemedColor text_color_override = infoTag2.getText_color_override();
                        composer3.startReplaceGroup(-840287361);
                        Color composeColor = text_color_override == null ? null : SduiColors2.toComposeColor(text_color_override, composer3, 0);
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-840288081);
                        long jM21425getFg0d7_KjU = composeColor == null ? bentoTheme5.getColors(composer3, i13).m21425getFg0d7_KjU() : composeColor.getValue();
                        composer3.endReplaceGroup();
                        ThemedColor background_color_override = infoTag2.getBackground_color_override();
                        composer3.startReplaceGroup(-840284129);
                        Color composeColor2 = background_color_override == null ? null : SduiColors2.toComposeColor(background_color_override, composer3, 0);
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-840285035);
                        long jM21371getBg0d7_KjU = composeColor2 == null ? bentoTheme5.getColors(composer3, i13).m21371getBg0d7_KjU() : composeColor2.getValue();
                        composer3.endReplaceGroup();
                        sduiActionHandler2 = sduiActionHandler3;
                        unit = null;
                        apiGoldEarningsTracker2 = apiGoldEarningsTracker3;
                        bentoTheme = bentoTheme5;
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, jM21425getFg0d7_KjU, 0L, 0L, jM21371getBg0d7_KjU, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1712146758, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$GoldEarningsTrackerHeader$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i14) {
                                if ((i14 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1712146758, i14, -1, "com.robinhood.android.gold.hub.GoldEarningsTrackerHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldHubComposable.kt:496)");
                                }
                                SduiComponent3.SduiComponent(infoTag2, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer4, 6, 1), null, composer4, 0, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer2, 805306368, 493);
                        composer3 = composer2;
                        i4 = i13;
                        companion = companion5;
                        z = false;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i4).m21590getDefaultD9Ej5fM()), composer3, 0);
                    }
                    composer3.endReplaceGroup();
                    String title = apiGoldEarningsTracker2.getTitle();
                    composer3.startReplaceGroup(-840271097);
                    if (title == null) {
                        bentoTheme2 = bentoTheme;
                        i5 = i4;
                        companion2 = companion;
                    } else {
                        TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer3, i4).getDisplayCapsuleLarge();
                        long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer3, i4).m21425getFg0d7_KjU();
                        bentoTheme2 = bentoTheme;
                        companion2 = companion;
                        i5 = i4;
                        BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer3, 6, 1), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleLarge, composer3, 0, 0, 8184);
                    }
                    composer3.endReplaceGroup();
                    AnimatedAmountContent lifetimeAmount = apiGoldEarningsTracker2.getLifetimeAmount();
                    composer3.startReplaceGroup(-840259922);
                    if (lifetimeAmount == null) {
                        unit2 = unit;
                        bentoTheme3 = bentoTheme2;
                        i8 = i5;
                        i9 = 0;
                        i6 = 6;
                        f2 = 0.0f;
                        i7 = 1;
                    } else {
                        i6 = 6;
                        f2 = 0.0f;
                        i7 = 1;
                        AnimatedAmountContentComposable.AnimatedAmountContentComposable(lifetimeAmount, CylinderBarConstants.TOTAL_ANIMATION_DURATION, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer3, 6, 1), composer3, 48, 0);
                        bentoTheme3 = bentoTheme2;
                        i8 = i5;
                        i9 = 0;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme3.getSpacing(composer3, i8).m21595getXsmallD9Ej5fM()), composer3, 0);
                        unit2 = Unit.INSTANCE;
                    }
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-840259998);
                    if (unit2 != null || (amount = apiGoldEarningsTracker2.getAmount()) == null) {
                        companion3 = companion2;
                        bentoTheme4 = bentoTheme3;
                        i10 = i8;
                    } else {
                        Modifier.Companion companion7 = companion2;
                        bentoTheme4 = bentoTheme3;
                        BentoText2.m20747BentoText38GnDrw(amount, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, f2, composer3, i6, i7), Color.m6701boximpl(bentoTheme3.getColors(composer3, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer3, i8).getDisplayCapsuleLarge(), composer3, 0, 0, 8184);
                        i10 = i8;
                        companion3 = companion7;
                        i9 = 0;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme4.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM()), composer3, 0);
                    }
                    composer3.endReplaceGroup();
                    String description = apiGoldEarningsTracker2.getDescription();
                    composer3.startReplaceGroup(-840232245);
                    if (description == null) {
                        i11 = i10;
                        companion4 = companion3;
                        i12 = i9;
                    } else {
                        BentoText2.m20747BentoText38GnDrw(description, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer3, 6, 1), Color.m6701boximpl(bentoTheme4.getColors(composer3, i10).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer3, i10).getTextM(), composer3, 0, 0, 8184);
                        i11 = i10;
                        companion4 = companion3;
                        i12 = 0;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme4.getSpacing(composer3, i11).m21592getMediumD9Ej5fM()), composer3, 0);
                    }
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-840219399);
                    if (!apiGoldEarningsTracker2.getChartData().isEmpty()) {
                        GoldHubCylinderChartComposableKt.m15035GoldHubCylinderChartComposableDzVHIIc(extensions2.toPersistentList(apiGoldEarningsTracker2.getChartData()), PrimitiveResources_androidKt.dimensionResource(C17785R.dimen.gold_hub_tracker_cylinder_chart_height, composer3, i12), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composer3, 6, 1), true, composer3, 3072, 0);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme4.getSpacing(composer3, i11).m21591getLargeD9Ej5fM()), composer3, i12);
                    }
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-840203132);
                    Iterator<T> it = apiGoldEarningsTracker2.getEarningsRows().iterator();
                    while (it.hasNext()) {
                        GoldDepositBoostHubComposableKt.GoldHubEarningsRow((GoldEarningsSourceRow) it.next(), sduiActionHandler2, null, composer3, 0, 4);
                    }
                    composer3.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer3, i12);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldHubComposableKt.GoldEarningsTrackerHeader_6a0pyJM$lambda$10(apiGoldEarningsTracker, sduiActionHandler, f, infoTag, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:109:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BillingSection(final ApiGoldHubBillingSection apiGoldHubBillingSection, final SduiActionHandler<? super GoldHubAction> sduiActionHandler, Modifier modifier, Composer composer, final int i, final int i2) {
        ApiGoldHubBillingSection apiGoldHubBillingSection2;
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String subtitleMarkdown;
        boolean z;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        ApiGoldHubBilling membershipLeft;
        Modifier.Companion companion;
        boolean z2;
        ApiGoldHubBilling membershipRight;
        boolean z3;
        SduiActionHandler<? super GoldHubAction> sduiActionHandler2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-672849925);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            apiGoldHubBillingSection2 = apiGoldHubBillingSection;
        } else if ((i & 6) == 0) {
            apiGoldHubBillingSection2 = apiGoldHubBillingSection;
            i3 = (composerStartRestartGroup.changedInstance(apiGoldHubBillingSection2) ? 4 : 2) | i;
        } else {
            apiGoldHubBillingSection2 = apiGoldHubBillingSection;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sduiActionHandler) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-672849925, i3, -1, "com.robinhood.android.gold.hub.BillingSection (GoldHubComposable.kt:565)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String title = apiGoldHubBillingSection2.getTitle();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                subtitleMarkdown = apiGoldHubBillingSection.getSubtitleMarkdown();
                composerStartRestartGroup.startReplaceGroup(1483718053);
                if (subtitleMarkdown != null) {
                    z = true;
                } else {
                    final UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    z = true;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier2, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(uriHandler);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return GoldHubComposableKt.m2048x631ff52b(uriHandler, (String) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoMarkdownText2.BentoMarkdownText(subtitleMarkdown, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composerStartRestartGroup, 0, 14);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier3, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                membershipLeft = apiGoldHubBillingSection.getMembershipLeft();
                composerStartRestartGroup.startReplaceGroup(1560599838);
                if (membershipLeft != null) {
                    companion = companion4;
                    z2 = z;
                } else {
                    companion = companion4;
                    z2 = z;
                    Modifier modifierWeight$default = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                    Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(membershipLeft.getTitle(), null, 2, null), null, null, null, new AnnotatedString(membershipLeft.getValue(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, BentoDataRowState.$stable, 6);
                    composerStartRestartGroup.endNode();
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                membershipRight = apiGoldHubBillingSection.getMembershipRight();
                composerStartRestartGroup.startReplaceGroup(1560614753);
                if (membershipRight != null) {
                    z3 = false;
                } else {
                    Modifier modifierWeight$default2 = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
                    z3 = false;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                    Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor5);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(membershipRight.getTitle(), null, 2, null), null, null, null, new AnnotatedString(membershipRight.getValue(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, BentoDataRowState.$stable, 6);
                    composerStartRestartGroup.endNode();
                    Unit unit3 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(1483770695);
                for (final ApiGoldHubBilling apiGoldHubBilling : apiGoldHubBillingSection.getBillings()) {
                    apiGoldHubBilling.getAction();
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    boolean z4 = apiGoldHubBilling.getAction() != null ? z2 : z3;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(apiGoldHubBilling) | composerStartRestartGroup.changedInstance(sduiActionHandler);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GoldHubComposableKt.BillingSection$lambda$25$lambda$24$lambda$23$lambda$22$lambda$21(apiGoldHubBilling, sduiActionHandler);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(companion5, z4, null, null, (Function0) objRememberedValue2, 6, null), null, null, ComposableLambda3.rememberComposableLambda(762675760, z2, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$BillingSection$1$1$3$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(762675760, i6, -1, "com.robinhood.android.gold.hub.BillingSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldHubComposable.kt:622)");
                            }
                            AnnotatedString annotatedString = new AnnotatedString(apiGoldHubBilling.getTitle(), null, 2, null);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme2.getTypography(composer3, i7).getTextS(), composer3, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1899393807, z2, new GoldHubComposableKt$BillingSection$1$1$3$3(apiGoldHubBilling, sduiActionHandler), composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1366401651, z2, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$BillingSection$1$1$3$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1366401651, i6, -1, "com.robinhood.android.gold.hub.BillingSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldHubComposable.kt:644)");
                            }
                            if (apiGoldHubBilling.getAction() != null) {
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU(), null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), false, false, false, null, composer2, 1600512, 0, 1958);
                    composerStartRestartGroup = composer2;
                    z3 = z3;
                }
                sduiActionHandler2 = sduiActionHandler;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                Unit unit4 = Unit.INSTANCE;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                sduiActionHandler2 = sduiActionHandler;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final SduiActionHandler<? super GoldHubAction> sduiActionHandler3 = sduiActionHandler2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldHubComposableKt.BillingSection$lambda$26(apiGoldHubBillingSection, sduiActionHandler3, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor6 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap6, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier6, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String title2 = apiGoldHubBillingSection2.getTitle();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                TextStyle displayCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall();
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifier52 = modifier4;
                BentoText2.m20747BentoText38GnDrw(title2, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion42, 0.0f, composerStartRestartGroup, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                subtitleMarkdown = apiGoldHubBillingSection.getSubtitleMarkdown();
                composerStartRestartGroup.startReplaceGroup(1483718053);
                if (subtitleMarkdown != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion42, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier32, companion32.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    membershipLeft = apiGoldHubBillingSection.getMembershipLeft();
                    composerStartRestartGroup.startReplaceGroup(1560599838);
                    if (membershipLeft != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    membershipRight = apiGoldHubBillingSection.getMembershipRight();
                    composerStartRestartGroup.startReplaceGroup(1560614753);
                    if (membershipRight != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(1483770695);
                    while (r0.hasNext()) {
                    }
                    sduiActionHandler2 = sduiActionHandler;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    Unit unit42 = Unit.INSTANCE;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BillingSection$lambda$25$lambda$24$lambda$14$lambda$13$lambda$12$lambda$11 */
    public static final Unit m2048x631ff52b(UriHandler uriHandler, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        uriHandler.openUri(uri);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BillingSection$lambda$25$lambda$24$lambda$23$lambda$22$lambda$21(ApiGoldHubBilling apiGoldHubBilling, SduiActionHandler sduiActionHandler) {
        GoldHubAction action = apiGoldHubBilling.getAction();
        if (action != null) {
            sduiActionHandler.mo15941handle(action);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FeatureSection(final ApiGoldHubFeatureSection apiGoldHubFeatureSection, final SduiActionHandler<? super GoldHubAction> sduiActionHandler, final InfoTag<? extends GenericAction> infoTag, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1515366766);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(apiGoldHubFeatureSection) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiActionHandler) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(infoTag) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1515366766, i2, -1, "com.robinhood.android.gold.hub.FeatureSection (GoldHubComposable.kt:664)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
            int i3 = i2;
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1489386000, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$FeatureSection$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1489386000, i4, -1, "com.robinhood.android.gold.hub.FeatureSection.<anonymous>.<anonymous>.<anonymous> (GoldHubComposable.kt:668)");
                    }
                    final InfoTag<GenericAction> infoTag2 = infoTag;
                    if (infoTag2 != null) {
                        ThemedColor text_color_override = infoTag2.getText_color_override();
                        composer2.startReplaceGroup(1075840480);
                        Color composeColor = text_color_override == null ? null : SduiColors2.toComposeColor(text_color_override, composer2, 0);
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1075839760);
                        long jM21425getFg0d7_KjU = composeColor == null ? BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU() : composeColor.getValue();
                        composer2.endReplaceGroup();
                        ThemedColor background_color_override = infoTag2.getBackground_color_override();
                        composer2.startReplaceGroup(1075843712);
                        Color composeColor2 = background_color_override != null ? SduiColors2.toComposeColor(background_color_override, composer2, 0) : null;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1075842806);
                        long jM21371getBg0d7_KjU = composeColor2 == null ? BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU() : composeColor2.getValue();
                        composer2.endReplaceGroup();
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, jM21425getFg0d7_KjU, 0L, 0L, jM21371getBg0d7_KjU, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-62412453, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$FeatureSection$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i5) {
                                if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-62412453, i5, -1, "com.robinhood.android.gold.hub.FeatureSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldHubComposable.kt:673)");
                                }
                                SduiComponent3.SduiComponent(infoTag2, null, null, composer3, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306368, 493);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer2, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            String title = apiGoldHubFeatureSection.getTitle();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
            composerStartRestartGroup = composerStartRestartGroup;
            String subtitle = apiGoldHubFeatureSection.getSubtitle();
            composerStartRestartGroup.startReplaceGroup(-505747279);
            if (subtitle != null) {
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw(subtitle, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-505737487);
            for (ApiGoldHubFeature apiGoldHubFeature : apiGoldHubFeatureSection.getInactiveFeatures()) {
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Feature(apiGoldHubFeature, sduiActionHandler, false, composerStartRestartGroup, (i3 & 112) | 384);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-505730160);
            for (ApiGoldHubFeature apiGoldHubFeature2 : apiGoldHubFeatureSection.getActiveFeatures()) {
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Feature(apiGoldHubFeature2, sduiActionHandler, true, composerStartRestartGroup, (i3 & 112) | 384);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldHubComposableKt.FeatureSection$lambda$32(apiGoldHubFeatureSection, sduiActionHandler, infoTag, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Feature(final ApiGoldHubFeature apiGoldHubFeature, final SduiActionHandler<? super GoldHubAction> sduiActionHandler, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1884071892);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(apiGoldHubFeature) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiActionHandler) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1884071892, i2, -1, "com.robinhood.android.gold.hub.Feature (GoldHubComposable.kt:698)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-624073728, true, new GoldHubComposableKt$Feature$1$1(z, apiGoldHubFeature, sduiActionHandler), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldHubComposableKt.Feature$lambda$34(apiGoldHubFeature, sduiActionHandler, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GoldHubFailed(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1089521904);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1089521904, i3, -1, "com.robinhood.android.gold.hub.GoldHubFailed (GoldHubComposable.kt:809)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(modifierFillMaxSize$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_warning, null, false, BentoPogSize.Hero, null, null, null, composerStartRestartGroup, 3072, 118);
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.error_title, composerStartRestartGroup, 0);
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
            TextAlign.Companion companion2 = TextAlign.INSTANCE;
            int iM7919getCentere0LSkKk = companion2.m7919getCentere0LSkKk();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composer2 = composerStartRestartGroup;
            Modifier modifier4 = modifier3;
            BentoText2.m20747BentoText38GnDrw(strStringResource, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11048R.string.error_description, composer2, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8124);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldHubComposableKt.GoldHubFailed$lambda$36(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v29, types: [T, androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, androidx.compose.ui.Modifier] */
    public static final void Card(final ApiGoldHubCard apiGoldHubCard, final SduiActionHandler<? super GoldHubAction> sduiActionHandler, Composer composer, final int i) {
        int i2;
        ?? r0;
        Modifier.Companion companion;
        int i3;
        final SduiActionHandler<? super GoldHubAction> sduiActionHandler2;
        float f;
        Composer composerStartRestartGroup = composer.startRestartGroup(-184376014);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(apiGoldHubCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiActionHandler) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            sduiActionHandler2 = sduiActionHandler;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-184376014, i2, -1, "com.robinhood.android.gold.hub.Card (GoldHubComposable.kt:844)");
            }
            boolean zAreEqual = Intrinsics.areEqual(apiGoldHubCard.isImageFullBleed(), Boolean.TRUE);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            if (zAreEqual) {
                modifierFillMaxWidth$default = Intrinsic3.height(modifierFillMaxWidth$default, Intrinsic4.Min);
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierFillMaxWidth$default, 0.0f, composerStartRestartGroup, 0, 1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            objectRef.element = LocalShowPlaceholder.withBentoPlaceholder$default(Clip.clip(Background3.m4871backgroundbw27NRU(modifierM21623defaultHorizontalPaddingrAjV9yQ, bentoTheme.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM())), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM())), false, null, 3, null);
            TextButton<GoldHubAction> cta = apiGoldHubCard.getCta();
            final GoldHubAction goldHubAction = cta != null ? (GoldHubAction) cta.getAction() : null;
            composerStartRestartGroup.startReplaceGroup(-1091668692);
            if (goldHubAction != null) {
                Modifier modifier = (Modifier) objectRef.element;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(sduiActionHandler) | composerStartRestartGroup.changedInstance(goldHubAction);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoldHubComposableKt.Card$lambda$48$lambda$40$lambda$39$lambda$38(sduiActionHandler, goldHubAction);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                objectRef.element = ClickableKt.m4893clickableXHw0xAI$default(modifier, false, null, null, (Function0) objRememberedValue, 7, null);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier2 = (Modifier) objectRef.element;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(Row6.INSTANCE, companion2, 1.0f, false, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 0.0f, 10, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            String label = apiGoldHubCard.getLabel();
            composerStartRestartGroup.startReplaceGroup(1802764570);
            if (label != null) {
                BentoSparkleInfoTag.BentoSparkleInfoTag(label, null, null, null, false, null, composerStartRestartGroup, 197040, 24);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Unit unit2 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(apiGoldHubCard.getContent(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 0, 0, 8190);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            TextButton<GoldHubAction> cta2 = apiGoldHubCard.getCta();
            composerStartRestartGroup.startReplaceGroup(1802778563);
            if (cta2 == null) {
                sduiActionHandler2 = sduiActionHandler;
                companion = companion2;
                r0 = 0;
                i3 = 2;
            } else {
                ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(cta2);
                Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(companion2, Component.ComponentType.LINK_BUTTON, apiGoldHubCard.getId(), false, composerStartRestartGroup, 54, 4);
                HorizontalPadding horizontalPadding = HorizontalPadding.None;
                composerStartRestartGroup.startReplaceGroup(-1772220517);
                r0 = 0;
                companion = companion2;
                i3 = 2;
                SduiColumns.SduiColumn(immutableList3PersistentListOf, GoldHubAction.class, modifierAutoLogEvents, null, sduiActionHandler, horizontalPadding, arrangement.getTop(), companion3.getStart(), true, composerStartRestartGroup, 100859904 | (((((i2 << 6) & 7168) | 12607488) << 3) & 57344), 0);
                sduiActionHandler2 = sduiActionHandler;
                composerStartRestartGroup.endReplaceGroup();
                Unit unit3 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            String imagePath = apiGoldHubCard.getImagePath();
            composerStartRestartGroup.startReplaceGroup(-1552681232);
            if (imagePath != null) {
                HttpUrl imageDensityUrl = new ImageDensityUrl(imagePath, r0, i3, r0).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())));
                ContentScale.Companion companion5 = ContentScale.INSTANCE;
                AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(imageDensityUrl, null, null, zAreEqual ? companion5.getFillHeight() : companion5.getFillWidth(), 0, null, composerStartRestartGroup, 0, 54);
                ContentScale.Companion companion6 = ContentScale.INSTANCE;
                ContentScale fillHeight = zAreEqual ? companion6.getFillHeight() : companion6.getFillWidth();
                Alignment center = companion3.getCenter();
                composerStartRestartGroup.startReplaceGroup(-1552658458);
                Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(C17785R.dimen.gold_hub_card_image_size, composerStartRestartGroup, 0));
                if (zAreEqual) {
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    modifierM5174width3ABfNKs = SizeKt.m5158heightInVpY3zN4$default(modifierM5174width3ABfNKs, PrimitiveResources_androidKt.dimensionResource(C17785R.dimen.gold_hub_card_image_size, composerStartRestartGroup, 0), 0.0f, i3, r0);
                }
                composerStartRestartGroup.endReplaceGroup();
                ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, TestTag3.testTag(SizeKt.fillMaxHeight$default(modifierM5174width3ABfNKs, f, 1, r0), GoldHubComposableTestTag.CARD_IMAGE), center, fillHeight, 0.0f, (ColorFilter) null, composerStartRestartGroup, 3120, 96);
                composerStartRestartGroup = composerStartRestartGroup;
                Unit unit4 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            Unit unit5 = Unit.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubComposableKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldHubComposableKt.Card$lambda$49(apiGoldHubCard, sduiActionHandler2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Card$lambda$48$lambda$40$lambda$39$lambda$38(SduiActionHandler sduiActionHandler, GoldHubAction goldHubAction) {
        sduiActionHandler.mo15941handle(goldHubAction);
        return Unit.INSTANCE;
    }
}
