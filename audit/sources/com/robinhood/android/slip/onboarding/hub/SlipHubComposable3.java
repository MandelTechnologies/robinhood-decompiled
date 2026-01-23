package com.robinhood.android.slip.onboarding.hub;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChunk2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.slip.C28532R;
import com.robinhood.android.slip.onboarding.hub.SlipHubComposable3;
import com.robinhood.android.slip.onboarding.hub.p256ui.HubPageViewModel;
import com.robinhood.android.slip.onboarding.hub.p256ui.HubPageViewModel2;
import com.robinhood.android.slip.onboarding.hub.p256ui.SelectorChipState;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p320db.SlipHub;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.models.util.Money;
import io.noties.markwon.Markwon;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SlipHubComposable.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÝ\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000b0\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000b0\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000b0\u00162\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001bH\u0001¢\u0006\u0002\u0010'\u001a5\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u0010+\u001an\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201002!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000b0\u00162\f\u00103\u001a\b\u0012\u0004\u0012\u000202042\b\u00105\u001a\u0004\u0018\u0001062\b\b\u0002\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u00107\u001a7\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u0010=\u001a1\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020:2\b\b\u0001\u0010@\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u0010B\u001a(\u0010C\u001a\u00020\u000b*\u00020D2\u0006\u0010E\u001a\u00020F2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000b0\u0016H\u0002\u001a(\u0010G\u001a\u00020\u000b*\u00020D2\u0006\u0010E\u001a\u00020F2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000b0\u0016H\u0002\u001a)\u0010H\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020J2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000b0\u0016H\u0003¢\u0006\u0002\u0010K\u001a)\u0010L\u001a\u00020\u000b2\b\b\u0001\u0010@\u001a\u00020A2\u0006\u0010M\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u0010N\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006O²\u0006\n\u0010P\u001a\u00020\u0011X\u008a\u008e\u0002"}, m3636d2 = {"PAYMENTS_CARD_IMAGE_HEIGHT_DP", "Landroidx/compose/ui/unit/Dp;", "F", "DISABLED_ALPHA", "", "ENABLED_ALPHA", "ENABLE_BUTTON_TEST_TAG", "", "EMPTY_INSTRUMENTS_TEST_TAG", "INSTRUMENT_ROW_TEST_TAG", "SlipHubComposable", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "markwon", "Lio/noties/markwon/Markwon;", "isUpdatingAccountStatus", "", "isDay", "bottomSheetHost", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost;", "onClickTitleIcon", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "deeplinkUrl", "onClickAccountChip", "Lkotlin/Function0;", "onClickInstrumentRow", "Ljava/util/UUID;", "onClickSettingsButton", "onClickBackButton", "onUpdateAccountStatus", "accountStatus", "currentPageViewModel", "Lcom/robinhood/android/slip/onboarding/hub/ui/HubPageViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "onClickEnableCta", "(Lcom/robinhood/android/navigation/Navigator;Lio/noties/markwon/Markwon;ZZLcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/slip/onboarding/hub/ui/HubPageViewModel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "EnableStockLendingCta", "text", "onClick", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TitleAndHeaderContent", "title", "Lcom/robinhood/models/db/SlipHub$TextWithIconLink;", "headerContent", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "selectorChipState", "Lcom/robinhood/android/slip/onboarding/hub/ui/SelectorChipState;", "(Lcom/robinhood/models/db/SlipHub$TextWithIconLink;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/android/slip/onboarding/hub/ui/SelectorChipState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PaymentsInsightSection", "previousMonthPayments", "Lcom/robinhood/models/db/SlipHub$PaymentsCard;", "totalPayments", "isEnabled", "(Lcom/robinhood/models/db/SlipHub$PaymentsCard;Lcom/robinhood/models/db/SlipHub$PaymentsCard;ZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PaymentsCard", "payments", "imageRes", "", "(Lcom/robinhood/models/db/SlipHub$PaymentsCard;IZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "instrumentsSection", "Landroidx/compose/foundation/lazy/LazyListScope;", "section", "Lcom/robinhood/models/db/SlipHub$InstrumentsSection;", "instrumentRows", "InstrumentRow", "row", "Lcom/robinhood/models/db/SlipHub$InstrumentRow;", "(Lcom/robinhood/models/db/SlipHub$InstrumentRow;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ImageWithResource", "alpha", "(IFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-slip_externalDebug", "showConfirmationDialog"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SlipHubComposable3 {
    private static final float DISABLED_ALPHA = 0.3f;
    public static final String EMPTY_INSTRUMENTS_TEST_TAG = "EMPTY_INSTRUMENTS";
    private static final float ENABLED_ALPHA = 1.0f;
    public static final String ENABLE_BUTTON_TEST_TAG = "ENABLE_BUTTON";
    public static final String INSTRUMENT_ROW_TEST_TAG = "INSTRUMENT_ROW";
    private static final float PAYMENTS_CARD_IMAGE_HEIGHT_DP = C2002Dp.m7995constructorimpl(76);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnableStockLendingCta$lambda$1(String str, Function0 function0, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EnableStockLendingCta(str, function0, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageWithResource$lambda$16(int i, float f, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        ImageWithResource(i, f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRow$lambda$15(SlipHub.InstrumentRow instrumentRow, Function1 function1, int i, Composer composer, int i2) {
        InstrumentRow(instrumentRow, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentsCard$lambda$11(SlipHub.PaymentsCard paymentsCard, int i, boolean z, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        PaymentsCard(paymentsCard, i, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentsInsightSection$lambda$8(SlipHub.PaymentsCard paymentsCard, SlipHub.PaymentsCard paymentsCard2, boolean z, boolean z2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PaymentsInsightSection(paymentsCard, paymentsCard2, z, z2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SlipHubComposable$lambda$0(Navigator navigator, Markwon markwon, boolean z, boolean z2, RhBottomSheetDialogFragmentHost rhBottomSheetDialogFragmentHost, Function1 function1, Function0 function0, Function1 function12, Function0 function02, Function0 function03, Function1 function13, HubPageViewModel hubPageViewModel, Modifier modifier, Function0 function04, int i, int i2, int i3, Composer composer, int i4) {
        SlipHubComposable(navigator, markwon, z, z2, rhBottomSheetDialogFragmentHost, function1, function0, function12, function02, function03, function13, hubPageViewModel, modifier, function04, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TitleAndHeaderContent$lambda$6(SlipHub.TextWithIconLink textWithIconLink, ImmutableList immutableList, Function1 function1, SduiActionHandler sduiActionHandler, SelectorChipState selectorChipState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TitleAndHeaderContent(textWithIconLink, immutableList, function1, sduiActionHandler, selectorChipState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: SlipHubComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$SlipHubComposable$1 */
    static final class C286561 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ RhBottomSheetDialogFragmentHost $bottomSheetHost;
        final /* synthetic */ Context $context;
        final /* synthetic */ HubPageViewModel $currentPageViewModel;
        final /* synthetic */ boolean $isDay;
        final /* synthetic */ boolean $isUpdatingAccountStatus;
        final /* synthetic */ Markwon $markwon;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function0<Unit> $onClickAccountChip;
        final /* synthetic */ Function0<Unit> $onClickBackButton;
        final /* synthetic */ Function0<Unit> $onClickEnableCta;
        final /* synthetic */ Function1<UUID, Unit> $onClickInstrumentRow;
        final /* synthetic */ Function0<Unit> $onClickSettingsButton;
        final /* synthetic */ Function1<String, Unit> $onClickTitleIcon;
        final /* synthetic */ Function1<Boolean, Unit> $onUpdateAccountStatus;

        /* JADX WARN: Multi-variable type inference failed */
        C286561(HubPageViewModel hubPageViewModel, Function1<? super Boolean, Unit> function1, Modifier modifier, Function1<? super String, Unit> function12, Navigator navigator, RhBottomSheetDialogFragmentHost rhBottomSheetDialogFragmentHost, Markwon markwon, Function0<Unit> function0, boolean z, Function1<? super UUID, Unit> function13, Function0<Unit> function02, Context context, boolean z2, Function0<Unit> function03, Function0<Unit> function04) {
            this.$currentPageViewModel = hubPageViewModel;
            this.$onUpdateAccountStatus = function1;
            this.$modifier = modifier;
            this.$onClickTitleIcon = function12;
            this.$navigator = navigator;
            this.$bottomSheetHost = rhBottomSheetDialogFragmentHost;
            this.$markwon = markwon;
            this.$onClickAccountChip = function0;
            this.$isDay = z;
            this.$onClickInstrumentRow = function13;
            this.$onClickEnableCta = function02;
            this.$context = context;
            this.$isUpdatingAccountStatus = z2;
            this.$onClickBackButton = function03;
            this.$onClickSettingsButton = function04;
        }

        private static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* compiled from: SlipHubComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$SlipHubComposable$1$4, reason: invalid class name */
        static final class AnonymousClass4 implements Function3<PaddingValues, Composer, Integer, Unit> {
            final /* synthetic */ RhBottomSheetDialogFragmentHost $bottomSheetHost;
            final /* synthetic */ Context $context;
            final /* synthetic */ HubPageViewModel $currentPageViewModel;
            final /* synthetic */ boolean $isDay;
            final /* synthetic */ boolean $isUpdatingAccountStatus;
            final /* synthetic */ Markwon $markwon;
            final /* synthetic */ Navigator $navigator;
            final /* synthetic */ Function0<Unit> $onClickAccountChip;
            final /* synthetic */ Function0<Unit> $onClickBackButton;
            final /* synthetic */ Function0<Unit> $onClickEnableCta;
            final /* synthetic */ Function1<UUID, Unit> $onClickInstrumentRow;
            final /* synthetic */ Function0<Unit> $onClickSettingsButton;
            final /* synthetic */ Function1<String, Unit> $onClickTitleIcon;
            final /* synthetic */ Function1<Boolean, Unit> $onUpdateAccountStatus;
            final /* synthetic */ SnapshotState<Boolean> $showConfirmationDialog$delegate;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(HubPageViewModel hubPageViewModel, Function1<? super String, Unit> function1, Navigator navigator, RhBottomSheetDialogFragmentHost rhBottomSheetDialogFragmentHost, Markwon markwon, Function0<Unit> function0, boolean z, Function1<? super UUID, Unit> function12, Function0<Unit> function02, Context context, Function1<? super Boolean, Unit> function13, boolean z2, Function0<Unit> function03, Function0<Unit> function04, SnapshotState<Boolean> snapshotState) {
                this.$currentPageViewModel = hubPageViewModel;
                this.$onClickTitleIcon = function1;
                this.$navigator = navigator;
                this.$bottomSheetHost = rhBottomSheetDialogFragmentHost;
                this.$markwon = markwon;
                this.$onClickAccountChip = function0;
                this.$isDay = z;
                this.$onClickInstrumentRow = function12;
                this.$onClickEnableCta = function02;
                this.$context = context;
                this.$onUpdateAccountStatus = function13;
                this.$isUpdatingAccountStatus = z2;
                this.$onClickBackButton = function03;
                this.$onClickSettingsButton = function04;
                this.$showConfirmationDialog$delegate = snapshotState;
            }

            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                int i2;
                int i3;
                Navigator navigator;
                String enableButtonCta;
                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                if ((i & 6) == 0) {
                    i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i2 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2044695710, i2, -1, "com.robinhood.android.slip.onboarding.hub.SlipHubComposable.<anonymous>.<anonymous> (SlipHubComposable.kt:121)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                HubPageViewModel hubPageViewModel = this.$currentPageViewModel;
                final Function1<String, Unit> function1 = this.$onClickTitleIcon;
                final Navigator navigator2 = this.$navigator;
                final RhBottomSheetDialogFragmentHost rhBottomSheetDialogFragmentHost = this.$bottomSheetHost;
                final Markwon markwon = this.$markwon;
                final Function0<Unit> function0 = this.$onClickAccountChip;
                final boolean z = this.$isDay;
                final Function1<UUID, Unit> function12 = this.$onClickInstrumentRow;
                final Function0<Unit> function02 = this.$onClickEnableCta;
                final Context context = this.$context;
                final Function1<Boolean, Unit> function13 = this.$onUpdateAccountStatus;
                boolean z2 = this.$isUpdatingAccountStatus;
                Function0<Unit> function03 = this.$onClickBackButton;
                Function0<Unit> function04 = this.$onClickSettingsButton;
                final SnapshotState<Boolean> snapshotState = this.$showConfirmationDialog$delegate;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(SlipHubComposable.INSTANCE.getLambda$1519746689$feature_slip_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-1464697387, true, new SlipHubComposable4(function03), composer, 54), ComposableLambda3.rememberComposableLambda(1275536694, true, new SlipHubComposable5(function04), composer, 54), null, false, false, null, null, 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), composer, 3462, 0, 1010);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), composer, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), 0.0f, 1, null);
                composer.startReplaceGroup(-1224400529);
                final HubPageViewModel hubPageViewModel2 = hubPageViewModel;
                boolean zChangedInstance = composer.changedInstance(hubPageViewModel2) | composer.changed(function1) | composer.changedInstance(navigator2) | composer.changedInstance(rhBottomSheetDialogFragmentHost) | composer.changedInstance(markwon) | composer.changed(function0) | composer.changed(z) | composer.changed(function12);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    i3 = -1224400529;
                    Object obj = new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$SlipHubComposable$1$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SlipHubComposable3.C286561.AnonymousClass4.invoke$lambda$4$lambda$1$lambda$0(hubPageViewModel2, function12, function1, navigator2, rhBottomSheetDialogFragmentHost, markwon, function0, z, (LazyListScope) obj2);
                        }
                    };
                    hubPageViewModel2 = hubPageViewModel2;
                    navigator = navigator2;
                    composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                } else {
                    navigator = navigator2;
                    i3 = -1224400529;
                }
                Function1 function14 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                int i5 = i3;
                final HubPageViewModel hubPageViewModel3 = hubPageViewModel2;
                final Navigator navigator3 = navigator;
                LazyDslKt.LazyColumn(modifierFillMaxWidth$default, null, null, false, null, null, null, false, null, function14, composer, 0, 510);
                composer.startReplaceGroup(1683816915);
                if ((hubPageViewModel3 instanceof HubPageViewModel2) && (enableButtonCta = ((HubPageViewModel2) hubPageViewModel3).getEnableButtonCta()) != null && !StringsKt.isBlank(enableButtonCta)) {
                    composer.startReplaceGroup(i5);
                    boolean zChanged = composer.changed(function02) | composer.changedInstance(hubPageViewModel3) | composer.changedInstance(navigator3) | composer.changedInstance(context) | composer.changed(function13);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        Object obj2 = new Function0() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$SlipHubComposable$1$4$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SlipHubComposable3.C286561.AnonymousClass4.invoke$lambda$4$lambda$3$lambda$2(function02, hubPageViewModel3, navigator3, context, function13, snapshotState);
                            }
                        };
                        composer.updateRememberedValue(obj2);
                        objRememberedValue2 = obj2;
                    }
                    composer.endReplaceGroup();
                    SlipHubComposable3.EnableStockLendingCta(enableButtonCta, (Function0) objRememberedValue2, z2, SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(TestTag3.testTag(companion, SlipHubComposable3.ENABLE_BUTTON_TEST_TAG), bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), composer, 0, 0);
                }
                composer.endReplaceGroup();
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                invoke(paddingValues, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$4$lambda$1$lambda$0(final HubPageViewModel hubPageViewModel, Function1 function1, final Function1 function12, final Navigator navigator, final RhBottomSheetDialogFragmentHost rhBottomSheetDialogFragmentHost, final Markwon markwon, final Function0 function0, final boolean z, LazyListScope LazyColumn) {
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1307804969, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$SlipHubComposable$1$4$1$3$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1307804969, i, -1, "com.robinhood.android.slip.onboarding.hub.SlipHubComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SlipHubComposable.kt:146)");
                        }
                        SlipHubComposable3.TitleAndHeaderContent(hubPageViewModel.getTitle(), extensions2.toPersistentList(hubPageViewModel.getHeaderContent()), function12, SduiChunk2.rememberDefaultSduiChunkCallbacks(navigator, SduiChunk2.makeOnPresentBottomSheetFn(rhBottomSheetDialogFragmentHost, markwon, false), null, composer, 0, 4), hubPageViewModel.getSelectorChipState(function0), null, composer, 0, 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1672219296, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$SlipHubComposable$1$4$1$3$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1672219296, i, -1, "com.robinhood.android.slip.onboarding.hub.SlipHubComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SlipHubComposable.kt:164)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, composer, 6, 2), 0.0f, 1, null);
                        SlipHub.PaymentsCard lastMonthPaymentCard = hubPageViewModel.getLastMonthPaymentCard();
                        SlipHub.PaymentsCard totalPaymentCard = hubPageViewModel.getTotalPaymentCard();
                        HubPageViewModel hubPageViewModel2 = hubPageViewModel;
                        SlipHubComposable3.PaymentsInsightSection(lastMonthPaymentCard, totalPaymentCard, z, hubPageViewModel2 instanceof HubPageViewModel2 ? ((HubPageViewModel2) hubPageViewModel2).getIsEnabled() : true, modifierFillMaxWidth$default, composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
                SlipHubComposable3.instrumentsSection(LazyColumn, hubPageViewModel.getInstrumentsSection(), function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function0 function0, HubPageViewModel hubPageViewModel, Navigator navigator, Context context, Function1 function1, SnapshotState snapshotState) {
                if (function0 != null) {
                    function0.invoke();
                } else {
                    HubPageViewModel2 hubPageViewModel2 = (HubPageViewModel2) hubPageViewModel;
                    if (hubPageViewModel2.getEnableDeeplink() != null) {
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(hubPageViewModel2.getEnableDeeplink()), null, null, false, null, 60, null);
                    } else if (hubPageViewModel2.getEnableAlert() != null) {
                        C286561.invoke$lambda$2(snapshotState, true);
                    } else {
                        function1.invoke(Boolean.TRUE);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(Function1 function1, SnapshotState snapshotState) {
            function1.invoke(Boolean.TRUE);
            invoke$lambda$2(snapshotState, false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(SnapshotState snapshotState) {
            invoke$lambda$2(snapshotState, false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(SnapshotState snapshotState) {
            invoke$lambda$2(snapshotState, false);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(Composer composer, int i) {
            Composer composer2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1960058253, i, -1, "com.robinhood.android.slip.onboarding.hub.SlipHubComposable.<anonymous> (SlipHubComposable.kt:96)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1874658160);
            if (invoke$lambda$1(snapshotState)) {
                HubPageViewModel hubPageViewModel = this.$currentPageViewModel;
                if (!(hubPageViewModel instanceof HubPageViewModel2) || ((HubPageViewModel2) hubPageViewModel).getEnableAlert() == null) {
                    composer2 = composer;
                } else {
                    String title = ((HubPageViewModel2) this.$currentPageViewModel).getEnableAlert().getTitle();
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(((HubPageViewModel2) this.$currentPageViewModel).getEnableAlert().getContent());
                    String ctaButtonTitle = ((HubPageViewModel2) this.$currentPageViewModel).getEnableAlert().getCtaButtonTitle();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(this.$onUpdateAccountStatus);
                    final Function1<Boolean, Unit> function1 = this.$onUpdateAccountStatus;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$SlipHubComposable$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SlipHubComposable3.C286561.invoke$lambda$4$lambda$3(function1, snapshotState);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(ctaButtonTitle, (Function0) objRememberedValue2);
                    String dismissButtonTitle = ((HubPageViewModel2) this.$currentPageViewModel).getEnableAlert().getDismissButtonTitle();
                    composer.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$SlipHubComposable$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SlipHubComposable3.C286561.invoke$lambda$6$lambda$5(snapshotState);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceGroup();
                    BentoAlertButton bentoAlertButton2 = new BentoAlertButton(dismissButtonTitle, (Function0) objRememberedValue3);
                    composer.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$SlipHubComposable$1$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SlipHubComposable3.C286561.invoke$lambda$8$lambda$7(snapshotState);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function0 = (Function0) objRememberedValue4;
                    composer.endReplaceGroup();
                    int i2 = (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296;
                    int i3 = BentoAlertButton.$stable;
                    BentoAlertDialog.BentoAlertDialog(title, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composer, i2 | (i3 << 6) | (i3 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    composer2 = composer;
                }
            }
            composer2.endReplaceGroup();
            ScaffoldKt.m5939ScaffoldTvnljyQ(this.$modifier, null, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(2044695710, true, new AnonymousClass4(this.$currentPageViewModel, this.$onClickTitleIcon, this.$navigator, this.$bottomSheetHost, this.$markwon, this.$onClickAccountChip, this.$isDay, this.$onClickInstrumentRow, this.$onClickEnableCta, this.$context, this.$onUpdateAccountStatus, this.$isUpdatingAccountStatus, this.$onClickBackButton, this.$onClickSettingsButton, snapshotState), composer2, 54), composer2, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SlipHubComposable(final Navigator navigator, final Markwon markwon, final boolean z, final boolean z2, final RhBottomSheetDialogFragmentHost bottomSheetHost, final Function1<? super String, Unit> onClickTitleIcon, final Function0<Unit> onClickAccountChip, final Function1<? super UUID, Unit> onClickInstrumentRow, final Function0<Unit> onClickSettingsButton, final Function0<Unit> onClickBackButton, final Function1<? super Boolean, Unit> onUpdateAccountStatus, final HubPageViewModel currentPageViewModel, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Function0<Unit> function02;
        Composer composer2;
        final Modifier modifier2;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(bottomSheetHost, "bottomSheetHost");
        Intrinsics.checkNotNullParameter(onClickTitleIcon, "onClickTitleIcon");
        Intrinsics.checkNotNullParameter(onClickAccountChip, "onClickAccountChip");
        Intrinsics.checkNotNullParameter(onClickInstrumentRow, "onClickInstrumentRow");
        Intrinsics.checkNotNullParameter(onClickSettingsButton, "onClickSettingsButton");
        Intrinsics.checkNotNullParameter(onClickBackButton, "onClickBackButton");
        Intrinsics.checkNotNullParameter(onUpdateAccountStatus, "onUpdateAccountStatus");
        Intrinsics.checkNotNullParameter(currentPageViewModel, "currentPageViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(389518392);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(navigator) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(markwon) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                z3 = z;
                i4 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(bottomSheetHost) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(onClickTitleIcon) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(onClickAccountChip) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(onClickInstrumentRow) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(onClickSettingsButton) ? 67108864 : 33554432;
                }
                if ((i3 & 512) != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(onClickBackButton) ? 536870912 : 268435456;
                }
                if ((i3 & 1024) != 0) {
                    i5 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i5 = i2 | (composerStartRestartGroup.changedInstance(onUpdateAccountStatus) ? 4 : 2);
                } else {
                    i5 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i5 |= 48;
                } else if ((i2 & 48) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(currentPageViewModel) ? 32 : 16;
                }
                i6 = i3 & 4096;
                if (i6 != 0) {
                    i5 |= 384;
                    i7 = i6;
                } else {
                    i7 = i6;
                    if ((i2 & 384) == 0) {
                        i5 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                    }
                    i8 = i3 & 8192;
                    if (i8 != 0) {
                        i9 = i8;
                        if ((i2 & 3072) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
                        }
                        if ((i4 & 306783379) != 306783378 || (i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier;
                            Function0<Unit> function04 = i9 == 0 ? null : function0;
                            Modifier modifier4 = modifier3;
                            if (ComposerKt.isTraceInProgress()) {
                                function02 = function04;
                            } else {
                                function02 = function04;
                                ComposerKt.traceEventStart(389518392, i4, i5, "com.robinhood.android.slip.onboarding.hub.SlipHubComposable (SlipHubComposable.kt:93)");
                            }
                            Function0<Unit> function05 = function02;
                            composer2 = composerStartRestartGroup;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1960058253, true, new C286561(currentPageViewModel, onUpdateAccountStatus, modifier4, onClickTitleIcon, navigator, bottomSheetHost, markwon, onClickAccountChip, z2, onClickInstrumentRow, function05, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), z3, onClickBackButton, onClickSettingsButton), composer2, 54), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier4;
                            function03 = function05;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            function03 = function0;
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return SlipHubComposable3.SlipHubComposable$lambda$0(navigator, markwon, z, z2, bottomSheetHost, onClickTitleIcon, onClickAccountChip, onClickInstrumentRow, onClickSettingsButton, onClickBackButton, onUpdateAccountStatus, currentPageViewModel, modifier2, function03, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 3072;
                    i9 = i8;
                    if ((i4 & 306783379) != 306783378) {
                        if (i7 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        Modifier modifier42 = modifier3;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Function0<Unit> function052 = function02;
                        composer2 = composerStartRestartGroup;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1960058253, true, new C286561(currentPageViewModel, onUpdateAccountStatus, modifier42, onClickTitleIcon, navigator, bottomSheetHost, markwon, onClickAccountChip, z2, onClickInstrumentRow, function052, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), z3, onClickBackButton, onClickSettingsButton), composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier42;
                        function03 = function052;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i3 & 8192;
                if (i8 != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            i6 = i3 & 4096;
            if (i6 != 0) {
            }
            i8 = i3 & 8192;
            if (i8 != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        i6 = i3 & 4096;
        if (i6 != 0) {
        }
        i8 = i3 & 8192;
        if (i8 != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EnableStockLendingCta(final String str, final Function0<Unit> function0, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-724413620);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-724413620, i3, -1, "com.robinhood.android.slip.onboarding.hub.EnableStockLendingCta (SlipHubComposable.kt:224)");
                }
                int i5 = i3 >> 3;
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8(function02, str2, modifier2, null, BentoButtons.Type.Primary, !z, false, null, null, null, null, false, null, composer2, ((i3 << 3) & 112) | (i5 & 14) | 24576 | (i5 & 896), 0, 8136);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SlipHubComposable3.EnableStockLendingCta$lambda$1(str, function0, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = i3 >> 3;
            composer2 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8(function02, str2, modifier2, null, BentoButtons.Type.Primary, !z, false, null, null, null, null, false, null, composer2, ((i3 << 3) & 112) | (i52 & 14) | 24576 | (i52 & 896), 0, 8136);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TitleAndHeaderContent(final SlipHub.TextWithIconLink textWithIconLink, final ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, final Function1<? super String, Unit> function1, final SduiActionHandler<? super GenericAction> sduiActionHandler, final SelectorChipState selectorChipState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        SduiActionHandler<? super GenericAction> sduiActionHandler2;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-626371585);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(textWithIconLink) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    sduiActionHandler2 = sduiActionHandler;
                    i3 |= composerStartRestartGroup.changedInstance(sduiActionHandler2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(selectorChipState) ? 16384 : 8192;
                }
                i4 = i2 & 32;
                if (i4 == 0) {
                    if ((196608 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                    if ((74899 & i3) != 74898 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        composer2 = composerStartRestartGroup;
                    } else {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-626371585, i3, -1, "com.robinhood.android.slip.onboarding.hub.TitleAndHeaderContent (SlipHubComposable.kt:242)");
                        }
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Alignment.Vertical centerVertically = companion.getCenterVertically();
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        String title = textWithIconLink.getTitle();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        Modifier modifier5 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                        composer2 = composerStartRestartGroup;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(textWithIconLink.getIcon());
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU();
                        composer2.startReplaceGroup(-1633490746);
                        zChangedInstance = composer2.changedInstance(textWithIconLink) | ((i3 & 896) != 256);
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SlipHubComposable3.TitleAndHeaderContent$lambda$5$lambda$4$lambda$3$lambda$2(function1, textWithIconLink);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size24, "Slip Hub Title Icon", jM21425getFg0d7_KjU, modifierM5146paddingqDBjuR0$default, (Function0) objRememberedValue, false, composer2, BentoIcon4.Size24.$stable | 48, 32);
                        composer2.endNode();
                        composer2.startReplaceGroup(-341684572);
                        if (selectorChipState != null) {
                            BentoChip.BentoDropdownChip(selectorChipState.getOnClick(), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion3, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 0.0f, composer2, 6, 2), false, null, selectorChipState.getText(), composer2, 0, 12);
                            composer2 = composer2;
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-341675217);
                        if (!immutableList.isEmpty()) {
                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            int i6 = ((i3 >> 3) & 14) | 12582912 | (i3 & 7168);
                            composer2.startReplaceGroup(-1772220517);
                            Composer composer3 = composer2;
                            SduiColumns.SduiColumn(immutableList, GenericAction.class, modifierM5146paddingqDBjuR0$default2, null, sduiActionHandler2, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), false, composer3, ((i6 << 3) & 57344) | (i6 & 14) | 100663296, 0);
                            composer2 = composer3;
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SlipHubComposable3.TitleAndHeaderContent$lambda$6(textWithIconLink, immutableList, function1, sduiActionHandler, selectorChipState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((74899 & i3) != 74898) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composerStartRestartGroup, 6, 1);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            String title2 = textWithIconLink.getTitle();
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i52 = BentoTheme.$stable;
                            Modifier modifier52 = modifier4;
                            BentoText2.m20747BentoText38GnDrw(title2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                            composer2 = composerStartRestartGroup;
                            Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(companion32, bentoTheme2.getSpacing(composer2, i52).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                            BentoIcon4.Size24 size242 = new BentoIcon4.Size24(textWithIconLink.getIcon());
                            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer2, i52).m21425getFg0d7_KjU();
                            composer2.startReplaceGroup(-1633490746);
                            zChangedInstance = composer2.changedInstance(textWithIconLink) | ((i3 & 896) != 256);
                            objRememberedValue = composer2.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SlipHubComposable3.TitleAndHeaderContent$lambda$5$lambda$4$lambda$3$lambda$2(function1, textWithIconLink);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                                composer2.endReplaceGroup();
                                BentoIcon2.m20644BentoIconFU0evQE(size242, "Slip Hub Title Icon", jM21425getFg0d7_KjU2, modifierM5146paddingqDBjuR0$default3, (Function0) objRememberedValue, false, composer2, BentoIcon4.Size24.$stable | 48, 32);
                                composer2.endNode();
                                composer2.startReplaceGroup(-341684572);
                                if (selectorChipState != null) {
                                }
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(-341675217);
                                if (!immutableList.isEmpty()) {
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            sduiActionHandler2 = sduiActionHandler;
            if ((i2 & 16) != 0) {
            }
            i4 = i2 & 32;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((74899 & i3) != 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        sduiActionHandler2 = sduiActionHandler;
        if ((i2 & 16) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TitleAndHeaderContent$lambda$5$lambda$4$lambda$3$lambda$2(Function1 function1, SlipHub.TextWithIconLink textWithIconLink) {
        function1.invoke(textWithIconLink.getUrl());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentsInsightSection(final SlipHub.PaymentsCard paymentsCard, final SlipHub.PaymentsCard paymentsCard2, final boolean z, final boolean z2, Modifier modifier, Composer composer, final int i, final int i2) {
        SlipHub.PaymentsCard paymentsCard3;
        int i3;
        SlipHub.PaymentsCard paymentsCard4;
        boolean z3;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        int i5;
        int i6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-327229871);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            paymentsCard3 = paymentsCard;
        } else if ((i & 6) == 0) {
            paymentsCard3 = paymentsCard;
            i3 = (composerStartRestartGroup.changedInstance(paymentsCard3) ? 4 : 2) | i;
        } else {
            paymentsCard3 = paymentsCard;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                paymentsCard4 = paymentsCard2;
                i3 |= composerStartRestartGroup.changedInstance(paymentsCard4) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-327229871, i3, -1, "com.robinhood.android.slip.onboarding.hub.PaymentsInsightSection (SlipHubComposable.kt:285)");
                    }
                    if (!z) {
                        i5 = C28532R.drawable.slip_hub_payments_card_previous_month_day;
                    } else {
                        i5 = C28532R.drawable.slip_hub_payments_card_previous_month_night;
                    }
                    int i7 = i5;
                    if (!z) {
                        i6 = C28532R.drawable.slip_hub_payments_card_total_day;
                    } else {
                        i6 = C28532R.drawable.slip_hub_payments_card_total_night;
                    }
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    int i8 = i6;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    int i9 = i3 & 14;
                    int i10 = i3 >> 3;
                    PaymentsCard(paymentsCard3, i7, z3, Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, (i10 & 896) | i9, 0);
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    PaymentsCard(paymentsCard4, i8, z2, Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, i10 & 910, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SlipHubComposable3.PaymentsInsightSection$lambda$8(paymentsCard, paymentsCard2, z, z2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (!z) {
                }
                int i72 = i5;
                if (!z) {
                }
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                int i82 = i6;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    int i92 = i3 & 14;
                    int i102 = i3 >> 3;
                    PaymentsCard(paymentsCard3, i72, z3, Row5.weight$default(row62, companion22, 1.0f, false, 2, null), composerStartRestartGroup, (i102 & 896) | i92, 0);
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion22, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    PaymentsCard(paymentsCard4, i82, z2, Row5.weight$default(row62, companion22, 1.0f, false, 2, null), composerStartRestartGroup, i102 & 910, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        paymentsCard4 = paymentsCard2;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PaymentsCard(final SlipHub.PaymentsCard paymentsCard, final int i, final boolean z, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-651244602);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(paymentsCard) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            i5 = i;
        } else {
            i5 = i;
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            } else {
                modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-651244602, i4, -1, "com.robinhood.android.slip.onboarding.hub.PaymentsCard (SlipHubComposable.kt:319)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment center = companion.getCenter();
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(modifier3, fM7995constructorimpl, bentoTheme.getColors(composerStartRestartGroup, i7).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4876borderxT4_qwU);
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
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                ImageWithResource(i5, !z ? 1.0f : 0.3f, SizeKt.m5156height3ABfNKs(companion3, PAYMENTS_CARD_IMAGE_HEIGHT_DP), composerStartRestartGroup, ((i4 >> 3) & 14) | 384, 0);
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(Money.format$default(paymentsCard.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleSmall(), composer2, 0, 0, 8190);
                BentoText2.m20747BentoText38GnDrw(paymentsCard.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8190);
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SlipHubComposable3.PaymentsCard$lambda$11(paymentsCard, i, z, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i4 & 1171) != 1170) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment center2 = companion4.getCenter();
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            Modifier modifierM4876borderxT4_qwU2 = BorderKt.m4876borderxT4_qwU(modifier3, fM7995constructorimpl2, bentoTheme2.getColors(composerStartRestartGroup, i72).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4876borderxT4_qwU2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Alignment.Horizontal centerHorizontally2 = companion4.getCenterHorizontally();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM());
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    ImageWithResource(i5, !z ? 1.0f : 0.3f, SizeKt.m5156height3ABfNKs(companion32, PAYMENTS_CARD_IMAGE_HEIGHT_DP), composerStartRestartGroup, ((i4 >> 3) & 14) | 384, 0);
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(Money.format$default(paymentsCard.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleSmall(), composer2, 0, 0, 8190);
                    BentoText2.m20747BentoText38GnDrw(paymentsCard.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i72).getTextS(), composer2, 0, 0, 8190);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void instrumentsSection(LazyListScope lazyListScope, final SlipHub.InstrumentsSection instrumentsSection, Function1<? super UUID, Unit> function1) {
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1053404332, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt.instrumentsSection.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1053404332, i, -1, "com.robinhood.android.slip.onboarding.hub.instrumentsSection.<anonymous> (SlipHubComposable.kt:357)");
                }
                String title = instrumentsSection.getTitle();
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(title, com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 0.0f, composer, 6, 2), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-2028244163, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt.instrumentsSection.2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2028244163, i, -1, "com.robinhood.android.slip.onboarding.hub.instrumentsSection.<anonymous> (SlipHubComposable.kt:364)");
                }
                String subtitle = instrumentsSection.getSubtitle();
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(subtitle, com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), 0.0f, composer, 6, 2), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8184);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        if (instrumentsSection.getInstruments().isEmpty()) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1732608871, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt.instrumentsSection.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1732608871, i, -1, "com.robinhood.android.slip.onboarding.hub.instrumentsSection.<anonymous> (SlipHubComposable.kt:374)");
                    }
                    String emptyStateText = instrumentsSection.getEmptyStateText();
                    int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(emptyStateText, PaddingKt.m5142padding3ABfNKs(TestTag3.testTag(Modifier.INSTANCE, SlipHubComposable3.EMPTY_INSTRUMENTS_TEST_TAG), bentoTheme.getSpacing(composer, i2).m21596getXxlargeD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        } else {
            instrumentRows(lazyListScope, instrumentsSection, function1);
        }
    }

    private static final void instrumentRows(LazyListScope lazyListScope, final SlipHub.InstrumentsSection instrumentsSection, final Function1<? super UUID, Unit> function1) {
        for (final SlipHub.InstrumentRow instrumentRow : instrumentsSection.getInstruments()) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(240683903, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$instrumentRows$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(240683903, i, -1, "com.robinhood.android.slip.onboarding.hub.instrumentRows.<anonymous>.<anonymous> (SlipHubComposable.kt:398)");
                    }
                    SlipHubComposable3.InstrumentRow(instrumentRow, function1, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-308184677, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt.instrumentRows.2
            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-308184677, i, -1, "com.robinhood.android.slip.onboarding.hub.instrumentRows.<anonymous> (SlipHubComposable.kt:406)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), composer, 6, 0);
                SlipHub.InstrumentsSection instrumentsSection2 = instrumentsSection;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                BentoMarkdownText2.BentoMarkdownText(instrumentsSection2.getDisclosureMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), 0, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), false, composer, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }
        }), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstrumentRow(final SlipHub.InstrumentRow instrumentRow, final Function1<? super UUID, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-38159501);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(instrumentRow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-38159501, i2, -1, "com.robinhood.android.slip.onboarding.hub.InstrumentRow (SlipHubComposable.kt:425)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, INSTRUMENT_ROW_TEST_TAG);
            String primaryText = instrumentRow.getPrimaryText();
            String secondaryText = instrumentRow.getSecondaryText();
            BentoBaseRowState.Meta.SingleLine singleLine = new BentoBaseRowState.Meta.SingleLine(instrumentRow.getMetadataText());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(instrumentRow);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SlipHubComposable3.InstrumentRow$lambda$14$lambda$13(function1, instrumentRow);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierTestTag, null, primaryText, secondaryText, null, singleLine, null, false, false, false, 0L, (Function0) objRememberedValue, composer2, (BentoBaseRowState.Meta.SingleLine.$stable << 15) | 6, 0, 2002);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipHubComposable3.InstrumentRow$lambda$15(instrumentRow, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRow$lambda$14$lambda$13(Function1 function1, SlipHub.InstrumentRow instrumentRow) {
        function1.invoke(instrumentRow.getInstrumentId());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ImageWithResource(final int i, final float f, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        float f2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-784463291);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            f2 = f;
        } else {
            f2 = f;
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
        }
        int i5 = i3 & 4;
        if (i5 == 0) {
            if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-784463291, i4, -1, "com.robinhood.android.slip.onboarding.hub.ImageWithResource (SlipHubComposable.kt:442)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14), "", modifier3, (Alignment) null, ContentScale.INSTANCE.getFit(), f2, (ColorFilter) null, composerStartRestartGroup, (i4 & 896) | 24624 | ((i4 << 12) & 458752), 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SlipHubComposable3.ImageWithResource$lambda$16(i, f, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 384;
        modifier2 = modifier;
        if ((i4 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14), "", modifier3, (Alignment) null, ContentScale.INSTANCE.getFit(), f2, (ColorFilter) null, composerStartRestartGroup, (i4 & 896) | 24624 | ((i4 << 12) & 458752), 72);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
