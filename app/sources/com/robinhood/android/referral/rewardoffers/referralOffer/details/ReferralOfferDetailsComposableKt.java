package com.robinhood.android.referral.rewardoffers.referralOffer.details;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Focusable2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.IconButton2;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.referral.C26659R;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ContactsAccessDeniedViewState;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ContactsAccessGrantedViewState;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewData;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.util.GetMultiSelectContactSelectionText;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.util.ReferralOfferDetailsViewStates;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.component.BentoTextInputState;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoSpacing;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.extensions.ThemedImageUrlExtensions;
import com.robinhood.models.serverdriven.GenericButtonType;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ReferralEntryPointContext;
import com.robinhood.rosetta.eventlogging.ReferralInviteContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.Either;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Standard2;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReferralOfferDetailsComposable.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001a»\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010\u0011H\u0001¢\u0006\u0002\u0010\"\u001a-\u0010#\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020$2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010%\u001aM\u0010&\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020$2\u0006\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150*2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010+\u001a-\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010.\u001aY\u0010/\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u00100\u001aw\u00101\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u00102\"\u000e\u00103\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u00065²\u0006\n\u00106\u001a\u00020!X\u008a\u0084\u0002²\u0006\n\u00107\u001a\u00020\tX\u008a\u0084\u0002"}, m3636d2 = {"ReferralOfferDetailsComposable", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "entryPointContext", "Lcom/robinhood/rosetta/eventlogging/ReferralEntryPointContext;", "displayMetrics", "Landroid/util/DisplayMetrics;", "screenTitle", "", "viewState", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;", "onAdditionalInfoClicked", "Lkotlin/Function0;", "onCloseClick", "onSendSelectedInvitesClicked", "onDeeplinkHandle", "Lkotlin/Function1;", "Landroid/net/Uri;", "onInviteContactsClicked", "onInviteContactClicked", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactInfo;", "onContactSelected", "onContactDeselected", "onClearSelectedContactsClicked", "onPastRewardsClick", "onSearchStarted", "onCancelSearchClicked", "onSearchQueryChanged", "onShareButtonClicked", "modifier", "Landroidx/compose/ui/Modifier;", "onPermissionRequestResponseReceived", "", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/ReferralEntryPointContext;Landroid/util/DisplayMetrics;Ljava/lang/String;Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIII)V", "StickySearchBarComposable", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ContactsAccessGrantedViewState;", "(Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ContactsAccessGrantedViewState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RealSearchBarComposable", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "checkedItems", "Lkotlinx/collections/immutable/ImmutableSet;", "(Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ContactsAccessGrantedViewState;Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/collections/immutable/ImmutableSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NoOpSearchFieldComposable", "placeholderText", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "TopBarComposable", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/ReferralEntryPointContext;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BottomBarComposable", "(Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/ReferralEntryPointContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PLACEHOLDER_PRIMARY_TEXT", "PLACEHOLDER_SECONDARY_TEXT", "feature-referral_externalDebug", "isCollapsed", "query"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ReferralOfferDetailsComposableKt {
    private static final String PLACEHOLDER_PRIMARY_TEXT = "Some primary text";
    private static final String PLACEHOLDER_SECONDARY_TEXT = "Some secondary text this";

    /* compiled from: ReferralOfferDetailsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericButtonType.values().length];
            try {
                iArr[GenericButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarComposable$lambda$29(ReferralOfferDetailsViewState referralOfferDetailsViewState, Screen screen, ReferralEntryPointContext referralEntryPointContext, Function1 function1, Function0 function0, Function0 function02, Function1 function12, Function0 function03, int i, Composer composer, int i2) {
        BottomBarComposable(referralOfferDetailsViewState, screen, referralEntryPointContext, function1, function0, function02, function12, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoOpSearchFieldComposable$lambda$19(String str, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        NoOpSearchFieldComposable(str, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RealSearchBarComposable$lambda$14(ContactsAccessGrantedViewState contactsAccessGrantedViewState, LazyListState lazyListState, ImmutableSet immutableSet, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        RealSearchBarComposable(contactsAccessGrantedViewState, lazyListState, immutableSet, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReferralOfferDetailsComposable$lambda$1(Screen screen, ReferralEntryPointContext referralEntryPointContext, DisplayMetrics displayMetrics, String str, ReferralOfferDetailsViewState referralOfferDetailsViewState, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function0 function04, Function1 function12, Function1 function13, Function1 function14, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Function1 function15, Function1 function16, Modifier modifier, Function1 function17, int i, int i2, int i3, int i4, Composer composer, int i5) {
        ReferralOfferDetailsComposable(screen, referralEntryPointContext, displayMetrics, str, referralOfferDetailsViewState, function0, function02, function03, function1, function04, function12, function13, function14, function05, function06, function07, function08, function15, function16, modifier, function17, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickySearchBarComposable$lambda$3(ContactsAccessGrantedViewState contactsAccessGrantedViewState, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        StickySearchBarComposable(contactsAccessGrantedViewState, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBarComposable$lambda$20(Screen screen, ReferralEntryPointContext referralEntryPointContext, String str, Function0 function0, Function0 function02, Modifier modifier, Function0 function03, int i, int i2, Composer composer, int i3) {
        TopBarComposable(screen, referralEntryPointContext, str, function0, function02, modifier, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final String RealSearchBarComposable$lambda$13$lambda$12$lambda$6(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReferralOfferDetailsComposable(final Screen eventScreen, final ReferralEntryPointContext entryPointContext, final DisplayMetrics displayMetrics, final String screenTitle, final ReferralOfferDetailsViewState viewState, final Function0<Unit> onAdditionalInfoClicked, final Function0<Unit> onCloseClick, final Function0<Unit> onSendSelectedInvitesClicked, final Function1<? super Uri, Unit> onDeeplinkHandle, final Function0<Unit> onInviteContactsClicked, final Function1<? super ReferralOfferDetailsViewData.ContactInfo, Unit> onInviteContactClicked, final Function1<? super ReferralOfferDetailsViewData.ContactInfo, Unit> onContactSelected, final Function1<? super ReferralOfferDetailsViewData.ContactInfo, Unit> onContactDeselected, final Function0<Unit> onClearSelectedContactsClicked, final Function0<Unit> onPastRewardsClick, final Function0<Unit> onSearchStarted, final Function0<Unit> onCancelSearchClicked, final Function1<? super String, Unit> onSearchQueryChanged, final Function1<? super String, Unit> onShareButtonClicked, Modifier modifier, final Function1<? super Boolean, Unit> onPermissionRequestResponseReceived, Composer composer, final int i, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean zChanged;
        Object objRememberedValue;
        ContactsAccessGrantedViewState contactsAccessGrantedViewStateIfGranted;
        Composer composer2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(entryPointContext, "entryPointContext");
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onAdditionalInfoClicked, "onAdditionalInfoClicked");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onSendSelectedInvitesClicked, "onSendSelectedInvitesClicked");
        Intrinsics.checkNotNullParameter(onDeeplinkHandle, "onDeeplinkHandle");
        Intrinsics.checkNotNullParameter(onInviteContactsClicked, "onInviteContactsClicked");
        Intrinsics.checkNotNullParameter(onInviteContactClicked, "onInviteContactClicked");
        Intrinsics.checkNotNullParameter(onContactSelected, "onContactSelected");
        Intrinsics.checkNotNullParameter(onContactDeselected, "onContactDeselected");
        Intrinsics.checkNotNullParameter(onClearSelectedContactsClicked, "onClearSelectedContactsClicked");
        Intrinsics.checkNotNullParameter(onPastRewardsClick, "onPastRewardsClick");
        Intrinsics.checkNotNullParameter(onSearchStarted, "onSearchStarted");
        Intrinsics.checkNotNullParameter(onCancelSearchClicked, "onCancelSearchClicked");
        Intrinsics.checkNotNullParameter(onSearchQueryChanged, "onSearchQueryChanged");
        Intrinsics.checkNotNullParameter(onShareButtonClicked, "onShareButtonClicked");
        Intrinsics.checkNotNullParameter(onPermissionRequestResponseReceived, "onPermissionRequestResponseReceived");
        Composer composerStartRestartGroup = composer.startRestartGroup(73815351);
        if ((i4 & 1) != 0) {
            i5 = i;
            i6 = i5 | 6;
        } else {
            i5 = i;
            if ((i5 & 6) == 0) {
                i6 = i5 | (composerStartRestartGroup.changedInstance(eventScreen) ? 4 : 2);
            } else {
                i6 = i5;
            }
        }
        if ((i4 & 2) != 0) {
            i6 |= 48;
        } else if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(entryPointContext) ? 32 : 16;
        }
        int i18 = i6;
        if ((i4 & 4) != 0) {
            i7 = i18 | 384;
        } else if ((i5 & 384) == 0) {
            i7 = i18 | (composerStartRestartGroup.changedInstance(displayMetrics) ? 256 : 128);
        } else {
            i7 = i18;
        }
        if ((i4 & 8) != 0) {
            i8 = i7 | 3072;
        } else {
            int i19 = i7;
            if ((i5 & 3072) == 0) {
                i8 = i19 | (composerStartRestartGroup.changed(screenTitle) ? 2048 : 1024);
            } else {
                i8 = i19;
            }
        }
        if ((i4 & 16) != 0) {
            i9 = i8 | 24576;
        } else {
            int i20 = i8;
            if ((i5 & 24576) == 0) {
                i9 = i20 | (composerStartRestartGroup.changed(viewState) ? 16384 : 8192);
            } else {
                i9 = i20;
            }
        }
        if ((i4 & 32) != 0) {
            i9 |= 196608;
        } else if ((i5 & 196608) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(onAdditionalInfoClicked) ? 131072 : 65536;
        }
        if ((i4 & 64) != 0) {
            i9 |= 1572864;
        } else if ((i5 & 1572864) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 1048576 : 524288;
        }
        int i21 = i9;
        if ((i4 & 128) != 0) {
            i10 = i21 | 12582912;
        } else if ((i5 & 12582912) == 0) {
            i10 = i21 | (composerStartRestartGroup.changedInstance(onSendSelectedInvitesClicked) ? 8388608 : 4194304);
        } else {
            i10 = i21;
        }
        int i22 = i10;
        if ((i4 & 256) != 0) {
            i11 = i22 | 100663296;
        } else if ((i5 & 100663296) == 0) {
            i11 = i22 | (composerStartRestartGroup.changedInstance(onDeeplinkHandle) ? 67108864 : 33554432);
        } else {
            i11 = i22;
        }
        int i23 = i11;
        if ((i4 & 512) != 0) {
            i12 = i23 | 805306368;
        } else if ((i5 & 805306368) == 0) {
            i12 = i23 | (composerStartRestartGroup.changedInstance(onInviteContactsClicked) ? 536870912 : 268435456);
        } else {
            i12 = i23;
        }
        if ((i4 & 1024) != 0) {
            i13 = i2;
            i14 = i13 | 6;
        } else {
            i13 = i2;
            if ((i13 & 6) == 0) {
                i14 = i13 | (composerStartRestartGroup.changedInstance(onInviteContactClicked) ? 4 : 2);
            } else {
                i14 = i13;
            }
        }
        if ((i4 & 2048) != 0) {
            i14 |= 48;
        } else if ((i13 & 48) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(onContactSelected) ? 32 : 16;
        }
        int i24 = i14;
        if ((i4 & 4096) != 0) {
            i24 |= 384;
        } else if ((i13 & 384) == 0) {
            i24 |= composerStartRestartGroup.changedInstance(onContactDeselected) ? 256 : 128;
        }
        if ((i4 & 8192) != 0) {
            i24 |= 3072;
        } else {
            if ((i13 & 3072) == 0) {
                i24 |= composerStartRestartGroup.changedInstance(onClearSelectedContactsClicked) ? 2048 : 1024;
            }
            if ((i4 & 16384) == 0) {
                i24 |= 24576;
            } else {
                if ((i13 & 24576) == 0) {
                    i24 |= composerStartRestartGroup.changedInstance(onPastRewardsClick) ? 16384 : 8192;
                }
                if ((i4 & 32768) == 0) {
                    if ((i13 & 196608) == 0) {
                        i15 = i24 | (composerStartRestartGroup.changedInstance(onSearchStarted) ? 131072 : 65536);
                    }
                    if ((i4 & 65536) == 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        i15 |= composerStartRestartGroup.changedInstance(onCancelSearchClicked) ? 1048576 : 524288;
                    }
                    if ((i4 & 131072) == 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        i15 |= composerStartRestartGroup.changedInstance(onSearchQueryChanged) ? 8388608 : 4194304;
                    }
                    if ((i4 & 262144) == 0) {
                        i15 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        i15 |= composerStartRestartGroup.changedInstance(onShareButtonClicked) ? 67108864 : 33554432;
                    }
                    i16 = i4 & 524288;
                    if (i16 == 0) {
                        i15 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        i15 |= composerStartRestartGroup.changed(modifier) ? 536870912 : 268435456;
                    }
                    int i25 = i15;
                    if ((i4 & 1048576) == 0) {
                        i17 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        i17 = i3 | (composerStartRestartGroup.changedInstance(onPermissionRequestResponseReceived) ? 4 : 2);
                    } else {
                        i17 = i3;
                    }
                    if ((i12 & 306783379) == 306783378 || (306783379 & i25) != 306783378 || (i17 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier3 = i16 == 0 ? Modifier.INSTANCE : modifier;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(73815351, i12, i25, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposable (ReferralOfferDetailsComposable.kt:124)");
                        }
                        ContactsAccessGrantedViewState contactsAccessGrantedViewStateIfGranted2 = ReferralOfferDetailsViewStates.ifGranted(viewState);
                        Set<ReferralOfferDetailsViewData.ContactInfo> selectedContacts = contactsAccessGrantedViewStateIfGranted2 == null ? contactsAccessGrantedViewStateIfGranted2.getSelectedContacts() : null;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(selectedContacts);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            contactsAccessGrantedViewStateIfGranted = ReferralOfferDetailsViewStates.ifGranted(viewState);
                            if (contactsAccessGrantedViewStateIfGranted != null || (setEmptySet = contactsAccessGrantedViewStateIfGranted.getSelectedContacts()) == null) {
                                Set<ReferralOfferDetailsViewData.ContactInfo> setEmptySet = SetsKt.emptySet();
                            }
                            objRememberedValue = setEmptySet;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        final Set set = (Set) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        composer2 = composerStartRestartGroup;
                        final Modifier modifier4 = modifier3;
                        ScaffoldKt.m5625Scaffold27mzLpw(null, null, ComposableLambda3.rememberComposableLambda(-618194222, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt.ReferralOfferDetailsComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i26) {
                                if ((i26 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-618194222, i26, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposable.<anonymous> (ReferralOfferDetailsComposable.kt:131)");
                                }
                                if (viewState.isTopBarVisible()) {
                                    composer3.startReplaceGroup(195754719);
                                    ReferralOfferDetailsComposableKt.TopBarComposable(eventScreen, entryPointContext, screenTitle, onAdditionalInfoClicked, onCloseClick, null, onPastRewardsClick, composer3, 0, 32);
                                    composer3.endReplaceGroup();
                                } else if (viewState instanceof ContactsAccessGrantedViewState) {
                                    composer3.startReplaceGroup(196205738);
                                    ReferralOfferDetailsComposableKt.RealSearchBarComposable((ContactsAccessGrantedViewState) viewState, lazyListStateRememberLazyListState, extensions2.toImmutableSet(set), onSearchQueryChanged, onCancelSearchClicked, composer3, 0);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(196549776);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(840126137, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt.ReferralOfferDetailsComposable.2

                            /* compiled from: ReferralOfferDetailsComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                                final /* synthetic */ Set<ReferralOfferDetailsViewData.ContactInfo> $checkedItems;
                                final /* synthetic */ DisplayMetrics $displayMetrics;
                                final /* synthetic */ ReferralEntryPointContext $entryPointContext;
                                final /* synthetic */ Screen $eventScreen;
                                final /* synthetic */ LazyListState $listState;
                                final /* synthetic */ Function0<Unit> $onAdditionalInfoClicked;
                                final /* synthetic */ Function1<ReferralOfferDetailsViewData.ContactInfo, Unit> $onContactDeselected;
                                final /* synthetic */ Function1<ReferralOfferDetailsViewData.ContactInfo, Unit> $onContactSelected;
                                final /* synthetic */ Function1<ReferralOfferDetailsViewData.ContactInfo, Unit> $onInviteContactClicked;
                                final /* synthetic */ Function1<Boolean, Unit> $onPermissionRequestResponseReceived;
                                final /* synthetic */ Function0<Unit> $onSearchStarted;
                                final /* synthetic */ ReferralOfferDetailsViewState $viewState;

                                /* JADX WARN: Multi-variable type inference failed */
                                AnonymousClass2(ReferralOfferDetailsViewState referralOfferDetailsViewState, LazyListState lazyListState, DisplayMetrics displayMetrics, Function0<Unit> function0, Function0<Unit> function02, Set<ReferralOfferDetailsViewData.ContactInfo> set, Function1<? super ReferralOfferDetailsViewData.ContactInfo, Unit> function1, Function1<? super ReferralOfferDetailsViewData.ContactInfo, Unit> function12, ReferralEntryPointContext referralEntryPointContext, Screen screen, Function1<? super ReferralOfferDetailsViewData.ContactInfo, Unit> function13, Function1<? super Boolean, Unit> function14) {
                                    this.$viewState = referralOfferDetailsViewState;
                                    this.$listState = lazyListState;
                                    this.$displayMetrics = displayMetrics;
                                    this.$onAdditionalInfoClicked = function0;
                                    this.$onSearchStarted = function02;
                                    this.$checkedItems = set;
                                    this.$onContactDeselected = function1;
                                    this.$onContactSelected = function12;
                                    this.$entryPointContext = referralEntryPointContext;
                                    this.$eventScreen = screen;
                                    this.$onInviteContactClicked = function13;
                                    this.$onPermissionRequestResponseReceived = function14;
                                }

                                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
                                    Function0<Unit> function0;
                                    DisplayMetrics displayMetrics;
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1285011551, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposable.<anonymous>.<anonymous> (ReferralOfferDetailsComposable.kt:171)");
                                    }
                                    final List<ReferralOfferDetailsViewData> viewDataList = this.$viewState.getViewDataList();
                                    final LazyListState lazyListState = this.$listState;
                                    final DisplayMetrics displayMetrics2 = this.$displayMetrics;
                                    final Function0<Unit> function02 = this.$onAdditionalInfoClicked;
                                    final Function0<Unit> function03 = this.$onSearchStarted;
                                    final ReferralOfferDetailsViewState referralOfferDetailsViewState = this.$viewState;
                                    final Set<ReferralOfferDetailsViewData.ContactInfo> set = this.$checkedItems;
                                    final Function1<ReferralOfferDetailsViewData.ContactInfo, Unit> function1 = this.$onContactDeselected;
                                    final Function1<ReferralOfferDetailsViewData.ContactInfo, Unit> function12 = this.$onContactSelected;
                                    final ReferralEntryPointContext referralEntryPointContext = this.$entryPointContext;
                                    final Screen screen = this.$eventScreen;
                                    final Function1<ReferralOfferDetailsViewData.ContactInfo, Unit> function13 = this.$onInviteContactClicked;
                                    final Function1<Boolean, Unit> function14 = this.$onPermissionRequestResponseReceived;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance = composer.changedInstance(viewDataList) | composer.changedInstance(displayMetrics2) | composer.changed(function02) | composer.changed(function03) | composer.changed(referralOfferDetailsViewState) | composer.changedInstance(set) | composer.changed(function1) | composer.changed(function12) | composer.changedInstance(referralEntryPointContext) | composer.changedInstance(screen) | composer.changed(function13);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return ReferralOfferDetailsComposableKt.C268442.AnonymousClass2.invoke$lambda$17$lambda$6$lambda$5(viewDataList, function02, function03, referralOfferDetailsViewState, set, function1, function12, referralEntryPointContext, screen, function13, displayMetrics2, (LazyListScope) obj);
                                            }
                                        };
                                        function0 = function03;
                                        displayMetrics = displayMetrics2;
                                        composer.updateRememberedValue(objRememberedValue);
                                    } else {
                                        displayMetrics = displayMetrics2;
                                        function0 = function03;
                                    }
                                    composer.endReplaceGroup();
                                    Function0<Unit> function04 = function0;
                                    LazyDslKt.LazyColumn(modifierFillMaxWidth$default, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 6, 508);
                                    composer.startReplaceGroup(-1386778297);
                                    if (referralOfferDetailsViewState instanceof ContactsAccessGrantedViewState) {
                                        ContactsAccessGrantedViewState contactsAccessGrantedViewState = (ContactsAccessGrantedViewState) referralOfferDetailsViewState;
                                        final double aspectRatio = (displayMetrics.widthPixels * contactsAccessGrantedViewState.getHeaderImageViewData().getAspectRatio()) + ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(BentoSpacing.INSTANCE.m21598default().m21591getLargeD9Ej5fM());
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return Boolean.valueOf(ReferralOfferDetailsComposableKt.C268442.AnonymousClass2.invoke$lambda$17$lambda$9$lambda$8(lazyListState, aspectRatio));
                                                }
                                            });
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        if (invoke$lambda$17$lambda$10((SnapshotState4) objRememberedValue2) && !contactsAccessGrantedViewState.isSearching()) {
                                            ReferralOfferDetailsComposableKt.StickySearchBarComposable(contactsAccessGrantedViewState, null, function04, composer, 0, 2);
                                        }
                                    }
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1386746871);
                                    if ((referralOfferDetailsViewState instanceof ContactsAccessDeniedViewState) && ((ContactsAccessDeniedViewState) referralOfferDetailsViewState).getShowPermissionsDialog()) {
                                        String strStringResource = StringResources_androidKt.stringResource(C26659R.string.referral_offer_permissions_dialog_title, composer, 0);
                                        BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(StringResources_androidKt.stringResource(C26659R.string.referral_offer_permissions_dialog_message_md, composer, 0));
                                        String strStringResource2 = StringResources_androidKt.stringResource(C26659R.string.referral_offer_permissions_dialog_primary_cta, composer, 0);
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged = composer.changed(function14);
                                        Object objRememberedValue3 = composer.rememberedValue();
                                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return ReferralOfferDetailsComposableKt.C268442.AnonymousClass2.invoke$lambda$17$lambda$12$lambda$11(function14);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer.endReplaceGroup();
                                        BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue3);
                                        String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged2 = composer.changed(function14);
                                        Object objRememberedValue4 = composer.rememberedValue();
                                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return ReferralOfferDetailsComposableKt.C268442.AnonymousClass2.invoke$lambda$17$lambda$14$lambda$13(function14);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer.endReplaceGroup();
                                        BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue4);
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged3 = composer.changed(function14);
                                        Object objRememberedValue5 = composer.rememberedValue();
                                        if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return ReferralOfferDetailsComposableKt.C268442.AnonymousClass2.invoke$lambda$17$lambda$16$lambda$15(function14);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue5);
                                        }
                                        Function0 function05 = (Function0) objRememberedValue5;
                                        composer.endReplaceGroup();
                                        int i2 = BentoAlertDialog2.Body.MarkdownText.$stable << 3;
                                        int i3 = BentoAlertButton.$stable;
                                        BentoAlertDialog.BentoAlertDialog(strStringResource, markdownText, bentoAlertButton, null, bentoAlertButton2, null, false, null, function05, composer, i2 | (i3 << 6) | (i3 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                                    }
                                    composer.endReplaceGroup();
                                    composer.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                private static final boolean invoke$lambda$17$lambda$10(SnapshotState4<Boolean> snapshotState4) {
                                    return snapshotState4.getValue().booleanValue();
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$17$lambda$6$lambda$5(final List list, final Function0 function0, final Function0 function02, final ReferralOfferDetailsViewState referralOfferDetailsViewState, final Set set, final Function1 function1, final Function1 function12, final ReferralEntryPointContext referralEntryPointContext, final Screen screen, final Function1 function13, final DisplayMetrics displayMetrics, LazyListScope LazyColumn) {
                                    Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                    final C26836x4773e6ce c26836x4773e6ce = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$invoke$lambda$17$lambda$6$lambda$5$$inlined$items$default$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Void invoke(ReferralOfferDetailsViewData referralOfferDetailsViewData) {
                                            return null;
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            return invoke((ReferralOfferDetailsViewData) obj);
                                        }
                                    };
                                    LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$invoke$lambda$17$lambda$6$lambda$5$$inlined$items$default$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                            return invoke(num.intValue());
                                        }

                                        public final Object invoke(int i) {
                                            return c26836x4773e6ce.invoke(list.get(i));
                                        }
                                    }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$invoke$lambda$17$lambda$6$lambda$5$$inlined$items$default$4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: Removed duplicated region for block: B:100:0x06cc  */
                                        /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                            int i3;
                                            AnnotatedString annotatedString;
                                            String string2;
                                            TextStyle displayCapsuleMedium;
                                            C26839x4773e6d1 c26839x4773e6d1 = this;
                                            Composer composer2 = composer;
                                            if ((i2 & 6) == 0) {
                                                i3 = i2 | (composer2.changed(lazyItemScope) ? 4 : 2);
                                            } else {
                                                i3 = i2;
                                            }
                                            if ((i2 & 48) == 0) {
                                                i3 |= composer2.changed(i) ? 32 : 16;
                                            }
                                            if (!composer2.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                            }
                                            final ReferralOfferDetailsViewData referralOfferDetailsViewData = (ReferralOfferDetailsViewData) list.get(i);
                                            composer2.startReplaceGroup(1628155947);
                                            if (referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.HeaderImage) {
                                                composer2.startReplaceGroup(1627960615);
                                                ReferralOfferDetailsViewData.HeaderImage headerImage = (ReferralOfferDetailsViewData.HeaderImage) referralOfferDetailsViewData;
                                                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(ThemedImageUrlExtensions.getResolvedUrl(headerImage.getImageUrl(), composer2, 0), null, null, null, 0, null, composer, 0, 62), "", SizeKt.m5156height3ABfNKs(TestTag3.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), "headerImage"), C2002Dp.m7993boximpl(((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (displayMetrics.widthPixels * headerImage.getAspectRatio()))).getValue()), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer, 24624, 104);
                                                composer2 = composer;
                                                composer2.endReplaceGroup();
                                            } else if (referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.Spacing) {
                                                composer2.startReplaceGroup(1628954103);
                                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, ((ReferralOfferDetailsViewData.Spacing) referralOfferDetailsViewData).m18085getSizeD9Ej5fM()), composer2, 0);
                                                composer2.endReplaceGroup();
                                            } else if (referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.TitleText) {
                                                composer2.startReplaceGroup(1629149806);
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i4 = BentoTheme.$stable;
                                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                                ReferralOfferDetailsViewData.TitleText titleText = (ReferralOfferDetailsViewData.TitleText) referralOfferDetailsViewData;
                                                AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo = RichTexts2.m15956toAnnotatedStringiJQMabo(titleText.getText(), 0L, composer2, 0, 1);
                                                if (titleText.isLarge()) {
                                                    composer2.startReplaceGroup(1629414825);
                                                    displayCapsuleMedium = bentoTheme.getTypography(composer2, i4).getDisplayCapsuleLarge();
                                                    composer2.endReplaceGroup();
                                                } else {
                                                    composer2.startReplaceGroup(1629540840);
                                                    displayCapsuleMedium = bentoTheme.getTypography(composer2, i4).getDisplayCapsuleMedium();
                                                    composer2.endReplaceGroup();
                                                }
                                                BentoText2.m20748BentoTextQnj7Zds(annotatedStringM15956toAnnotatedStringiJQMabo, modifierM5144paddingVpY3zN4$default, null, null, null, null, null, 0, false, 0, 0, null, null, displayCapsuleMedium, composer, 0, 0, 8188);
                                                composer2 = composer;
                                                composer2.endReplaceGroup();
                                            } else if (referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.SubtitleText) {
                                                composer2.startReplaceGroup(1629841540);
                                                composer2.startReplaceGroup(606764777);
                                                ReferralOfferDetailsViewData.SubtitleText subtitleText = (ReferralOfferDetailsViewData.SubtitleText) referralOfferDetailsViewData;
                                                if (subtitleText.getAdditionalInfoText() != null) {
                                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer2, 0);
                                                }
                                                composer2.endReplaceGroup();
                                                final UriHandler uriHandler = (UriHandler) composer2.consume(CompositionLocalsKt.getLocalUriHandler());
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                                int i5 = BentoTheme.$stable;
                                                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                                RichText text = subtitleText.getText();
                                                TextStyle textM = bentoTheme2.getTypography(composer2, i5).getTextM();
                                                composer2.startReplaceGroup(5004770);
                                                boolean zChangedInstance = composer2.changedInstance(uriHandler);
                                                Object objRememberedValue = composer2.rememberedValue();
                                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function1<Uri, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$1$1$1$1$2$1
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
                                                            invoke2(uri);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(Uri uri) {
                                                            Intrinsics.checkNotNullParameter(uri, "uri");
                                                            UriHandler uriHandler2 = uriHandler;
                                                            String string3 = uri.toString();
                                                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                                            uriHandler2.openUri(string3);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue);
                                                }
                                                composer2.endReplaceGroup();
                                                BentoRichText.m15948BentoRichText0sCZWFg(text, modifierM5144paddingVpY3zN4$default2, textM, 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composer, 0, 504);
                                                composer2 = composer;
                                                if (subtitleText.getAdditionalInfoText() != null) {
                                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                                                    c26839x4773e6d1 = this;
                                                    BentoTextButton2.m20715BentoTextButtonPIknLig(function0, subtitleText.getAdditionalInfoText().getText(), PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, false, null, composer, 0, 120);
                                                    composer2 = composer;
                                                } else {
                                                    c26839x4773e6d1 = this;
                                                }
                                                composer2.endReplaceGroup();
                                            } else {
                                                if (!(referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.SearchField)) {
                                                    if (referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.ContactSectionHeader) {
                                                        composer2.startReplaceGroup(1631581322);
                                                        Resources resources = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                                        int i6 = BentoTheme.$stable;
                                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme3.getSpacing(composer2, i6).m21592getMediumD9Ej5fM()), composer2, 0);
                                                        StringResource text2 = ((ReferralOfferDetailsViewData.ContactSectionHeader) referralOfferDetailsViewData).getText();
                                                        Intrinsics.checkNotNull(resources);
                                                        BentoText2.m20747BentoText38GnDrw(text2.getText(resources).toString(), PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme3.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i6).getTextS(), composer, 24576, 0, 8172);
                                                        composer2 = composer;
                                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme3.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM()), composer2, 0);
                                                        composer2.endReplaceGroup();
                                                    } else if (referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.ContactInfo) {
                                                        composer2.startReplaceGroup(1632465132);
                                                        Resources resources2 = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                                                        if (ReferralOfferDetailsViewStates.asGranted(referralOfferDetailsViewState).isMultiSelectContactMember()) {
                                                            composer2.startReplaceGroup(1632540431);
                                                            BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.Checkbox;
                                                            ReferralOfferDetailsViewData.ContactInfo contactInfo = (ReferralOfferDetailsViewData.ContactInfo) referralOfferDetailsViewData;
                                                            String string3 = contactInfo.getPrimaryText().toString();
                                                            Either<StringResource, AnnotatedString> secondaryText = contactInfo.getSecondaryText();
                                                            if (secondaryText instanceof Either.Left) {
                                                                StringResource stringResource = (StringResource) ((Either.Left) contactInfo.getSecondaryText()).getValue();
                                                                Intrinsics.checkNotNull(resources2);
                                                                string2 = stringResource.getText(resources2).toString();
                                                            } else {
                                                                if (!(secondaryText instanceof Either.Right)) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                string2 = ((AnnotatedString) ((Either.Right) contactInfo.getSecondaryText()).getValue()).toString();
                                                            }
                                                            BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, string3, set.contains(referralOfferDetailsViewData), (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(string2), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2032, (DefaultConstructorMarker) null);
                                                            composer2.startReplaceGroup(-1224400529);
                                                            boolean zChangedInstance2 = composer2.changedInstance(set) | composer2.changed(referralOfferDetailsViewData) | composer2.changed(function1) | composer2.changed(function12);
                                                            Object objRememberedValue2 = composer2.rememberedValue();
                                                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                                final Set set2 = set;
                                                                final Function1 function14 = function1;
                                                                final Function1 function15 = function12;
                                                                objRememberedValue2 = new Function0<Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$1$1$1$1$3$1
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                                        invoke2();
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2() {
                                                                        if (set2.contains(referralOfferDetailsViewData)) {
                                                                            function14.invoke(referralOfferDetailsViewData);
                                                                        } else {
                                                                            function15.invoke(referralOfferDetailsViewData);
                                                                        }
                                                                    }
                                                                };
                                                                composer2.updateRememberedValue(objRememberedValue2);
                                                            }
                                                            composer2.endReplaceGroup();
                                                            BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue2, composer2, BentoSelectionRowState.$stable << 3, 1);
                                                            composer2.endReplaceGroup();
                                                        } else {
                                                            composer2.startReplaceGroup(1634124810);
                                                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen, UserInteractionEventData.Action.INVITE_CONTACTS, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, referralEntryPointContext, null, new ReferralInviteContext(1, true, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -41, -1, 16383, null), new Component(Component.ComponentType.ROW, null, null, 6, null), null, 33, null), true, false, false, true, false, null, 108, null);
                                                            ReferralOfferDetailsViewData.ContactInfo contactInfo2 = (ReferralOfferDetailsViewData.ContactInfo) referralOfferDetailsViewData;
                                                            BentoBaseRowState.Text.Annotated annotated = new BentoBaseRowState.Text.Annotated(contactInfo2.getPrimaryText(), null, 2, null);
                                                            Either<StringResource, AnnotatedString> secondaryText2 = contactInfo2.getSecondaryText();
                                                            if (secondaryText2 instanceof Either.Left) {
                                                                StringResource stringResource2 = (StringResource) ((Either.Left) contactInfo2.getSecondaryText()).getValue();
                                                                Intrinsics.checkNotNull(resources2);
                                                                annotatedString = new AnnotatedString(stringResource2.getText(resources2).toString(), null, 2, null);
                                                            } else {
                                                                if (!(secondaryText2 instanceof Either.Right)) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                annotatedString = (AnnotatedString) ((Either.Right) contactInfo2.getSecondaryText()).getValue();
                                                            }
                                                            BentoBaseRowState bentoBaseRowState = new BentoBaseRowState(null, annotated, new BentoBaseRowState.Text.Annotated(annotatedString, null, 2, null), new BentoBaseRowState.Meta.CallToAction(contactInfo2.getInviteCtaText(), null, 2, null), null, false, false, 113, null);
                                                            composer2.startReplaceGroup(-1633490746);
                                                            boolean zChanged = composer2.changed(function13) | composer2.changed(referralOfferDetailsViewData);
                                                            Object objRememberedValue3 = composer2.rememberedValue();
                                                            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                                final Function1 function16 = function13;
                                                                objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$1$1$1$1$4$1
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                                        invoke2();
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2() {
                                                                        function16.invoke(referralOfferDetailsViewData);
                                                                    }
                                                                };
                                                                composer2.updateRememberedValue(objRememberedValue3);
                                                            }
                                                            composer2.endReplaceGroup();
                                                            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierAutoLogEvents$default, bentoBaseRowState, false, false, false, 0L, (Function0) objRememberedValue3, composer, BentoBaseRowState.$stable << 3, 60);
                                                            composer2 = composer;
                                                            composer2.endReplaceGroup();
                                                        }
                                                        composer2.endReplaceGroup();
                                                    } else {
                                                        if (!(referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.ShimmeredContactInfo)) {
                                                            composer2.startReplaceGroup(607019160);
                                                            composer2.endReplaceGroup();
                                                            throw new Standard2("Unknown view data type: " + referralOfferDetailsViewData);
                                                        }
                                                        composer2.startReplaceGroup(1636872340);
                                                        LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$ReferralOfferDetailsComposableKt.INSTANCE.getLambda$1661296789$feature_referral_externalDebug(), composer2, 3078, 6);
                                                        composer2 = composer2;
                                                        composer2.endReplaceGroup();
                                                    }
                                                    composer2.endReplaceGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        return;
                                                    }
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                composer2.startReplaceGroup(1631215925);
                                                ReferralOfferDetailsComposableKt.NoOpSearchFieldComposable(((ReferralOfferDetailsViewData.SearchField) referralOfferDetailsViewData).getPlaceholderText(), null, function02, composer2, 0, 2);
                                                composer2.endReplaceGroup();
                                            }
                                            composer2.endReplaceGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                        }
                                    }));
                                    return Unit.INSTANCE;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
                                    invoke(boxScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final boolean invoke$lambda$17$lambda$9$lambda$8(LazyListState lazyListState, double d) {
                                    return ((double) lazyListState.getFirstVisibleItemScrollOffset()) > d || lazyListState.getFirstVisibleItemIndex() > 1;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$17$lambda$12$lambda$11(Function1 function1) {
                                    function1.invoke(Boolean.TRUE);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$17$lambda$14$lambda$13(Function1 function1) {
                                    function1.invoke(Boolean.FALSE);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$17$lambda$16$lambda$15(Function1 function1) {
                                    function1.invoke(Boolean.FALSE);
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i26) {
                                int i27;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i26 & 6) == 0) {
                                    i27 = i26 | (composer3.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i27 = i26;
                                }
                                if ((i27 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(840126137, i27, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposable.<anonymous> (ReferralOfferDetailsComposable.kt:152)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), paddingValues);
                                final ReferralOfferDetailsViewState referralOfferDetailsViewState = viewState;
                                final Screen screen = eventScreen;
                                final ReferralEntryPointContext referralEntryPointContext = entryPointContext;
                                final Function1<Uri, Unit> function1 = onDeeplinkHandle;
                                final Function0<Unit> function0 = onSendSelectedInvitesClicked;
                                final Function0<Unit> function02 = onInviteContactsClicked;
                                final Function1<String, Unit> function12 = onShareButtonClicked;
                                final Function0<Unit> function03 = onClearSelectedContactsClicked;
                                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierPadding, false, ComposableLambda3.rememberComposableLambda(-445110738, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt.ReferralOfferDetailsComposable.2.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer4, Integer num) {
                                        invoke(bentoButtonBar3, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer4, int i28) {
                                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                        if ((i28 & 17) == 16 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-445110738, i28, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposable.<anonymous>.<anonymous> (ReferralOfferDetailsComposable.kt:157)");
                                        }
                                        if (referralOfferDetailsViewState.isBottomBarVisible()) {
                                            ReferralOfferDetailsComposableKt.BottomBarComposable(referralOfferDetailsViewState, screen, referralEntryPointContext, function1, function0, function02, function12, function03, composer4, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), ComposableLambda3.rememberComposableLambda(-1285011551, true, new AnonymousClass2(viewState, lazyListStateRememberLazyListState, displayMetrics, onAdditionalInfoClicked, onSearchStarted, set, onContactDeselected, onContactSelected, entryPointContext, eventScreen, onInviteContactClicked, onPermissionRequestResponseReceived), composer3, 54), composer3, 3456, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 384, 12582912, 98299);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ReferralOfferDetailsComposableKt.ReferralOfferDetailsComposable$lambda$1(eventScreen, entryPointContext, displayMetrics, screenTitle, viewState, onAdditionalInfoClicked, onCloseClick, onSendSelectedInvitesClicked, onDeeplinkHandle, onInviteContactsClicked, onInviteContactClicked, onContactSelected, onContactDeselected, onClearSelectedContactsClicked, onPastRewardsClick, onSearchStarted, onCancelSearchClicked, onSearchQueryChanged, onShareButtonClicked, modifier2, onPermissionRequestResponseReceived, i, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i24 |= 196608;
                i15 = i24;
                if ((i4 & 65536) == 0) {
                }
                if ((i4 & 131072) == 0) {
                }
                if ((i4 & 262144) == 0) {
                }
                i16 = i4 & 524288;
                if (i16 == 0) {
                }
                int i252 = i15;
                if ((i4 & 1048576) == 0) {
                }
                if ((i12 & 306783379) == 306783378) {
                    if (i16 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ContactsAccessGrantedViewState contactsAccessGrantedViewStateIfGranted22 = ReferralOfferDetailsViewStates.ifGranted(viewState);
                    if (contactsAccessGrantedViewStateIfGranted22 == null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(selectedContacts);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        contactsAccessGrantedViewStateIfGranted = ReferralOfferDetailsViewStates.ifGranted(viewState);
                        if (contactsAccessGrantedViewStateIfGranted != null) {
                            Set<ReferralOfferDetailsViewData.ContactInfo> setEmptySet2 = SetsKt.emptySet();
                            objRememberedValue = setEmptySet2;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            final Set<ReferralOfferDetailsViewData.ContactInfo> set2 = (Set) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            final LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            composer2 = composerStartRestartGroup;
                            final Modifier modifier42 = modifier3;
                            ScaffoldKt.m5625Scaffold27mzLpw(null, null, ComposableLambda3.rememberComposableLambda(-618194222, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt.ReferralOfferDetailsComposable.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i26) {
                                    if ((i26 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-618194222, i26, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposable.<anonymous> (ReferralOfferDetailsComposable.kt:131)");
                                    }
                                    if (viewState.isTopBarVisible()) {
                                        composer3.startReplaceGroup(195754719);
                                        ReferralOfferDetailsComposableKt.TopBarComposable(eventScreen, entryPointContext, screenTitle, onAdditionalInfoClicked, onCloseClick, null, onPastRewardsClick, composer3, 0, 32);
                                        composer3.endReplaceGroup();
                                    } else if (viewState instanceof ContactsAccessGrantedViewState) {
                                        composer3.startReplaceGroup(196205738);
                                        ReferralOfferDetailsComposableKt.RealSearchBarComposable((ContactsAccessGrantedViewState) viewState, lazyListStateRememberLazyListState2, extensions2.toImmutableSet(set2), onSearchQueryChanged, onCancelSearchClicked, composer3, 0);
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(196549776);
                                        composer3.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(840126137, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt.ReferralOfferDetailsComposable.2

                                /* compiled from: ReferralOfferDetailsComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                                    final /* synthetic */ Set<ReferralOfferDetailsViewData.ContactInfo> $checkedItems;
                                    final /* synthetic */ DisplayMetrics $displayMetrics;
                                    final /* synthetic */ ReferralEntryPointContext $entryPointContext;
                                    final /* synthetic */ Screen $eventScreen;
                                    final /* synthetic */ LazyListState $listState;
                                    final /* synthetic */ Function0<Unit> $onAdditionalInfoClicked;
                                    final /* synthetic */ Function1<ReferralOfferDetailsViewData.ContactInfo, Unit> $onContactDeselected;
                                    final /* synthetic */ Function1<ReferralOfferDetailsViewData.ContactInfo, Unit> $onContactSelected;
                                    final /* synthetic */ Function1<ReferralOfferDetailsViewData.ContactInfo, Unit> $onInviteContactClicked;
                                    final /* synthetic */ Function1<Boolean, Unit> $onPermissionRequestResponseReceived;
                                    final /* synthetic */ Function0<Unit> $onSearchStarted;
                                    final /* synthetic */ ReferralOfferDetailsViewState $viewState;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    AnonymousClass2(ReferralOfferDetailsViewState referralOfferDetailsViewState, LazyListState lazyListState, DisplayMetrics displayMetrics, Function0<Unit> function0, Function0<Unit> function02, Set<ReferralOfferDetailsViewData.ContactInfo> set, Function1<? super ReferralOfferDetailsViewData.ContactInfo, Unit> function1, Function1<? super ReferralOfferDetailsViewData.ContactInfo, Unit> function12, ReferralEntryPointContext referralEntryPointContext, Screen screen, Function1<? super ReferralOfferDetailsViewData.ContactInfo, Unit> function13, Function1<? super Boolean, Unit> function14) {
                                        this.$viewState = referralOfferDetailsViewState;
                                        this.$listState = lazyListState;
                                        this.$displayMetrics = displayMetrics;
                                        this.$onAdditionalInfoClicked = function0;
                                        this.$onSearchStarted = function02;
                                        this.$checkedItems = set;
                                        this.$onContactDeselected = function1;
                                        this.$onContactSelected = function12;
                                        this.$entryPointContext = referralEntryPointContext;
                                        this.$eventScreen = screen;
                                        this.$onInviteContactClicked = function13;
                                        this.$onPermissionRequestResponseReceived = function14;
                                    }

                                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
                                        Function0<Unit> function0;
                                        DisplayMetrics displayMetrics;
                                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1285011551, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposable.<anonymous>.<anonymous> (ReferralOfferDetailsComposable.kt:171)");
                                        }
                                        final List viewDataList = this.$viewState.getViewDataList();
                                        final LazyListState lazyListState = this.$listState;
                                        final DisplayMetrics displayMetrics2 = this.$displayMetrics;
                                        final Function0 function02 = this.$onAdditionalInfoClicked;
                                        final Function0 function03 = this.$onSearchStarted;
                                        final ReferralOfferDetailsViewState referralOfferDetailsViewState = this.$viewState;
                                        final Set set = this.$checkedItems;
                                        final Function1 function1 = this.$onContactDeselected;
                                        final Function1 function12 = this.$onContactSelected;
                                        final ReferralEntryPointContext referralEntryPointContext = this.$entryPointContext;
                                        final Screen screen = this.$eventScreen;
                                        final Function1 function13 = this.$onInviteContactClicked;
                                        final Function1 function14 = this.$onPermissionRequestResponseReceived;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                        composer.startReplaceGroup(-1224400529);
                                        boolean zChangedInstance = composer.changedInstance(viewDataList) | composer.changedInstance(displayMetrics2) | composer.changed(function02) | composer.changed(function03) | composer.changed(referralOfferDetailsViewState) | composer.changedInstance(set) | composer.changed(function1) | composer.changed(function12) | composer.changedInstance(referralEntryPointContext) | composer.changedInstance(screen) | composer.changed(function13);
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return ReferralOfferDetailsComposableKt.C268442.AnonymousClass2.invoke$lambda$17$lambda$6$lambda$5(viewDataList, function02, function03, referralOfferDetailsViewState, set, function1, function12, referralEntryPointContext, screen, function13, displayMetrics2, (LazyListScope) obj);
                                                }
                                            };
                                            function0 = function03;
                                            displayMetrics = displayMetrics2;
                                            composer.updateRememberedValue(objRememberedValue);
                                        } else {
                                            displayMetrics = displayMetrics2;
                                            function0 = function03;
                                        }
                                        composer.endReplaceGroup();
                                        Function0<Unit> function04 = function0;
                                        LazyDslKt.LazyColumn(modifierFillMaxWidth$default, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 6, 508);
                                        composer.startReplaceGroup(-1386778297);
                                        if (referralOfferDetailsViewState instanceof ContactsAccessGrantedViewState) {
                                            ContactsAccessGrantedViewState contactsAccessGrantedViewState = (ContactsAccessGrantedViewState) referralOfferDetailsViewState;
                                            final double aspectRatio = (displayMetrics.widthPixels * contactsAccessGrantedViewState.getHeaderImageViewData().getAspectRatio()) + ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(BentoSpacing.INSTANCE.m21598default().m21591getLargeD9Ej5fM());
                                            composer.startReplaceGroup(1849434622);
                                            Object objRememberedValue2 = composer.rememberedValue();
                                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return Boolean.valueOf(ReferralOfferDetailsComposableKt.C268442.AnonymousClass2.invoke$lambda$17$lambda$9$lambda$8(lazyListState, aspectRatio));
                                                    }
                                                });
                                                composer.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer.endReplaceGroup();
                                            if (invoke$lambda$17$lambda$10((SnapshotState4) objRememberedValue2) && !contactsAccessGrantedViewState.isSearching()) {
                                                ReferralOfferDetailsComposableKt.StickySearchBarComposable(contactsAccessGrantedViewState, null, function04, composer, 0, 2);
                                            }
                                        }
                                        composer.endReplaceGroup();
                                        composer.startReplaceGroup(-1386746871);
                                        if ((referralOfferDetailsViewState instanceof ContactsAccessDeniedViewState) && ((ContactsAccessDeniedViewState) referralOfferDetailsViewState).getShowPermissionsDialog()) {
                                            String strStringResource = StringResources_androidKt.stringResource(C26659R.string.referral_offer_permissions_dialog_title, composer, 0);
                                            BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(StringResources_androidKt.stringResource(C26659R.string.referral_offer_permissions_dialog_message_md, composer, 0));
                                            String strStringResource2 = StringResources_androidKt.stringResource(C26659R.string.referral_offer_permissions_dialog_primary_cta, composer, 0);
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged = composer.changed(function14);
                                            Object objRememberedValue3 = composer.rememberedValue();
                                            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ReferralOfferDetailsComposableKt.C268442.AnonymousClass2.invoke$lambda$17$lambda$12$lambda$11(function14);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer.endReplaceGroup();
                                            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue3);
                                            String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged2 = composer.changed(function14);
                                            Object objRememberedValue4 = composer.rememberedValue();
                                            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$$ExternalSyntheticLambda3
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ReferralOfferDetailsComposableKt.C268442.AnonymousClass2.invoke$lambda$17$lambda$14$lambda$13(function14);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue4);
                                            }
                                            composer.endReplaceGroup();
                                            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue4);
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged3 = composer.changed(function14);
                                            Object objRememberedValue5 = composer.rememberedValue();
                                            if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ReferralOfferDetailsComposableKt.C268442.AnonymousClass2.invoke$lambda$17$lambda$16$lambda$15(function14);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue5);
                                            }
                                            Function0 function05 = (Function0) objRememberedValue5;
                                            composer.endReplaceGroup();
                                            int i2 = BentoAlertDialog2.Body.MarkdownText.$stable << 3;
                                            int i3 = BentoAlertButton.$stable;
                                            BentoAlertDialog.BentoAlertDialog(strStringResource, markdownText, bentoAlertButton, null, bentoAlertButton2, null, false, null, function05, composer, i2 | (i3 << 6) | (i3 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                                        }
                                        composer.endReplaceGroup();
                                        composer.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    private static final boolean invoke$lambda$17$lambda$10(SnapshotState4<Boolean> snapshotState4) {
                                        return snapshotState4.getValue().booleanValue();
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$17$lambda$6$lambda$5(final List list, final Function0 function0, final Function0 function02, final ReferralOfferDetailsViewState referralOfferDetailsViewState, final Set set, final Function1 function1, final Function1 function12, final ReferralEntryPointContext referralEntryPointContext, final Screen screen, final Function1 function13, final DisplayMetrics displayMetrics, LazyListScope LazyColumn) {
                                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                        final Function1 c26836x4773e6ce = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$invoke$lambda$17$lambda$6$lambda$5$$inlined$items$default$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Void invoke(ReferralOfferDetailsViewData referralOfferDetailsViewData) {
                                                return null;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                return invoke((ReferralOfferDetailsViewData) obj);
                                            }
                                        };
                                        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$invoke$lambda$17$lambda$6$lambda$5$$inlined$items$default$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                                return invoke(num.intValue());
                                            }

                                            public final Object invoke(int i) {
                                                return c26836x4773e6ce.invoke(list.get(i));
                                            }
                                        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$invoke$lambda$17$lambda$6$lambda$5$$inlined$items$default$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:100:0x06cc  */
                                            /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                                int i3;
                                                AnnotatedString annotatedString;
                                                String string2;
                                                TextStyle displayCapsuleMedium;
                                                C26839x4773e6d1 c26839x4773e6d1 = this;
                                                Composer composer2 = composer;
                                                if ((i2 & 6) == 0) {
                                                    i3 = i2 | (composer2.changed(lazyItemScope) ? 4 : 2);
                                                } else {
                                                    i3 = i2;
                                                }
                                                if ((i2 & 48) == 0) {
                                                    i3 |= composer2.changed(i) ? 32 : 16;
                                                }
                                                if (!composer2.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                                }
                                                final ReferralOfferDetailsViewData referralOfferDetailsViewData = (ReferralOfferDetailsViewData) list.get(i);
                                                composer2.startReplaceGroup(1628155947);
                                                if (referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.HeaderImage) {
                                                    composer2.startReplaceGroup(1627960615);
                                                    ReferralOfferDetailsViewData.HeaderImage headerImage = (ReferralOfferDetailsViewData.HeaderImage) referralOfferDetailsViewData;
                                                    ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(ThemedImageUrlExtensions.getResolvedUrl(headerImage.getImageUrl(), composer2, 0), null, null, null, 0, null, composer, 0, 62), "", SizeKt.m5156height3ABfNKs(TestTag3.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), "headerImage"), C2002Dp.m7993boximpl(((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (displayMetrics.widthPixels * headerImage.getAspectRatio()))).getValue()), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer, 24624, 104);
                                                    composer2 = composer;
                                                    composer2.endReplaceGroup();
                                                } else if (referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.Spacing) {
                                                    composer2.startReplaceGroup(1628954103);
                                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, ((ReferralOfferDetailsViewData.Spacing) referralOfferDetailsViewData).m18085getSizeD9Ej5fM()), composer2, 0);
                                                    composer2.endReplaceGroup();
                                                } else if (referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.TitleText) {
                                                    composer2.startReplaceGroup(1629149806);
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                    int i4 = BentoTheme.$stable;
                                                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                                    ReferralOfferDetailsViewData.TitleText titleText = (ReferralOfferDetailsViewData.TitleText) referralOfferDetailsViewData;
                                                    AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo = RichTexts2.m15956toAnnotatedStringiJQMabo(titleText.getText(), 0L, composer2, 0, 1);
                                                    if (titleText.isLarge()) {
                                                        composer2.startReplaceGroup(1629414825);
                                                        displayCapsuleMedium = bentoTheme.getTypography(composer2, i4).getDisplayCapsuleLarge();
                                                        composer2.endReplaceGroup();
                                                    } else {
                                                        composer2.startReplaceGroup(1629540840);
                                                        displayCapsuleMedium = bentoTheme.getTypography(composer2, i4).getDisplayCapsuleMedium();
                                                        composer2.endReplaceGroup();
                                                    }
                                                    BentoText2.m20748BentoTextQnj7Zds(annotatedStringM15956toAnnotatedStringiJQMabo, modifierM5144paddingVpY3zN4$default, null, null, null, null, null, 0, false, 0, 0, null, null, displayCapsuleMedium, composer, 0, 0, 8188);
                                                    composer2 = composer;
                                                    composer2.endReplaceGroup();
                                                } else if (referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.SubtitleText) {
                                                    composer2.startReplaceGroup(1629841540);
                                                    composer2.startReplaceGroup(606764777);
                                                    ReferralOfferDetailsViewData.SubtitleText subtitleText = (ReferralOfferDetailsViewData.SubtitleText) referralOfferDetailsViewData;
                                                    if (subtitleText.getAdditionalInfoText() != null) {
                                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer2, 0);
                                                    }
                                                    composer2.endReplaceGroup();
                                                    final UriHandler uriHandler = (UriHandler) composer2.consume(CompositionLocalsKt.getLocalUriHandler());
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                                    int i5 = BentoTheme.$stable;
                                                    Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                                    RichText text = subtitleText.getText();
                                                    TextStyle textM = bentoTheme2.getTypography(composer2, i5).getTextM();
                                                    composer2.startReplaceGroup(5004770);
                                                    boolean zChangedInstance = composer2.changedInstance(uriHandler);
                                                    Object objRememberedValue = composer2.rememberedValue();
                                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = new Function1<Uri, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$1$1$1$1$2$1
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
                                                                invoke2(uri);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(Uri uri) {
                                                                Intrinsics.checkNotNullParameter(uri, "uri");
                                                                UriHandler uriHandler2 = uriHandler;
                                                                String string3 = uri.toString();
                                                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                                                uriHandler2.openUri(string3);
                                                            }
                                                        };
                                                        composer2.updateRememberedValue(objRememberedValue);
                                                    }
                                                    composer2.endReplaceGroup();
                                                    BentoRichText.m15948BentoRichText0sCZWFg(text, modifierM5144paddingVpY3zN4$default2, textM, 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composer, 0, 504);
                                                    composer2 = composer;
                                                    if (subtitleText.getAdditionalInfoText() != null) {
                                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                                                        c26839x4773e6d1 = this;
                                                        BentoTextButton2.m20715BentoTextButtonPIknLig(function0, subtitleText.getAdditionalInfoText().getText(), PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, false, null, composer, 0, 120);
                                                        composer2 = composer;
                                                    } else {
                                                        c26839x4773e6d1 = this;
                                                    }
                                                    composer2.endReplaceGroup();
                                                } else {
                                                    if (!(referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.SearchField)) {
                                                        if (referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.ContactSectionHeader) {
                                                            composer2.startReplaceGroup(1631581322);
                                                            Resources resources = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                                            int i6 = BentoTheme.$stable;
                                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme3.getSpacing(composer2, i6).m21592getMediumD9Ej5fM()), composer2, 0);
                                                            StringResource text2 = ((ReferralOfferDetailsViewData.ContactSectionHeader) referralOfferDetailsViewData).getText();
                                                            Intrinsics.checkNotNull(resources);
                                                            BentoText2.m20747BentoText38GnDrw(text2.getText(resources).toString(), PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme3.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i6).getTextS(), composer, 24576, 0, 8172);
                                                            composer2 = composer;
                                                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme3.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM()), composer2, 0);
                                                            composer2.endReplaceGroup();
                                                        } else if (referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.ContactInfo) {
                                                            composer2.startReplaceGroup(1632465132);
                                                            Resources resources2 = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                                                            if (ReferralOfferDetailsViewStates.asGranted(referralOfferDetailsViewState).isMultiSelectContactMember()) {
                                                                composer2.startReplaceGroup(1632540431);
                                                                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.Checkbox;
                                                                ReferralOfferDetailsViewData.ContactInfo contactInfo = (ReferralOfferDetailsViewData.ContactInfo) referralOfferDetailsViewData;
                                                                String string3 = contactInfo.getPrimaryText().toString();
                                                                Either<StringResource, AnnotatedString> secondaryText = contactInfo.getSecondaryText();
                                                                if (secondaryText instanceof Either.Left) {
                                                                    StringResource stringResource = (StringResource) ((Either.Left) contactInfo.getSecondaryText()).getValue();
                                                                    Intrinsics.checkNotNull(resources2);
                                                                    string2 = stringResource.getText(resources2).toString();
                                                                } else {
                                                                    if (!(secondaryText instanceof Either.Right)) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    string2 = ((AnnotatedString) ((Either.Right) contactInfo.getSecondaryText()).getValue()).toString();
                                                                }
                                                                BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, string3, set.contains(referralOfferDetailsViewData), (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(string2), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2032, (DefaultConstructorMarker) null);
                                                                composer2.startReplaceGroup(-1224400529);
                                                                boolean zChangedInstance2 = composer2.changedInstance(set) | composer2.changed(referralOfferDetailsViewData) | composer2.changed(function1) | composer2.changed(function12);
                                                                Object objRememberedValue2 = composer2.rememberedValue();
                                                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                                    final Set<ReferralOfferDetailsViewData.ContactInfo> set2 = set;
                                                                    final Function1<? super ReferralOfferDetailsViewData.ContactInfo, Unit> function14 = function1;
                                                                    final Function1<? super ReferralOfferDetailsViewData.ContactInfo, Unit> function15 = function12;
                                                                    objRememberedValue2 = new Function0<Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$1$1$1$1$3$1
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                                                            invoke2();
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2() {
                                                                            if (set2.contains(referralOfferDetailsViewData)) {
                                                                                function14.invoke(referralOfferDetailsViewData);
                                                                            } else {
                                                                                function15.invoke(referralOfferDetailsViewData);
                                                                            }
                                                                        }
                                                                    };
                                                                    composer2.updateRememberedValue(objRememberedValue2);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue2, composer2, BentoSelectionRowState.$stable << 3, 1);
                                                                composer2.endReplaceGroup();
                                                            } else {
                                                                composer2.startReplaceGroup(1634124810);
                                                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen, UserInteractionEventData.Action.INVITE_CONTACTS, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, referralEntryPointContext, null, new ReferralInviteContext(1, true, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -41, -1, 16383, null), new Component(Component.ComponentType.ROW, null, null, 6, null), null, 33, null), true, false, false, true, false, null, 108, null);
                                                                ReferralOfferDetailsViewData.ContactInfo contactInfo2 = (ReferralOfferDetailsViewData.ContactInfo) referralOfferDetailsViewData;
                                                                BentoBaseRowState.Text.Annotated annotated = new BentoBaseRowState.Text.Annotated(contactInfo2.getPrimaryText(), null, 2, null);
                                                                Either<StringResource, AnnotatedString> secondaryText2 = contactInfo2.getSecondaryText();
                                                                if (secondaryText2 instanceof Either.Left) {
                                                                    StringResource stringResource2 = (StringResource) ((Either.Left) contactInfo2.getSecondaryText()).getValue();
                                                                    Intrinsics.checkNotNull(resources2);
                                                                    annotatedString = new AnnotatedString(stringResource2.getText(resources2).toString(), null, 2, null);
                                                                } else {
                                                                    if (!(secondaryText2 instanceof Either.Right)) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    annotatedString = (AnnotatedString) ((Either.Right) contactInfo2.getSecondaryText()).getValue();
                                                                }
                                                                BentoBaseRowState bentoBaseRowState = new BentoBaseRowState(null, annotated, new BentoBaseRowState.Text.Annotated(annotatedString, null, 2, null), new BentoBaseRowState.Meta.CallToAction(contactInfo2.getInviteCtaText(), null, 2, null), null, false, false, 113, null);
                                                                composer2.startReplaceGroup(-1633490746);
                                                                boolean zChanged = composer2.changed(function13) | composer2.changed(referralOfferDetailsViewData);
                                                                Object objRememberedValue3 = composer2.rememberedValue();
                                                                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                                    final Function1<? super ReferralOfferDetailsViewData.ContactInfo, Unit> function16 = function13;
                                                                    objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$ReferralOfferDetailsComposable$2$2$1$1$1$1$4$1
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                                                            invoke2();
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2() {
                                                                            function16.invoke(referralOfferDetailsViewData);
                                                                        }
                                                                    };
                                                                    composer2.updateRememberedValue(objRememberedValue3);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierAutoLogEvents$default, bentoBaseRowState, false, false, false, 0L, (Function0) objRememberedValue3, composer, BentoBaseRowState.$stable << 3, 60);
                                                                composer2 = composer;
                                                                composer2.endReplaceGroup();
                                                            }
                                                            composer2.endReplaceGroup();
                                                        } else {
                                                            if (!(referralOfferDetailsViewData instanceof ReferralOfferDetailsViewData.ShimmeredContactInfo)) {
                                                                composer2.startReplaceGroup(607019160);
                                                                composer2.endReplaceGroup();
                                                                throw new Standard2("Unknown view data type: " + referralOfferDetailsViewData);
                                                            }
                                                            composer2.startReplaceGroup(1636872340);
                                                            LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$ReferralOfferDetailsComposableKt.INSTANCE.getLambda$1661296789$feature_referral_externalDebug(), composer2, 3078, 6);
                                                            composer2 = composer2;
                                                            composer2.endReplaceGroup();
                                                        }
                                                        composer2.endReplaceGroup();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            return;
                                                        }
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    composer2.startReplaceGroup(1631215925);
                                                    ReferralOfferDetailsComposableKt.NoOpSearchFieldComposable(((ReferralOfferDetailsViewData.SearchField) referralOfferDetailsViewData).getPlaceholderText(), null, function02, composer2, 0, 2);
                                                    composer2.endReplaceGroup();
                                                }
                                                composer2.endReplaceGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                            }
                                        }));
                                        return Unit.INSTANCE;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
                                        invoke(boxScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final boolean invoke$lambda$17$lambda$9$lambda$8(LazyListState lazyListState, double d) {
                                        return ((double) lazyListState.getFirstVisibleItemScrollOffset()) > d || lazyListState.getFirstVisibleItemIndex() > 1;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$17$lambda$12$lambda$11(Function1 function1) {
                                        function1.invoke(Boolean.TRUE);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$17$lambda$14$lambda$13(Function1 function1) {
                                        function1.invoke(Boolean.FALSE);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$17$lambda$16$lambda$15(Function1 function1) {
                                        function1.invoke(Boolean.FALSE);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                    invoke(paddingValues, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer3, int i26) {
                                    int i27;
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i26 & 6) == 0) {
                                        i27 = i26 | (composer3.changed(paddingValues) ? 4 : 2);
                                    } else {
                                        i27 = i26;
                                    }
                                    if ((i27 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(840126137, i27, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposable.<anonymous> (ReferralOfferDetailsComposable.kt:152)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(modifier42, 0.0f, 1, null), paddingValues);
                                    final ReferralOfferDetailsViewState referralOfferDetailsViewState = viewState;
                                    final Screen screen = eventScreen;
                                    final ReferralEntryPointContext referralEntryPointContext = entryPointContext;
                                    final Function1<? super Uri, Unit> function1 = onDeeplinkHandle;
                                    final Function0<Unit> function0 = onSendSelectedInvitesClicked;
                                    final Function0<Unit> function02 = onInviteContactsClicked;
                                    final Function1<? super String, Unit> function12 = onShareButtonClicked;
                                    final Function0<Unit> function03 = onClearSelectedContactsClicked;
                                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierPadding, false, ComposableLambda3.rememberComposableLambda(-445110738, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt.ReferralOfferDetailsComposable.2.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer4, Integer num) {
                                            invoke(bentoButtonBar3, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer4, int i28) {
                                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                            if ((i28 & 17) == 16 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-445110738, i28, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposable.<anonymous>.<anonymous> (ReferralOfferDetailsComposable.kt:157)");
                                            }
                                            if (referralOfferDetailsViewState.isBottomBarVisible()) {
                                                ReferralOfferDetailsComposableKt.BottomBarComposable(referralOfferDetailsViewState, screen, referralEntryPointContext, function1, function0, function02, function12, function03, composer4, 0);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), ComposableLambda3.rememberComposableLambda(-1285011551, true, new AnonymousClass2(viewState, lazyListStateRememberLazyListState2, displayMetrics, onAdditionalInfoClicked, onSearchStarted, set2, onContactDeselected, onContactSelected, entryPointContext, eventScreen, onInviteContactClicked, onPermissionRequestResponseReceived), composer3, 54), composer3, 3456, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 384, 12582912, 98299);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier42;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i4 & 32768) == 0) {
            }
            i15 = i24;
            if ((i4 & 65536) == 0) {
            }
            if ((i4 & 131072) == 0) {
            }
            if ((i4 & 262144) == 0) {
            }
            i16 = i4 & 524288;
            if (i16 == 0) {
            }
            int i2522 = i15;
            if ((i4 & 1048576) == 0) {
            }
            if ((i12 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i4 & 16384) == 0) {
        }
        if ((i4 & 32768) == 0) {
        }
        i15 = i24;
        if ((i4 & 65536) == 0) {
        }
        if ((i4 & 131072) == 0) {
        }
        if ((i4 & 262144) == 0) {
        }
        i16 = i4 & 524288;
        if (i16 == 0) {
        }
        int i25222 = i15;
        if ((i4 & 1048576) == 0) {
        }
        if ((i12 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StickySearchBarComposable(final ContactsAccessGrantedViewState contactsAccessGrantedViewState, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        ContactsAccessGrantedViewState contactsAccessGrantedViewState2;
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        TextStyle displayCapsuleMedium;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1632800224);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            contactsAccessGrantedViewState2 = contactsAccessGrantedViewState;
        } else if ((i & 6) == 0) {
            contactsAccessGrantedViewState2 = contactsAccessGrantedViewState;
            i3 = (composerStartRestartGroup.changedInstance(contactsAccessGrantedViewState2) ? 4 : 2) | i;
        } else {
            contactsAccessGrantedViewState2 = contactsAccessGrantedViewState;
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1632800224, i3, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.StickySearchBarComposable (ReferralOfferDetailsComposable.kt:390)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null);
                Modifier modifier5 = modifier4;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo = RichTexts2.m15956toAnnotatedStringiJQMabo(contactsAccessGrantedViewState2.getTitleText().getText(), 0L, composerStartRestartGroup, 0, 1);
                if (!contactsAccessGrantedViewState2.getTitleText().isLarge()) {
                    composerStartRestartGroup.startReplaceGroup(-1810654141);
                    displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleLarge();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1810575742);
                    displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
                    composerStartRestartGroup.endReplaceGroup();
                }
                BentoText2.m20748BentoTextQnj7Zds(annotatedStringM15956toAnnotatedStringiJQMabo, modifierM5144paddingVpY3zN4$default, null, null, null, null, null, 0, false, 0, 0, null, null, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15956toAnnotatedStringiJQMabo(contactsAccessGrantedViewState.getSubtitleText().getText(), 0L, composerStartRestartGroup, 0, 1), PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                NoOpSearchFieldComposable(contactsAccessGrantedViewState.getSearchField().getPlaceholderText(), null, function0, composerStartRestartGroup, i3 & 896, 2);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReferralOfferDetailsComposableKt.StickySearchBarComposable$lambda$3(contactsAccessGrantedViewState, modifier3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), null, 2, null);
            Modifier modifier52 = modifier4;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo2 = RichTexts2.m15956toAnnotatedStringiJQMabo(contactsAccessGrantedViewState2.getTitleText().getText(), 0L, composerStartRestartGroup, 0, 1);
                if (!contactsAccessGrantedViewState2.getTitleText().isLarge()) {
                }
                BentoText2.m20748BentoTextQnj7Zds(annotatedStringM15956toAnnotatedStringiJQMabo2, modifierM5144paddingVpY3zN4$default2, null, null, null, null, null, 0, false, 0, 0, null, null, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15956toAnnotatedStringiJQMabo(contactsAccessGrantedViewState.getSubtitleText().getText(), 0L, composerStartRestartGroup, 0, 1), PaddingKt.m5144paddingVpY3zN4$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                NoOpSearchFieldComposable(contactsAccessGrantedViewState.getSearchField().getPlaceholderText(), null, function0, composerStartRestartGroup, i3 & 896, 2);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RealSearchBarComposable(final ContactsAccessGrantedViewState contactsAccessGrantedViewState, LazyListState lazyListState, final ImmutableSet<ReferralOfferDetailsViewData.ContactInfo> immutableSet, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        boolean z;
        String strStringResource;
        final LazyListState lazyListState2;
        FocusRequester focusRequester;
        Composer composerStartRestartGroup = composer.startRestartGroup(50016430);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(contactsAccessGrantedViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(immutableSet) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            lazyListState2 = lazyListState;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(50016430, i2, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.RealSearchBarComposable (ReferralOfferDetailsComposable.kt:422)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(companion2);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierStatusBarsPadding);
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
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
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
            Row6 row6 = Row6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            String query = contactsAccessGrantedViewState.getQuery();
            if (query == null) {
                query = "";
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(query);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                String query2 = contactsAccessGrantedViewState.getQuery();
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(query2 != null ? query2 : "", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            String strRealSearchBarComposable$lambda$13$lambda$12$lambda$6 = RealSearchBarComposable$lambda$13$lambda$12$lambda$6((SnapshotState) objRememberedValue3);
            Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(row6.weight(companion2, 1.0f, true), focusRequester2);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierFocusRequester, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM());
            String placeholderText = contactsAccessGrantedViewState.getSearchField().getPlaceholderText();
            BentoTextInput8.Icon.Size24 size24 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = (i2 & 7168) == 2048;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ReferralOfferDetailsComposableKt.RealSearchBarComposable$lambda$13$lambda$12$lambda$8$lambda$7(function1, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i4 = i2;
            BentoTextInput4.BentoTextInput(strRealSearchBarComposable$lambda$13$lambda$12$lambda$6, (Function1) objRememberedValue4, modifierM5145paddingqDBjuR0, null, placeholderText, null, null, size24, null, null, null, null, null, false, false, composerStartRestartGroup, BentoTextInput8.Icon.Size24.$stable << 21, 0, 32616);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(row6.align(companion2, companion3.getCenterVertically()), 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 11, null);
            if (contactsAccessGrantedViewState.isMultiSelectContactMember()) {
                composerStartRestartGroup.startReplaceGroup(-903404255);
                if (immutableSet.isEmpty()) {
                    z = false;
                    strStringResource = StringResources_androidKt.stringResource(C26659R.string.referral_offer_search_cancel_button, composerStartRestartGroup, 0);
                } else {
                    z = false;
                    strStringResource = contactsAccessGrantedViewState.getMultiSelectContent().getDoneSelectionText();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                z = false;
                composerStartRestartGroup.startReplaceGroup(-903125007);
                strStringResource = StringResources_androidKt.stringResource(C26659R.string.referral_offer_search_cancel_button, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            String str = strStringResource;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(focusManager) | ((i4 & 57344) == 16384 ? true : z) | composerStartRestartGroup.changedInstance(coroutineScope) | ((i4 & 112) == 32 ? true : z);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                lazyListState2 = lazyListState;
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReferralOfferDetailsComposableKt.RealSearchBarComposable$lambda$13$lambda$12$lambda$10$lambda$9(focusManager, function0, coroutineScope, lazyListState2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                lazyListState2 = lazyListState;
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue5, str, modifierM5146paddingqDBjuR0$default, null, null, false, null, composerStartRestartGroup, 0, 120);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                focusRequester = focusRequester2;
                objRememberedValue6 = new ReferralOfferDetailsComposableKt$RealSearchBarComposable$1$1$3$1(focusRequester, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                focusRequester = focusRequester2;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(focusRequester, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(column6.align(companion2, companion3.getCenterHorizontally()), bentoTheme.getColors(composerStartRestartGroup, i3).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final LazyListState lazyListState3 = lazyListState2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReferralOfferDetailsComposableKt.RealSearchBarComposable$lambda$14(contactsAccessGrantedViewState, lazyListState3, immutableSet, function1, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RealSearchBarComposable$lambda$13$lambda$12$lambda$8$lambda$7(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RealSearchBarComposable$lambda$13$lambda$12$lambda$10$lambda$9(FocusManager focusManager, Function0 function0, CoroutineScope coroutineScope, LazyListState lazyListState) {
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        function0.invoke();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C26842x5a1d0d11(lazyListState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NoOpSearchFieldComposable(final String str, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(18765829);
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
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(18765829, i3, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.NoOpSearchFieldComposable (ReferralOfferDetailsComposable.kt:492)");
                }
                Modifier modifierFocusable$default = Focusable2.focusable$default(modifier4, false, null, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 896) == 256;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ReferralOfferDetailsComposableKt.NoOpSearchFieldComposable$lambda$16$lambda$15(function0, (FocusState) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierFocusable$default, (Function1) objRememberedValue);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierOnFocusChanged, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                BentoTextInputState bentoTextInputState = new BentoTextInputState("", null, str2, null, null, new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null), null, null, false, 474, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ReferralOfferDetailsComposableKt.NoOpSearchFieldComposable$lambda$18$lambda$17((String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                BentoTextInput4.BentoTextInput(bentoTextInputState, (Function1<? super String, Unit>) objRememberedValue2, modifierM5146paddingqDBjuR0$default, composerStartRestartGroup, BentoTextInputState.$stable | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReferralOfferDetailsComposableKt.NoOpSearchFieldComposable$lambda$19(str, modifier3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFocusable$default2 = Focusable2.focusable$default(modifier4, false, null, 2, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 896) == 256) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ReferralOfferDetailsComposableKt.NoOpSearchFieldComposable$lambda$16$lambda$15(function0, (FocusState) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnFocusChanged2 = FocusChangedModifier2.onFocusChanged(modifierFocusable$default2, (Function1) objRememberedValue);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierOnFocusChanged2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                BentoTextInputState bentoTextInputState2 = new BentoTextInputState("", null, str2, null, null, new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null), null, null, false, 474, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                BentoTextInput4.BentoTextInput(bentoTextInputState2, (Function1<? super String, Unit>) objRememberedValue2, modifierM5146paddingqDBjuR0$default2, composerStartRestartGroup, BentoTextInputState.$stable | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoOpSearchFieldComposable$lambda$16$lambda$15(Function0 function0, FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        if (focusState.isFocused()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoOpSearchFieldComposable$lambda$18$lambda$17(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopBarComposable(final Screen screen, final ReferralEntryPointContext referralEntryPointContext, final String str, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, final Function0<Unit> function03, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-398160259);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(screen) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(referralEntryPointContext) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-398160259, i3, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.TopBarComposable (ReferralOfferDetailsComposable.kt:526)");
                }
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-626262102, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt.TopBarComposable.1
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
                            ComposerKt.traceEventStart(-626262102, i5, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.TopBarComposable.<anonymous> (ReferralOfferDetailsComposable.kt:536)");
                        }
                        BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), ComposableLambda3.rememberComposableLambda(405392382, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt.TopBarComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(405392382, i5, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.TopBarComposable.<anonymous> (ReferralOfferDetailsComposable.kt:530)");
                        }
                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(modifier4, "closeButton"), false, 0L, function02, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1848693151, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt.TopBarComposable.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                        invoke(row5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1848693151, i5, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.TopBarComposable.<anonymous> (ReferralOfferDetailsComposable.kt:539)");
                        }
                        Function0<Unit> function04 = function0;
                        ComposableSingletons$ReferralOfferDetailsComposableKt composableSingletons$ReferralOfferDetailsComposableKt = ComposableSingletons$ReferralOfferDetailsComposableKt.INSTANCE;
                        IconButton2.IconButton(function04, null, false, null, composableSingletons$ReferralOfferDetailsComposableKt.getLambda$433034555$feature_referral_externalDebug(), composer3, 24576, 14);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        UserInteractionEventData.Action action = UserInteractionEventData.Action.PAST;
                        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
                        IconButton2.IconButton(function03, ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, screen, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, referralEntryPointContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -9, -1, 16383, null), component, null, 33, null), true, false, false, true, false, null, 108, null), false, null, composableSingletons$ReferralOfferDetailsComposableKt.getLambda$324633394$feature_referral_externalDebug(), composer3, 24576, 12);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReferralOfferDetailsComposableKt.TopBarComposable$lambda$20(screen, referralEntryPointContext, str, function0, function02, modifier3, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((i2 & 64) == 0) {
        }
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-626262102, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt.TopBarComposable.1
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
                        ComposerKt.traceEventStart(-626262102, i5, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.TopBarComposable.<anonymous> (ReferralOfferDetailsComposable.kt:536)");
                    }
                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), ComposableLambda3.rememberComposableLambda(405392382, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt.TopBarComposable.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i5 & 6) == 0) {
                        i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(405392382, i5, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.TopBarComposable.<anonymous> (ReferralOfferDetailsComposable.kt:530)");
                    }
                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(modifier4, "closeButton"), false, 0L, function02, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1848693151, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt.TopBarComposable.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                    invoke(row5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 BentoAppBar, Composer composer3, int i5) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i5 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1848693151, i5, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.TopBarComposable.<anonymous> (ReferralOfferDetailsComposable.kt:539)");
                    }
                    Function0<Unit> function04 = function0;
                    ComposableSingletons$ReferralOfferDetailsComposableKt composableSingletons$ReferralOfferDetailsComposableKt = ComposableSingletons$ReferralOfferDetailsComposableKt.INSTANCE;
                    IconButton2.IconButton(function04, null, false, null, composableSingletons$ReferralOfferDetailsComposableKt.getLambda$433034555$feature_referral_externalDebug(), composer3, 24576, 14);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    UserInteractionEventData.Action action = UserInteractionEventData.Action.PAST;
                    Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
                    IconButton2.IconButton(function03, ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, screen, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, referralEntryPointContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -9, -1, 16383, null), component, null, 33, null), true, false, false, true, false, null, 108, null), false, null, composableSingletons$ReferralOfferDetailsComposableKt.getLambda$324633394$feature_referral_externalDebug(), composer3, 24576, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2032);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    public static final void BottomBarComposable(final ReferralOfferDetailsViewState viewState, final Screen eventScreen, final ReferralEntryPointContext entryPointContext, final Function1<? super Uri, Unit> onDeeplinkHandle, final Function0<Unit> onSendSelectedInvitesClicked, final Function0<Unit> onInviteContactsClicked, Function1<? super String, Unit> function1, final Function0<Unit> onClearSelectedContactsClicked, Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        char c;
        Modifier.Companion companion;
        Composer composer2;
        BentoTheme bentoTheme;
        int i6;
        int i7;
        Composer composer3;
        Object obj;
        float f;
        int i8;
        BentoTheme bentoTheme2;
        boolean z2;
        ?? r0;
        Composer composer4;
        final GenericButton shareLinkButton;
        BentoButtons.Type type2;
        String strReplace$default;
        Set<ReferralOfferDetailsViewData.ContactInfo> selectedContacts;
        final Function1<? super String, Unit> onShareButtonClicked = function1;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(entryPointContext, "entryPointContext");
        Intrinsics.checkNotNullParameter(onDeeplinkHandle, "onDeeplinkHandle");
        Intrinsics.checkNotNullParameter(onSendSelectedInvitesClicked, "onSendSelectedInvitesClicked");
        Intrinsics.checkNotNullParameter(onInviteContactsClicked, "onInviteContactsClicked");
        Intrinsics.checkNotNullParameter(onShareButtonClicked, "onShareButtonClicked");
        Intrinsics.checkNotNullParameter(onClearSelectedContactsClicked, "onClearSelectedContactsClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(2017554454);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(eventScreen) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(entryPointContext) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDeeplinkHandle) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSendSelectedInvitesClicked) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onInviteContactsClicked) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onShareButtonClicked) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClearSelectedContactsClicked) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer4 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2017554454, i2, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.BottomBarComposable (ReferralOfferDetailsComposable.kt:586)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(companion2);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i9 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme3.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            ContactsAccessGrantedViewState contactsAccessGrantedViewStateIfGranted = ReferralOfferDetailsViewStates.ifGranted(viewState);
            int size = (contactsAccessGrantedViewStateIfGranted == null || (selectedContacts = contactsAccessGrantedViewStateIfGranted.getSelectedContacts()) == null) ? 0 : selectedContacts.size();
            boolean z3 = contactsAccessGrantedViewStateIfGranted != null && contactsAccessGrantedViewStateIfGranted.isMultiSelectContactMember() && size > 0;
            if (z3 && contactsAccessGrantedViewStateIfGranted != null) {
                composerStartRestartGroup.startReplaceGroup(-1498142335);
                int i10 = i2;
                Set<ReferralOfferDetailsViewData.ContactInfo> selectedContacts2 = contactsAccessGrantedViewStateIfGranted.getSelectedContacts();
                String clearSelectionText = contactsAccessGrantedViewStateIfGranted.getMultiSelectContent().getClearSelectionText();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z4 = (29360128 & i10) == 8388608;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$BottomBarComposable$1$selectionText$1$1
                        @Override // androidx.compose.p011ui.text.LinkInteractionListener
                        public final void onClick(LinkAnnotation link) {
                            Intrinsics.checkNotNullParameter(link, "link");
                            onClearSelectedContactsClicked.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                i3 = i10;
                z = false;
                i5 = size;
                c = 2048;
                i4 = 1;
                BentoText2.m20748BentoTextQnj7Zds(GetMultiSelectContactSelectionText.getMultiSelectContactSelectionText(selectedContacts2, clearSelectionText, (LinkInteractionListener) objRememberedValue, composerStartRestartGroup, 0, 0), PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme3.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 2, null), null, null, null, null, null, 0, false, 0, 0, null, null, TextStyle.m7655copyp1EtxEg$default(bentoTheme3.getTypography(composerStartRestartGroup, i9).getTextS(), bentoTheme3.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion2;
                composer2 = composerStartRestartGroup;
            } else {
                i3 = i2;
                i4 = 1;
                z = false;
                i5 = size;
                c = 2048;
                composerStartRestartGroup.startReplaceGroup(-1497311504);
                RichText disclosureText = viewState.getDisclosureText();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z5 = (i3 & 7168) == 2048;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new LinkInteractionListener() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$BottomBarComposable$1$disclosureTextAsAnnotatedString$1$1
                        @Override // androidx.compose.p011ui.text.LinkInteractionListener
                        public final void onClick(LinkAnnotation link) {
                            Intrinsics.checkNotNullParameter(link, "link");
                            onDeeplinkHandle.invoke(Uri.parse(((LinkAnnotation.Url) link).getUrl()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                companion = companion2;
                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15958toAnnotatedStringV23IgeMak(disclosureText, 0L, (LinkInteractionListener) objRememberedValue2, composerStartRestartGroup, 0, 1), PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme3.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 2, null), null, null, null, null, null, 0, false, 0, 0, null, null, TextStyle.m7655copyp1EtxEg$default(bentoTheme3.getTypography(composerStartRestartGroup, i9).getTextS(), bentoTheme3.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), composerStartRestartGroup, 0, 0, 8188);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            composer2.startReplaceGroup(1198652161);
            if (!z3 || contactsAccessGrantedViewStateIfGranted == null) {
                bentoTheme = bentoTheme3;
                i6 = i9;
                i7 = i3;
                composer3 = composer2;
                obj = null;
                f = 0.0f;
            } else {
                if (i5 == i4) {
                    strReplace$default = contactsAccessGrantedViewStateIfGranted.getMultiSelectContent().getSingleSelectionInviteCtaText();
                } else {
                    strReplace$default = StringsKt.replace$default(contactsAccessGrantedViewStateIfGranted.getMultiSelectContent().getMultipleSelectionInviteCtaText(), "{{number_of_selected_contacts}}", String.valueOf(i5), false, 4, (Object) null);
                }
                Composer composer5 = composer2;
                int i11 = i3;
                bentoTheme = bentoTheme3;
                f = 0.0f;
                i6 = i9;
                obj = null;
                i7 = i11;
                BentoButtonKt.m20586BentoButtonEikTQX8(onSendSelectedInvitesClicked, strReplace$default, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, eventScreen, UserInteractionEventData.Action.INVITE_CONTACTS, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, entryPointContext, null, new ReferralInviteContext(i5, true, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -41, -1, 16383, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 33, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null), bentoTheme3.getSpacing(composer5, i9).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composer5, i9).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer5, i9).m21593getSmallD9Ej5fM(), 2, null), null, null, false, false, null, null, null, null, false, null, composer5, (i11 >> 12) & 14, 0, 8184);
                composer3 = composer5;
            }
            composer3.endReplaceGroup();
            ContactsAccessDeniedViewState contactsAccessDeniedViewStateIfDenied = ReferralOfferDetailsViewStates.ifDenied(viewState);
            composer3.startReplaceGroup(1198712025);
            if (contactsAccessDeniedViewStateIfDenied == null) {
                i8 = i6;
                bentoTheme2 = bentoTheme;
                r0 = 1;
            } else {
                composer3.startReplaceGroup(1198712573);
                if (contactsAccessDeniedViewStateIfDenied.getShouldHideSystemContacts()) {
                    i8 = i6;
                    bentoTheme2 = bentoTheme;
                    z2 = true;
                } else {
                    String inviteContactsText = contactsAccessDeniedViewStateIfDenied.getInviteContactsText();
                    Composer composer6 = composer3;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, eventScreen, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, entryPointContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -9, -1, 16383, null), new Component(Component.ComponentType.BUTTON, "grant_contact_permissions", null, 4, null), null, 37, null), true, false, false, true, false, null, 108, null), f, 1, obj);
                    int i12 = i6;
                    BentoTheme bentoTheme4 = bentoTheme;
                    bentoTheme2 = bentoTheme4;
                    z2 = true;
                    i8 = i6;
                    BentoButtonKt.m20586BentoButtonEikTQX8(onInviteContactsClicked, inviteContactsText, PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme4.getSpacing(composer6, i12).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme4.getSpacing(composer6, i12).m21592getMediumD9Ej5fM(), bentoTheme4.getSpacing(composer6, i12).m21593getSmallD9Ej5fM(), 2, null), null, null, false, false, null, null, null, null, false, null, composer6, (i7 >> 15) & 14, 0, 8184);
                    composer3 = composer6;
                }
                composer3.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                r0 = z2;
            }
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(1198754593);
            if (z3 || (shareLinkButton = viewState.getShareLinkButton()) == null) {
                onShareButtonClicked = function1;
                composer4 = composer3;
            } else {
                String title = shareLinkButton.getTitle();
                int i13 = WhenMappings.$EnumSwitchMapping$0[shareLinkButton.getGenericButtonType().ordinal()];
                if (i13 == r0) {
                    type2 = BentoButtons.Type.Primary;
                } else if (i13 == 2) {
                    type2 = BentoButtons.Type.Secondary;
                } else {
                    type2 = BentoButtons.Type.Secondary;
                }
                BentoButtons.Type type3 = type2;
                Composer composer7 = composer3;
                BentoTheme bentoTheme5 = bentoTheme2;
                int i14 = i8;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, eventScreen, UserInteractionEventData.Action.SHARE_LINK, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, entryPointContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -9, -1, 16383, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 33, null), true, false, false, true, false, null, 108, null), f, r0, null), bentoTheme5.getSpacing(composer7, i14).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme5.getSpacing(composer7, i14).m21592getMediumD9Ej5fM(), 0.0f, 10, null);
                composer7.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer7.changedInstance(shareLinkButton) | ((i7 & 3670016) == 1048576 ? r0 : z) | ((i7 & 7168) == 2048 ? r0 : z);
                Object objRememberedValue3 = composer7.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    onShareButtonClicked = function1;
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ReferralOfferDetailsComposableKt.BottomBarComposable$lambda$28$lambda$27$lambda$26$lambda$25(shareLinkButton, onShareButtonClicked, onDeeplinkHandle);
                        }
                    };
                    composer7.updateRememberedValue(objRememberedValue3);
                } else {
                    onShareButtonClicked = function1;
                }
                composer7.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, title, modifierM5146paddingqDBjuR0$default, null, type3, false, false, null, null, null, null, false, null, composer7, 0, 0, 8168);
                composer4 = composer7;
                Unit unit2 = Unit.INSTANCE;
            }
            composer4.endReplaceGroup();
            composer4.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function1<? super String, Unit> function12 = onShareButtonClicked;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsComposableKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ReferralOfferDetailsComposableKt.BottomBarComposable$lambda$29(viewState, eventScreen, entryPointContext, onDeeplinkHandle, onSendSelectedInvitesClicked, onInviteContactsClicked, function12, onClearSelectedContactsClicked, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarComposable$lambda$28$lambda$27$lambda$26$lambda$25(GenericButton genericButton, Function1 function1, Function1 function12) {
        GenericAction typedAction = genericButton.getTypedAction();
        if (typedAction != null && (typedAction instanceof GenericAction.DeeplinkAction)) {
            function1.invoke(genericButton.getTitle());
            function12.invoke(((GenericAction.DeeplinkAction) typedAction).getUri());
        }
        return Unit.INSTANCE;
    }
}
