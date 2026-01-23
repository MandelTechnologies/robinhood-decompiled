package com.robinhood.android.rhy.cardactivation.p243ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.mcduckling.location.LocationProtectionManager;
import com.robinhood.android.common.mcduckling.p084ui.LocationProtectionDialogFragment;
import com.robinhood.android.common.mcduckling.p084ui.WizardFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.rhy.cardactivation.C27358R;
import com.robinhood.android.rhy.cardactivation.p243ui.CardActivationLocationProtectionFragment;
import com.robinhood.android.rhy.cardactivation.p243ui.NotificationCarouselView;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CardActivationLocationProtectionFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0003<=>B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0016J\u001a\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0018\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0014J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020\"H\u0016J\b\u00108\u001a\u00020\"H\u0016J\u0010\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u000204H\u0002J\b\u0010;\u001a\u000204H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b\u001e\u0010\u001f¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationLocationProtectionFragment;", "Lcom/robinhood/android/common/mcduckling/ui/WizardFragment;", "Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment$Callbacks;", "<init>", "()V", "locationProtectionManager", "Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;", "getLocationProtectionManager", "()Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;", "setLocationProtectionManager", "(Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;)V", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "getMinervaAccountStore", "()Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "setMinervaAccountStore", "(Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;)V", "continueBtn", "Landroid/widget/Button;", "getContinueBtn", "()Landroid/widget/Button;", "continueBtn$delegate", "Lkotlin/properties/ReadOnlyProperty;", "carouselView", "Lcom/robinhood/android/rhy/cardactivation/ui/NotificationCarouselView;", "getCarouselView", "()Lcom/robinhood/android/rhy/cardactivation/ui/NotificationCarouselView;", "carouselView$delegate", "callbacks", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationLocationProtectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationLocationProtectionFragment$Callbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onLocationProtectionConfirmed", "onLocationProtectionDismissed", "toggleLocationProtection", "enable", "onBackPressed", "Callbacks", "Args", "Companion", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class CardActivationLocationProtectionFragment extends WizardFragment implements LocationProtectionDialogFragment.Callbacks {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: carouselView$delegate, reason: from kotlin metadata */
    private final Interfaces2 carouselView;

    /* renamed from: continueBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 continueBtn;
    public LocationProtectionManager locationProtectionManager;
    public MinervaAccountStore minervaAccountStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CardActivationLocationProtectionFragment.class, "continueBtn", "getContinueBtn()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(CardActivationLocationProtectionFragment.class, "carouselView", "getCarouselView()Lcom/robinhood/android/rhy/cardactivation/ui/NotificationCarouselView;", 0)), Reflection.property1(new PropertyReference1Impl(CardActivationLocationProtectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationLocationProtectionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CardActivationLocationProtectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationLocationProtectionFragment$Callbacks;", "", "onLocationProtectionConfigured", "", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onLocationProtectionConfigured();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return true;
    }

    public CardActivationLocationProtectionFragment() {
        super(C27358R.layout.fragment_card_activation_location_protection);
        this.continueBtn = bindView(C27358R.id.continue_btn);
        this.carouselView = bindView(C27358R.id.notification_carousel_view);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationLocationProtectionFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof CardActivationLocationProtectionFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    public final LocationProtectionManager getLocationProtectionManager() {
        LocationProtectionManager locationProtectionManager = this.locationProtectionManager;
        if (locationProtectionManager != null) {
            return locationProtectionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationProtectionManager");
        return null;
    }

    public final void setLocationProtectionManager(LocationProtectionManager locationProtectionManager) {
        Intrinsics.checkNotNullParameter(locationProtectionManager, "<set-?>");
        this.locationProtectionManager = locationProtectionManager;
    }

    public final MinervaAccountStore getMinervaAccountStore() {
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore;
        if (minervaAccountStore != null) {
            return minervaAccountStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("minervaAccountStore");
        return null;
    }

    public final void setMinervaAccountStore(MinervaAccountStore minervaAccountStore) {
        Intrinsics.checkNotNullParameter(minervaAccountStore, "<set-?>");
        this.minervaAccountStore = minervaAccountStore;
    }

    private final Button getContinueBtn() {
        return (Button) this.continueBtn.getValue(this, $$delegatedProperties[0]);
    }

    private final NotificationCarouselView getCarouselView() {
        return (NotificationCarouselView) this.carouselView.getValue(this, $$delegatedProperties[1]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.robinhood.android.common.mcduckling.p084ui.WizardFragment, com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (context instanceof Callbacks) {
            return;
        }
        throw new IllegalArgumentException((context + " must implement " + Callbacks.class.getName()).toString());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        ActionBar supportActionBar;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        FragmentActivity activity = getActivity();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity == null || (supportActionBar = appCompatActivity.getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.setDisplayHomeAsUpEnabled(false);
    }

    @Override // com.robinhood.android.common.mcduckling.p084ui.WizardFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        OnClickListeners.onClick(getContinueBtn(), new Function0() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationLocationProtectionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardActivationLocationProtectionFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        NotificationCarouselView carouselView = getCarouselView();
        String string2 = getString(C27358R.string.card_activation_location_protection_fake_notification_title_1);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getString(C27358R.string.card_activation_location_protection_fake_notification_message_1);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        NotificationCarouselView.Item item = new NotificationCarouselView.Item(string2, string3);
        String string4 = getString(C27358R.string.card_activation_location_protection_fake_notification_title_2);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String string5 = getString(C27358R.string.card_activation_location_protection_fake_notification_message_2);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        carouselView.setItems(item, new NotificationCarouselView.Item(string4, string5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(CardActivationLocationProtectionFragment cardActivationLocationProtectionFragment) {
        LocationProtectionDialogFragment.INSTANCE.showLocationProtectionConfirmation(cardActivationLocationProtectionFragment);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C27358R.menu.menu_skip, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C27358R.id.action_skip) {
            toggleLocationProtection(false);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.common.mcduckling.ui.LocationProtectionDialogFragment.Callbacks
    public void onLocationProtectionConfirmed() {
        toggleLocationProtection(true);
    }

    @Override // com.robinhood.android.common.mcduckling.ui.LocationProtectionDialogFragment.Callbacks
    public void onLocationProtectionDismissed() {
        toggleLocationProtection(false);
    }

    private final void toggleLocationProtection(final boolean enable) {
        showProgressBar(true);
        getContinueBtn().setEnabled(false);
        Completable completableFlatMapCompletable = getMinervaAccountStore().streamAccount(((Args) INSTANCE.getArgs((Fragment) this)).getMinervaAccountId()).firstOrError().map(new Function() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationLocationProtectionFragment.toggleLocationProtection.1
            @Override // io.reactivex.functions.Function
            public final UUID apply(MinervaAccount it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }
        }).flatMapCompletable(new Function() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationLocationProtectionFragment.toggleLocationProtection.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(UUID minervaAccountId) {
                Intrinsics.checkNotNullParameter(minervaAccountId, "minervaAccountId");
                return CardActivationLocationProtectionFragment.this.getLocationProtectionManager().toggleLocationProtection(minervaAccountId, enable);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, CompletablesAndroid.observeOnMainThread(completableFlatMapCompletable), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationLocationProtectionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardActivationLocationProtectionFragment.toggleLocationProtection$lambda$1(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationLocationProtectionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardActivationLocationProtectionFragment.toggleLocationProtection$lambda$2(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleLocationProtection$lambda$1(CardActivationLocationProtectionFragment cardActivationLocationProtectionFragment) {
        cardActivationLocationProtectionFragment.showProgressBar(false);
        cardActivationLocationProtectionFragment.getCallbacks().onLocationProtectionConfigured();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleLocationProtection$lambda$2(CardActivationLocationProtectionFragment cardActivationLocationProtectionFragment, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        cardActivationLocationProtectionFragment.showProgressBar(false);
        cardActivationLocationProtectionFragment.getContinueBtn().setEnabled(true);
        AbsErrorHandler.handleError$default(cardActivationLocationProtectionFragment.getActivityErrorHandler(), throwable, false, 2, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CardActivationLocationProtectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationLocationProtectionFragment$Args;", "Landroid/os/Parcelable;", "minervaAccountId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getMinervaAccountId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID minervaAccountId;

        /* compiled from: CardActivationLocationProtectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.minervaAccountId;
            }
            return args.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getMinervaAccountId() {
            return this.minervaAccountId;
        }

        public final Args copy(UUID minervaAccountId) {
            Intrinsics.checkNotNullParameter(minervaAccountId, "minervaAccountId");
            return new Args(minervaAccountId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.minervaAccountId, ((Args) other).minervaAccountId);
        }

        public int hashCode() {
            return this.minervaAccountId.hashCode();
        }

        public String toString() {
            return "Args(minervaAccountId=" + this.minervaAccountId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.minervaAccountId);
        }

        public Args(UUID minervaAccountId) {
            Intrinsics.checkNotNullParameter(minervaAccountId, "minervaAccountId");
            this.minervaAccountId = minervaAccountId;
        }

        public final UUID getMinervaAccountId() {
            return this.minervaAccountId;
        }
    }

    /* compiled from: CardActivationLocationProtectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationLocationProtectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationLocationProtectionFragment;", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationLocationProtectionFragment$Args;", "<init>", "()V", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CardActivationLocationProtectionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CardActivationLocationProtectionFragment cardActivationLocationProtectionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cardActivationLocationProtectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CardActivationLocationProtectionFragment newInstance(Args args) {
            return (CardActivationLocationProtectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CardActivationLocationProtectionFragment cardActivationLocationProtectionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cardActivationLocationProtectionFragment, args);
        }
    }
}
