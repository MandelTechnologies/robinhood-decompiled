package com.robinhood.android.equityscreener;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.equities.contracts.EquityScreenerTableFragmentKey;
import com.robinhood.android.equities.contracts.ScreenerTableEntryIntentKey;
import com.robinhood.android.equityscreener.intro.ScreenerIntroFragment;
import com.robinhood.android.equityscreener.table.EquityScreenerTableFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.librobinhood.data.store.bonfire.screener.annotations.ShowScreenerIntroEntryPointPref;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.prefs.BooleanPreference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseScreenerTableActivity.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\fH\u0016JT\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u001a2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u001b2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u001aH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/BaseScreenerTableActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/equityscreener/intro/ScreenerIntroFragment$Callbacks;", "<init>", "()V", "showScreenerIntroEntryPointPref", "Lcom/robinhood/prefs/BooleanPreference;", "getShowScreenerIntroEntryPointPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShowScreenerIntroEntryPointPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setFragment", "fragment", "Landroidx/fragment/app/Fragment;", "showIntroCta", "showScreener", "screenerId", "", "showPresetCarousel", "onIntroCtaClicked", "navigate", "shouldShowIntroCta", "Lkotlin/Function0;", "Lkotlin/Function1;", "Companion", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class BaseScreenerTableActivity extends BaseActivity implements ScreenerIntroFragment.Callbacks {

    @ShowScreenerIntroEntryPointPref
    public BooleanPreference showScreenerIntroEntryPointPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public BaseScreenerTableActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    public final BooleanPreference getShowScreenerIntroEntryPointPref() {
        BooleanPreference booleanPreference = this.showScreenerIntroEntryPointPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showScreenerIntroEntryPointPref");
        return null;
    }

    public final void setShowScreenerIntroEntryPointPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.showScreenerIntroEntryPointPref = booleanPreference;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initEdgeToEdge();
        if (savedInstanceState == null) {
            navigate$default(this, null, null, null, null, null, 31, null);
        }
    }

    private final void setFragment(Fragment fragment) {
        if (getSupportFragmentManager().getFragments().size() > 0) {
            replaceFragmentWithoutBackStack(fragment);
        } else {
            setFragment(C11048R.id.fragment_container, fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showIntroCta() {
        setFragment(ScreenerIntroFragment.INSTANCE.newInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showScreener(String screenerId) {
        EquityScreenerTableFragment.Companion companion = EquityScreenerTableFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        setFragment(companion.newInstance((Parcelable) new EquityScreenerTableFragmentKey(screenerId, ((ScreenerTableEntryIntentKey) companion2.getExtras((Activity) this)).getSource(), false, ((ScreenerTableEntryIntentKey) companion2.getExtras((Activity) this)).getAccountNumber(), 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPresetCarousel() {
        EquityScreenerTableFragment.Companion companion = EquityScreenerTableFragment.INSTANCE;
        String id = ScreenersStore.INSTANCE.getDefaultScreener().getId();
        Companion companion2 = INSTANCE;
        setFragment(companion.newInstance((Parcelable) new EquityScreenerTableFragmentKey(id, ((ScreenerTableEntryIntentKey) companion2.getExtras((Activity) this)).getSource(), true, ((ScreenerTableEntryIntentKey) companion2.getExtras((Activity) this)).getAccountNumber())));
    }

    @Override // com.robinhood.android.equityscreener.intro.ScreenerIntroFragment.Callbacks
    public void onIntroCtaClicked() {
        navigate$default(this, null, null, null, null, null, 31, null);
    }

    static /* synthetic */ void navigate$default(BaseScreenerTableActivity baseScreenerTableActivity, BooleanPreference booleanPreference, String str, Function0 function0, Function1 function1, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            booleanPreference = baseScreenerTableActivity.getShowScreenerIntroEntryPointPref();
        }
        if ((i & 2) != 0) {
            str = ((ScreenerTableEntryIntentKey) INSTANCE.getExtras((Activity) baseScreenerTableActivity)).getScreenerId();
        }
        if ((i & 4) != 0) {
            function0 = new C156461(baseScreenerTableActivity);
        }
        if ((i & 8) != 0) {
            function1 = new C156472(baseScreenerTableActivity);
        }
        if ((i & 16) != 0) {
            function02 = new C156483(baseScreenerTableActivity);
        }
        Function0 function03 = function02;
        Function0 function04 = function0;
        BooleanPreference booleanPreference2 = booleanPreference;
        baseScreenerTableActivity.navigate(booleanPreference2, str, function04, function1, function03);
    }

    /* compiled from: BaseScreenerTableActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equityscreener.BaseScreenerTableActivity$navigate$1 */
    /* synthetic */ class C156461 extends FunctionReferenceImpl implements Function0<Unit> {
        C156461(Object obj) {
            super(0, obj, BaseScreenerTableActivity.class, "showIntroCta", "showIntroCta()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((BaseScreenerTableActivity) this.receiver).showIntroCta();
        }
    }

    /* compiled from: BaseScreenerTableActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equityscreener.BaseScreenerTableActivity$navigate$2 */
    /* synthetic */ class C156472 extends FunctionReferenceImpl implements Function1<String, Unit> {
        C156472(Object obj) {
            super(1, obj, BaseScreenerTableActivity.class, "showScreener", "showScreener(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BaseScreenerTableActivity) this.receiver).showScreener(p0);
        }
    }

    /* compiled from: BaseScreenerTableActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equityscreener.BaseScreenerTableActivity$navigate$3 */
    /* synthetic */ class C156483 extends FunctionReferenceImpl implements Function0<Unit> {
        C156483(Object obj) {
            super(0, obj, BaseScreenerTableActivity.class, "showPresetCarousel", "showPresetCarousel()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((BaseScreenerTableActivity) this.receiver).showPresetCarousel();
        }
    }

    private final void navigate(BooleanPreference shouldShowIntroCta, String screenerId, Function0<Unit> showIntroCta, Function1<? super String, Unit> showScreener, Function0<Unit> showPresetCarousel) {
        INSTANCE.navigate(shouldShowIntroCta, screenerId, showIntroCta, showScreener, showPresetCarousel);
    }

    /* compiled from: BaseScreenerTableActivity.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005JH\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/BaseScreenerTableActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/equityscreener/BaseScreenerTableActivity;", "Lcom/robinhood/android/equities/contracts/ScreenerTableEntryIntentKey;", "<init>", "()V", "navigate", "", "shouldShowIntroCta", "Lcom/robinhood/prefs/BooleanPreference;", "screenerId", "", "showIntroCta", "Lkotlin/Function0;", "showScreener", "Lkotlin/Function1;", "showPresetCarousel", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<BaseScreenerTableActivity, ScreenerTableEntryIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public ScreenerTableEntryIntentKey getExtras(BaseScreenerTableActivity baseScreenerTableActivity) {
            return (ScreenerTableEntryIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, baseScreenerTableActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, ScreenerTableEntryIntentKey screenerTableEntryIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, screenerTableEntryIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, ScreenerTableEntryIntentKey screenerTableEntryIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, screenerTableEntryIntentKey);
        }

        public final void navigate(BooleanPreference shouldShowIntroCta, String screenerId, Function0<Unit> showIntroCta, Function1<? super String, Unit> showScreener, Function0<Unit> showPresetCarousel) {
            Intrinsics.checkNotNullParameter(shouldShowIntroCta, "shouldShowIntroCta");
            Intrinsics.checkNotNullParameter(showIntroCta, "showIntroCta");
            Intrinsics.checkNotNullParameter(showScreener, "showScreener");
            Intrinsics.checkNotNullParameter(showPresetCarousel, "showPresetCarousel");
            if (shouldShowIntroCta.get()) {
                shouldShowIntroCta.set(false);
                showIntroCta.invoke();
            } else if (screenerId != null) {
                showScreener.invoke(screenerId);
            } else {
                showPresetCarousel.invoke();
            }
        }
    }
}
