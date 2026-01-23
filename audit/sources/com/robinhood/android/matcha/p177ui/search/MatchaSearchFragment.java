package com.robinhood.android.matcha.p177ui.search;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.Compat;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.common.ErrorHandling;
import com.robinhood.android.matcha.p177ui.common.RosettaConverters;
import com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.p178qr.amount.MatchaQrCodeBottomSheet;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchAdapter;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchEvent;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchFragment;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchViewState2;
import com.robinhood.android.matcha.p177ui.search.confirm.ConfirmContactFragment;
import com.robinhood.android.matcha.p177ui.search.confirm.ConfirmNewTransactorBottomSheet;
import com.robinhood.android.matcha.p177ui.search.confirm.ConfirmNewTransactorListBottomSheet;
import com.robinhood.android.matcha.p177ui.search.contactlookup.ContactLookupBottomSheet;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.referral.lib.invite.Activities3;
import com.robinhood.android.referral.lib.invite.InviteUserData;
import com.robinhood.android.social.contracts.matcha.MatchaProfile;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.P2PContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MatchaSearchFragment.kt */
@Metadata(m3635d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 n2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0003lmnB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010?\u001a\u00020\u00192\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J \u0010B\u001a\u00020\u00192\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020$H\u0016J\u0018\u0010H\u001a\u00020\u00192\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020$H\u0016J\u0010\u0010I\u001a\u00020\u00192\u0006\u0010J\u001a\u00020KH\u0016J\u001a\u0010L\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\u00182\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\r\u0010N\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010OJ\u0010\u0010P\u001a\u00020\u00192\u0006\u0010Q\u001a\u00020RH\u0002J\b\u0010S\u001a\u00020\u0019H\u0002J\u0010\u0010T\u001a\u00020\u00192\u0006\u0010U\u001a\u00020VH\u0016J\b\u0010W\u001a\u00020\u0019H\u0016J+\u0010X\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020R2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\\0[2\u0006\u0010]\u001a\u00020^H\u0016¢\u0006\u0002\u0010_J\b\u0010`\u001a\u00020\u0019H\u0016J\u0010\u0010a\u001a\u00020\u00192\u0006\u0010G\u001a\u00020$H\u0016J\b\u0010b\u001a\u00020\u0019H\u0016J\u0010\u0010c\u001a\u00020\u00192\u0006\u0010G\u001a\u00020$H\u0016J\u0010\u0010d\u001a\u00020\u00192\u0006\u0010G\u001a\u00020eH\u0016J\b\u0010f\u001a\u00020\u0019H\u0016J\b\u0010g\u001a\u00020\u0019H\u0016J\b\u0010h\u001a\u00020\u0019H\u0016J\u0010\u0010i\u001a\u00020\u00192\u0006\u0010j\u001a\u00020kH\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010!0!0 X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010%\u001a\u0004\u0018\u00010$2\b\u0010#\u001a\u0004\u0018\u00010$8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00102\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001b\u0010:\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u0015\u001a\u0004\b<\u0010=¨\u0006o²\u0006\n\u0010p\u001a\u00020\\X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchAdapter$Callbacks;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmNewTransactorBottomSheet$Callbacks;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmNewTransactorListBottomSheet$Callbacks;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupBottomSheet$Callbacks;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactFragment$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/matcha/ui/search/MatchaSearchFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDuxo;", "getDuxo", "()Lcom/robinhood/android/matcha/ui/search/MatchaSearchDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "anchorAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Landroid/view/View;", "", "adapter", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchAdapter;", "getAdapter", "()Lcom/robinhood/android/matcha/ui/search/MatchaSearchAdapter;", "adapter$delegate", "profileLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "<set-?>", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "profileTransactor", "getProfileTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", "setProfileTransactor", "(Lcom/robinhood/android/matcha/models/ui/Transactor;)V", "profileTransactor$delegate", "Lkotlin/properties/ReadWriteProperty;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/P2PContext;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/P2PContext;", "loggingContext$delegate", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSendInviteText", "inviteUserData", "Lcom/robinhood/android/referral/lib/invite/InviteUserData;", "confirmationType", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "transactor", "onInviteEmailSent", "onError", "error", "", "onViewCreated", "view", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onTagClick", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "onTagRemoveClick", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onPause", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onContactsRequested", "onTransactorSelected", "onContinuePressed", "proceedToPay", "launchUserProfile", "Lcom/robinhood/android/matcha/models/ui/Transactor$User;", "showUnlicensedStateError", "onShareQrClick", "onTransactorListConfirmed", "bind", "state", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchViewState;", "Callbacks", "Args", "Companion", "feature-p2p_externalDebug", "searchInput"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaSearchFragment extends GenericComposeFragment implements MatchaSearchAdapter.Callbacks, ConfirmNewTransactorBottomSheet.Callbacks, ConfirmNewTransactorListBottomSheet.Callbacks, ContactLookupBottomSheet.Callbacks, ConfirmContactFragment.Callbacks, AutoLoggableFragment {
    public static final int CONTACTS_REQUEST_CODE = 99;
    public EventLogger eventLogger;

    /* renamed from: loggingContext$delegate, reason: from kotlin metadata */
    private final Lazy loggingContext;
    private final ActivityResultLauncher<Intent> profileLauncher;

    /* renamed from: profileTransactor$delegate, reason: from kotlin metadata */
    private final Interfaces3 profileTransactor;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MatchaSearchFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/matcha/ui/search/MatchaSearchFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MatchaSearchFragment.class, "profileTransactor", "getProfileTransactor()Lcom/robinhood/android/matcha/models/ui/Transactor;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MatchaSearchFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MatchaSearchDuxo.class);
    private final SingleItemAdapter<View, Unit> anchorAdapter = SingleItemAdapter.Companion.ofUnit$default(SingleItemAdapter.INSTANCE, C11048R.layout.include_anchor_view, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final Lazy adapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MatchaSearchFragment.adapter_delegate$lambda$0(this.f$0);
        }
    });

    /* compiled from: MatchaSearchFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchFragment$Callbacks;", "", "onSearchResultSelected", "", "transactors", "", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "onTransactionSent", "confirmationType", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "transactor", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSearchResultSelected(List<? extends Transactor> transactors);

        void onTransactionSent(ConfirmationType confirmationType, Transactor transactor);
    }

    /* compiled from: MatchaSearchFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(MatchaSearchFragment matchaSearchFragment, int i, Composer composer, int i2) {
        matchaSearchFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaSearchFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$ComposeContent$1 */
    static final class C215161 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ SnapshotState4<MatchaSearchViewState> $state;
        final /* synthetic */ MatchaSearchFragment this$0;

        C215161(SnapshotState4<MatchaSearchViewState> snapshotState4, MatchaSearchFragment matchaSearchFragment, FocusRequester focusRequester, FocusManager focusManager) {
            this.$state = snapshotState4;
            this.this$0 = matchaSearchFragment;
            this.$focusRequester = focusRequester;
            this.$focusManager = focusManager;
        }

        public final void invoke(Composer composer, int i) {
            final MatchaSearchFragment matchaSearchFragment;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912276438, i, -1, "com.robinhood.android.matcha.ui.search.MatchaSearchFragment.ComposeContent.<anonymous> (MatchaSearchFragment.kt:245)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment center = companion.getCenter();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            final SnapshotState4<MatchaSearchViewState> snapshotState4 = this.$state;
            MatchaSearchFragment matchaSearchFragment2 = this.this$0;
            FocusRequester focusRequester = this.$focusRequester;
            FocusManager focusManager = this.$focusManager;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            SurfaceKt.m5643SurfaceFjzlyU(ZIndexModifier2.zIndex(companion2, 1.0f), null, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), 0L, null, 0.0f, ComposableLambda3.rememberComposableLambda(-385863922, true, new MatchaSearchFragment2(snapshotState4, matchaSearchFragment2, focusRequester, focusManager), composer, 54), composer, 1572870, 58);
            MatchaSearchViewState2 incentivesBanner = snapshotState4.getValue().getIncentivesBanner();
            composer.startReplaceGroup(540704133);
            if (incentivesBanner instanceof MatchaSearchViewState2.Visible) {
                matchaSearchFragment = matchaSearchFragment2;
                SurfaceKt.m5643SurfaceFjzlyU(ZIndexModifier2.zIndex(companion2, 1.0f), null, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), 0L, null, 0.0f, ComposableLambda3.rememberComposableLambda(709596294, true, new MatchaSearchFragment6(incentivesBanner, matchaSearchFragment), composer, 54), composer, 1572870, 58);
            } else {
                matchaSearchFragment = matchaSearchFragment2;
                if (!(incentivesBanner instanceof MatchaSearchViewState2.Hidden)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(matchaSearchFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MatchaSearchFragment.C215161.invoke$lambda$3$lambda$2$lambda$1$lambda$0(matchaSearchFragment, (Context) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue, Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null), null, composer, 0, 4);
            composer.startReplaceGroup(540775913);
            if (((Args) MatchaSearchFragment.INSTANCE.getArgs((Fragment) matchaSearchFragment)).getIsMultiuserUi()) {
                SurfaceKt.m5643SurfaceFjzlyU(null, null, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), 0L, null, 0.0f, ComposableLambda3.rememberComposableLambda(-939239319, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$ComposeContent$1$1$1$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-939239319, i3, -1, "com.robinhood.android.matcha.ui.search.MatchaSearchFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MatchaSearchFragment.kt:350)");
                        }
                        String string2 = matchaSearchFragment.getString(C11048R.string.general_label_done);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        MatchaSearchFragment matchaSearchFragment3 = matchaSearchFragment;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer2.changedInstance(matchaSearchFragment3);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new MatchaSearchFragment8(matchaSearchFragment3);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        boolean z = !snapshotState4.getValue().getTags().isEmpty();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue2), string2, PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM()), null, null, z, false, null, null, null, null, false, null, composer2, 0, 0, 8152);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 1572864, 59);
            }
            composer.endReplaceGroup();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RecyclerView invoke$lambda$3$lambda$2$lambda$1$lambda$0(MatchaSearchFragment matchaSearchFragment, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View viewInflate = LayoutInflater.from(context).inflate(C21284R.layout.fragment_matcha_search_user, (ViewGroup) null, false);
            CompositeAdapter compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{matchaSearchFragment.anchorAdapter, matchaSearchFragment.getAdapter()});
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) viewInflate;
            matchaSearchFragment.bindAdapter(recyclerView, compositeAdapter);
            return recyclerView;
        }
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public MatchaSearchFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$profileLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    MatchaSearchFragment.Callbacks callbacks = this.this$0.getCallbacks();
                    Transactor profileTransactor = this.this$0.getProfileTransactor();
                    if (profileTransactor == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    callbacks.onSearchResultSelected(CollectionsKt.listOf(profileTransactor));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.profileLauncher = activityResultLauncherRegisterForActivityResult;
        this.profileTransactor = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[1]);
        this.loggingContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaSearchFragment.loggingContext_delegate$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchaSearchDuxo getDuxo() {
        return (MatchaSearchDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchaSearchAdapter getAdapter() {
        return (MatchaSearchAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaSearchAdapter adapter_delegate$lambda$0(MatchaSearchFragment matchaSearchFragment) {
        Context contextRequireContext = matchaSearchFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return new MatchaSearchAdapter(contextRequireContext, matchaSearchFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Transactor getProfileTransactor() {
        return (Transactor) this.profileTransactor.getValue(this, $$delegatedProperties[1]);
    }

    private final void setProfileTransactor(Transactor transactor) {
        this.profileTransactor.setValue(this, $$delegatedProperties[1], transactor);
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.P2P_SEARCH, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, Context.ProductTag.PEER_TO_PEER, 0, null, ((Args) INSTANCE.getArgs((Fragment) this)).getEntryPoint().getIdentifier(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, getLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1153, -1, -1, -268435457, -1, -1, 16383, null);
    }

    private final P2PContext getLoggingContext() {
        return (P2PContext) this.loggingContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P2PContext loggingContext_delegate$lambda$1(MatchaSearchFragment matchaSearchFragment) {
        Companion companion = INSTANCE;
        return new P2PContext(RosettaConverters.toProtobuf(((Args) companion.getArgs((Fragment) matchaSearchFragment)).getDirection()), null, ((Args) companion.getArgs((Fragment) matchaSearchFragment)).getAmount().getDecimalValue().floatValue(), null, null, null, 58, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            MatchaSearchDuxo duxo = getDuxo();
            Compat compat = Compat.INSTANCE;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            duxo.setContactsEnabled(compat.checkSelfPermission(contextRequireContext, "android.permission.READ_CONTACTS"));
        }
    }

    @Override // com.robinhood.android.matcha.ui.search.confirm.ConfirmContactFragment.Callbacks
    public void onSendInviteText(InviteUserData inviteUserData, ConfirmationType confirmationType, Transactor transactor) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(inviteUserData, "inviteUserData");
        Intrinsics.checkNotNullParameter(confirmationType, "confirmationType");
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activities3.inviteViaText(fragmentActivityRequireActivity, inviteUserData);
        getCallbacks().onTransactionSent(confirmationType, transactor);
    }

    @Override // com.robinhood.android.matcha.ui.search.confirm.ConfirmContactFragment.Callbacks
    public void onInviteEmailSent(ConfirmationType confirmationType, Transactor transactor) {
        Intrinsics.checkNotNullParameter(confirmationType, "confirmationType");
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        getCallbacks().onTransactionSent(confirmationType, transactor);
    }

    @Override // com.robinhood.android.matcha.ui.search.confirm.ConfirmContactFragment.Callbacks
    public void onError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        AbsErrorHandler.handleError$default(ErrorHandling.getMatchaErrorHandler(requireBaseActivity()), error, false, 2, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C215171(null), 1, null);
    }

    /* compiled from: MatchaSearchFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchFragment$onViewCreated$1", m3645f = "MatchaSearchFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$onViewCreated$1 */
    static final class C215171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C215171(Continuation<? super C215171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215171 c215171 = MatchaSearchFragment.this.new C215171(continuation);
            c215171.L$0 = obj;
            return c215171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C215171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MatchaSearchFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchFragment$onViewCreated$1$1", m3645f = "MatchaSearchFragment.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MatchaSearchFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MatchaSearchFragment matchaSearchFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = matchaSearchFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MatchaSearchFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C502741 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ MatchaSearchFragment $tmp0;

                C502741(MatchaSearchFragment matchaSearchFragment) {
                    this.$tmp0 = matchaSearchFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, MatchaSearchFragment.class, "bind", "bind(Lcom/robinhood/android/matcha/ui/search/MatchaSearchViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(MatchaSearchViewState matchaSearchViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                    Object objInvokeSuspend$bind = AnonymousClass1.invokeSuspend$bind(this.$tmp0, matchaSearchViewState, continuation);
                    return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((MatchaSearchViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<MatchaSearchViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C502741 c502741 = new C502741(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c502741, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$bind(MatchaSearchFragment matchaSearchFragment, MatchaSearchViewState matchaSearchViewState, Continuation continuation) throws Resources.NotFoundException {
                matchaSearchFragment.bind(matchaSearchViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(MatchaSearchFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(MatchaSearchFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: MatchaSearchFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchFragment$onViewCreated$1$2", m3645f = "MatchaSearchFragment.kt", m3646l = {182}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MatchaSearchFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MatchaSearchFragment matchaSearchFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = matchaSearchFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    final MatchaSearchFragment matchaSearchFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment.onViewCreated.1.2.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<MatchaSearchEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<MatchaSearchEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<MatchaSearchEvent> eventConsumerInvoke;
                            EventConsumer<MatchaSearchEvent> eventConsumerInvoke2;
                            EventConsumer<MatchaSearchEvent> eventConsumerInvoke3;
                            final MatchaSearchFragment matchaSearchFragment2 = matchaSearchFragment;
                            if ((event.getData() instanceof MatchaSearchEvent.TooManyPeopleError) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$onViewCreated$1$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m16425invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m16425invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                                        android.content.Context contextRequireContext = matchaSearchFragment2.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                        RhDialogFragment.Builder theme = companion.create(contextRequireContext).setId(C21284R.id.dialog_id_matcha_transaction_error).setPogPictogram(C20690R.drawable.pict_mono_rds_warning).setTitle(C21284R.string.matcha_too_many_people_error_title, new Object[0]).setMessage(C21284R.string.matcha_too_many_people_error_detail, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
                                        FragmentManager childFragmentManager = matchaSearchFragment2.getChildFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                        RhDialogFragment.Builder.show$default(theme, childFragmentManager, "too-many-people-error", false, 4, null);
                                    }
                                });
                            }
                            final MatchaSearchFragment matchaSearchFragment3 = matchaSearchFragment;
                            if ((event.getData() instanceof MatchaSearchEvent.Error) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$onViewCreated$1$2$1$emit$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m16426invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m16426invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        AbsErrorHandler.handleError$default(matchaSearchFragment3.getActivityErrorHandler(), ((MatchaSearchEvent.Error) event.getData()).getThrowable(), false, 2, null);
                                    }
                                });
                            }
                            final MatchaSearchFragment matchaSearchFragment4 = matchaSearchFragment;
                            if ((event.getData() instanceof MatchaSearchEvent.TransactorSelected) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$onViewCreated$1$2$1$emit$$inlined$consumeIfType$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m16427invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m16427invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        MatchaSearchEvent.TransactorSelected transactorSelected = (MatchaSearchEvent.TransactorSelected) event.getData();
                                        if (transactorSelected instanceof MatchaSearchEvent.TransactorSelected.ConfirmNewTransactor) {
                                            ConfirmNewTransactorBottomSheet confirmNewTransactorBottomSheet = (ConfirmNewTransactorBottomSheet) ConfirmNewTransactorBottomSheet.INSTANCE.newInstance((Parcelable) new ConfirmNewTransactorBottomSheet.Args(((MatchaSearchEvent.TransactorSelected.ConfirmNewTransactor) transactorSelected).getTransactor()));
                                            FragmentManager childFragmentManager = matchaSearchFragment4.getChildFragmentManager();
                                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                            confirmNewTransactorBottomSheet.show(childFragmentManager, "confirm-search-user");
                                            return;
                                        }
                                        if (transactorSelected instanceof MatchaSearchEvent.TransactorSelected.ReverseLookupContact) {
                                            ContactLookupBottomSheet contactLookupBottomSheet = (ContactLookupBottomSheet) ContactLookupBottomSheet.INSTANCE.newInstance((Parcelable) new ContactLookupBottomSheet.Args(((MatchaSearchEvent.TransactorSelected.ReverseLookupContact) transactorSelected).getTransactor()));
                                            FragmentManager childFragmentManager2 = matchaSearchFragment4.getChildFragmentManager();
                                            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                            contactLookupBottomSheet.show(childFragmentManager2, "contact-lookup");
                                            return;
                                        }
                                        if (transactorSelected instanceof MatchaSearchEvent.TransactorSelected.ConfirmNewTransactors) {
                                            ConfirmNewTransactorListBottomSheet confirmNewTransactorListBottomSheet = (ConfirmNewTransactorListBottomSheet) ConfirmNewTransactorListBottomSheet.INSTANCE.newInstance((Parcelable) new ConfirmNewTransactorListBottomSheet.Args(((MatchaSearchEvent.TransactorSelected.ConfirmNewTransactors) transactorSelected).getFirstTimeTransactors()));
                                            FragmentManager childFragmentManager3 = matchaSearchFragment4.getChildFragmentManager();
                                            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                            confirmNewTransactorListBottomSheet.show(childFragmentManager3, "confirm-search-transactor-list");
                                            return;
                                        }
                                        if (!(transactorSelected instanceof MatchaSearchEvent.TransactorSelected.NextScreen)) {
                                            if (!(transactorSelected instanceof MatchaSearchEvent.TransactorSelected.InviteContact)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            ConfirmContactFragment.Companion companion = ConfirmContactFragment.INSTANCE;
                                            Transactor transactor = ((MatchaSearchEvent.TransactorSelected.InviteContact) transactorSelected).getTransactor();
                                            MatchaSearchFragment.Companion companion2 = MatchaSearchFragment.INSTANCE;
                                            ConfirmContactFragment confirmContactFragment = (ConfirmContactFragment) companion.newInstance((Parcelable) new ConfirmContactFragment.Args(transactor, ((MatchaSearchFragment.Args) companion2.getArgs((Fragment) matchaSearchFragment4)).getDirection(), matchaSearchFragment4.getDuxo().getStateFlow().getValue().getIncentiveAmount(), ((MatchaSearchFragment.Args) companion2.getArgs((Fragment) matchaSearchFragment4)).getSourceOfFunds(), ((MatchaSearchFragment.Args) companion2.getArgs((Fragment) matchaSearchFragment4)).getAmount()));
                                            FragmentManager childFragmentManager4 = matchaSearchFragment4.getChildFragmentManager();
                                            Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                                            confirmContactFragment.show(childFragmentManager4, "confirm-search-transactor-list");
                                            return;
                                        }
                                        matchaSearchFragment4.getCallbacks().onSearchResultSelected(((MatchaSearchEvent.TransactorSelected.NextScreen) transactorSelected).getTransactors());
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    @SuppressLint({"InflateParams"})
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-230696757);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-230696757, i2, -1, "com.robinhood.android.matcha.ui.search.MatchaSearchFragment.ComposeContent (MatchaSearchFragment.kt:239)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(912276438, true, new C215161(snapshotState4CollectAsStateWithLifecycle, this, (FocusRequester) objRememberedValue, (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager())), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaSearchFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTagClick(int index) {
        getDuxo().onTagClick(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTagRemoveClick() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.REMOVE_FROM_LIST, getEventScreen(), new Component(Component.ComponentType.CHIP, null, null, 6, null), null, null, false, 56, null);
        getDuxo().onTagRemoveClick();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        Companion companion = INSTANCE;
        toolbar.setTitle(getString(((Args) companion.getArgs((Fragment) this)).getDirection().getLabelResId()) + PlaceholderUtils.XXShortPlaceholderText + Money.format$default(((Args) companion.getArgs((Fragment) this)).getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Integer orNull;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 99 && (orNull = ArraysKt.getOrNull(grantResults, 0)) != null && orNull.intValue() == 0) {
            getDuxo().setContactsEnabled(true);
        } else {
            Toast.makeText(requireActivity(), C21284R.string.matcha_contact_permission_denied, 0).show();
        }
    }

    @Override // com.robinhood.android.matcha.ui.search.MatchaSearchAdapter.Callbacks
    public void onContactsRequested() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.BUTTON, "enable_contacts", null, 4, null), null, getScreenEventContext(), false, 41, null);
        requestPermissionsCompat(99, "android.permission.READ_CONTACTS");
    }

    @Override // com.robinhood.android.matcha.ui.search.MatchaSearchAdapter.Callbacks
    public void onTransactorSelected(Transactor transactor) {
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        getDuxo().onTransactorSelected(transactor);
    }

    @Override // com.robinhood.android.matcha.ui.search.MatchaSearchAdapter.Callbacks
    public void onContinuePressed() {
        getDuxo().onContinuePressed();
    }

    @Override // com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupBottomSheet.Callbacks
    public void proceedToPay(Transactor transactor) {
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        getDuxo().onContactConfirmed(transactor);
    }

    @Override // com.robinhood.android.matcha.ui.search.MatchaSearchAdapter.Callbacks, com.robinhood.android.matcha.ui.search.confirm.ConfirmNewTransactorBottomSheet.Callbacks, com.robinhood.android.matcha.ui.search.confirm.ConfirmNewTransactorListBottomSheet.Callbacks, com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupBottomSheet.Callbacks
    public void launchUserProfile(Transactor.User transactor) {
        MatchaTransaction.Direction direction;
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        EventLogger eventLogger = getEventLogger();
        Screen eventScreen = getEventScreen();
        com.robinhood.rosetta.eventlogging.Context contextCopy$default = com.robinhood.rosetta.eventlogging.Context.copy$default(getScreenEventContext(), 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, P2PContext.copy$default(getLoggingContext(), null, RosettaConverters.toTargetType(transactor), 0.0f, null, null, null, 61, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -268435457, -1, -1, 16383, null);
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_PROFILE, eventScreen, new Component(Component.ComponentType.ROW, null, null, 6, null), null, contextCopy$default, false, 40, null);
        setProfileTransactor(transactor);
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String userId = transactor.getUser().getUserId();
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) INSTANCE.getArgs((Fragment) this)).getDirection().ordinal()];
        if (i == 1) {
            direction = MatchaTransaction.Direction.SEND;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            direction = MatchaTransaction.Direction.REQUEST;
        }
        this.profileLauncher.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new MatchaProfile(userId, direction, false, 4, null), false, false, false, null, false, true, false, false, false, null, false, 7028, null));
    }

    @Override // com.robinhood.android.matcha.ui.search.MatchaSearchAdapter.Callbacks
    public void showUnlicensedStateError() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder theme = companion.create(contextRequireContext).setPogPictogram(C20690R.drawable.pict_mono_rds_warning).setTitle(C21284R.string.matcha_transactor_unlicensed_state_error_title, new Object[0]).setMessage(C21284R.string.matcha_transactor_unlicensed_state_error_detail, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, childFragmentManager, "unlicensed-state-error", false, 4, null);
    }

    @Override // com.robinhood.android.matcha.ui.search.MatchaSearchAdapter.Callbacks
    public void onShareQrClick() {
        MatchaQrCodeBottomSheet matchaQrCodeBottomSheet = (MatchaQrCodeBottomSheet) MatchaQrCodeBottomSheet.INSTANCE.newInstance((Parcelable) new MatchaQrCodeBottomSheet.Args(((Args) INSTANCE.getArgs((Fragment) this)).getAmount()));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        matchaQrCodeBottomSheet.show(childFragmentManager, "share-qr-sheet");
    }

    @Override // com.robinhood.android.matcha.ui.search.confirm.ConfirmNewTransactorBottomSheet.Callbacks, com.robinhood.android.matcha.ui.search.confirm.ConfirmNewTransactorListBottomSheet.Callbacks
    public void onTransactorListConfirmed() {
        getDuxo().onTransactorListConfirmed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(MatchaSearchViewState state) throws Resources.NotFoundException {
        CharSequence text;
        getAdapter().submitList(state.getRows());
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            StringResource toolbarSubtitle = state.getToolbarSubtitle();
            if (toolbarSubtitle != null) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                text = toolbarSubtitle.getText(resources);
            } else {
                text = null;
            }
            rhToolbar.setSubtitle(text);
        }
    }

    /* compiled from: MatchaSearchFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchFragment$Args;", "Landroid/os/Parcelable;", "isMultiuserUi", "", "selectedTransactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "direction", "Lcom/robinhood/android/matcha/ui/models/Direction;", "amount", "Lcom/robinhood/models/util/Money;", "entryPoint", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "sourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "<init>", "(ZLcom/robinhood/android/matcha/models/ui/Transactor;Lcom/robinhood/android/matcha/ui/models/Direction;Lcom/robinhood/models/util/Money;Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;Lcom/robinhood/android/models/matcha/api/SourceOfFunds;)V", "()Z", "getSelectedTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", "getDirection", "()Lcom/robinhood/android/matcha/ui/models/Direction;", "getAmount", "()Lcom/robinhood/models/util/Money;", "getEntryPoint", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "getSourceOfFunds", "()Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Money amount;
        private final Direction direction;
        private final MatchaTransaction.EntryPoint entryPoint;
        private final boolean isMultiuserUi;
        private final Transactor selectedTransactor;
        private final SourceOfFunds sourceOfFunds;

        /* compiled from: MatchaSearchFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, (Transactor) parcel.readParcelable(Args.class.getClassLoader()), Direction.CREATOR.createFromParcel(parcel), (Money) parcel.readParcelable(Args.class.getClassLoader()), MatchaTransaction.EntryPoint.valueOf(parcel.readString()), (SourceOfFunds) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isMultiuserUi ? 1 : 0);
            dest.writeParcelable(this.selectedTransactor, flags);
            this.direction.writeToParcel(dest, flags);
            dest.writeParcelable(this.amount, flags);
            dest.writeString(this.entryPoint.name());
            dest.writeParcelable(this.sourceOfFunds, flags);
        }

        public Args(boolean z, Transactor transactor, Direction direction, Money amount, MatchaTransaction.EntryPoint entryPoint, SourceOfFunds sourceOfFunds) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.isMultiuserUi = z;
            this.selectedTransactor = transactor;
            this.direction = direction;
            this.amount = amount;
            this.entryPoint = entryPoint;
            this.sourceOfFunds = sourceOfFunds;
        }

        public /* synthetic */ Args(boolean z, Transactor transactor, Direction direction, Money money, MatchaTransaction.EntryPoint entryPoint, SourceOfFunds sourceOfFunds, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : transactor, direction, money, entryPoint, sourceOfFunds);
        }

        /* renamed from: isMultiuserUi, reason: from getter */
        public final boolean getIsMultiuserUi() {
            return this.isMultiuserUi;
        }

        public final Transactor getSelectedTransactor() {
            return this.selectedTransactor;
        }

        public final Direction getDirection() {
            return this.direction;
        }

        public final Money getAmount() {
            return this.amount;
        }

        public final MatchaTransaction.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final SourceOfFunds getSourceOfFunds() {
            return this.sourceOfFunds;
        }
    }

    /* compiled from: MatchaSearchFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/MatchaSearchFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchFragment;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchFragment$Args;", "<init>", "()V", "CONTACTS_REQUEST_CODE", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MatchaSearchFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MatchaSearchFragment matchaSearchFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, matchaSearchFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MatchaSearchFragment newInstance(Args args) {
            return (MatchaSearchFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MatchaSearchFragment matchaSearchFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, matchaSearchFragment, args);
        }
    }
}
