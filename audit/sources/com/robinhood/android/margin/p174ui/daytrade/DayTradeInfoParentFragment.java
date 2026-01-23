package com.robinhood.android.margin.p174ui.daytrade;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.margin.model.UiDayTradeInfo;
import com.robinhood.android.margin.p174ui.daytrade.DayTradeInfoIntroFragment;
import com.robinhood.android.margin.p174ui.daytrade.DayTradeInfoParentFragment;
import com.robinhood.android.margin.p174ui.daytrade.DayTradeInfoStepsFragment;
import com.robinhood.feature.lib.daytrade.util.SeenDayTradeInfoPref;
import com.robinhood.models.p320db.MarginSetting;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DayTradeInfoParentFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u001e\u001f B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoIntroFragment$Callbacks;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsFragment$Callbacks;", "<init>", "()V", "seenDayTradeInfoPref", "Lcom/robinhood/prefs/BooleanPreference;", "getSeenDayTradeInfoPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setSeenDayTradeInfoPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "callbacks", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoParentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoParentFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "onStartTutorial", "onSkipPressed", "stage", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStage;", "onCompleteSteps", "proceedToFinalStage", "Callbacks", "Args", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DayTradeInfoParentFragment extends BaseFragment implements DayTradeInfoIntroFragment.Callbacks, DayTradeInfoStepsFragment.Callbacks {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    @SeenDayTradeInfoPref
    public BooleanPreference seenDayTradeInfoPref;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DayTradeInfoParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoParentFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DayTradeInfoParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoParentFragment$Callbacks;", "", "onCompleteTutorial", "", "onAbortTutorial", "marginSetting", "Lcom/robinhood/models/db/MarginSetting;", "getMarginSetting", "()Lcom/robinhood/models/db/MarginSetting;", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        MarginSetting getMarginSetting();

        void onAbortTutorial();

        void onCompleteTutorial();
    }

    /* compiled from: DayTradeInfoParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayTradeInfoStage.values().length];
            try {
                iArr[DayTradeInfoStage.INTRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayTradeInfoStage.TUTORIAL_STEPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DayTradeInfoStage.RECOMMEND_PROTECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DayTradeInfoStage.PROTECTION_ENABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DayTradeInfoParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoParentFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DayTradeInfoParentFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    public final BooleanPreference getSeenDayTradeInfoPref() {
        BooleanPreference booleanPreference = this.seenDayTradeInfoPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("seenDayTradeInfoPref");
        return null;
    }

    public final void setSeenDayTradeInfoPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.seenDayTradeInfoPref = booleanPreference;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, DayTradeInfoIntroFragment.INSTANCE.newInstance((Parcelable) ((Args) INSTANCE.getArgs((Fragment) this)).getDayTradeInfo()));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getCurrentFragment() instanceof DayTradeInfoIntroFragment) {
            getCallbacks().onAbortTutorial();
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.margin.ui.daytrade.DayTradeInfoIntroFragment.Callbacks
    public void onStartTutorial() {
        DayTradeInfoStepsFragment.Companion companion = DayTradeInfoStepsFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new DayTradeInfoStepsFragment.Args(((Args) companion2.getArgs((Fragment) this)).getDayTradeInfo(), DayTradeInfoStage.TUTORIAL_STEPS, ((Args) companion2.getArgs((Fragment) this)).getAccountNumber())));
    }

    @Override // com.robinhood.android.margin.ui.daytrade.DayTradeInfoIntroFragment.Callbacks, com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment.Callbacks
    public void onSkipPressed(DayTradeInfoStage stage) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        int i = WhenMappings.$EnumSwitchMapping$0[stage.ordinal()];
        if (i == 1 || i == 2) {
            proceedToFinalStage();
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().onCompleteTutorial();
        }
    }

    @Override // com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment.Callbacks
    public void onCompleteSteps(DayTradeInfoStage stage) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        int i = WhenMappings.$EnumSwitchMapping$0[stage.ordinal()];
        if (i == 1) {
            onStartTutorial();
            return;
        }
        if (i == 2) {
            proceedToFinalStage();
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().onCompleteTutorial();
        }
    }

    private final void proceedToFinalStage() {
        DayTradeInfoStage dayTradeInfoStage;
        MarginSetting marginSetting;
        getSeenDayTradeInfoPref().set(true);
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getIsForced() || ((marginSetting = getCallbacks().getMarginSetting()) != null && marginSetting.getAllowsPdt())) {
            dayTradeInfoStage = DayTradeInfoStage.RECOMMEND_PROTECTION;
        } else {
            dayTradeInfoStage = DayTradeInfoStage.PROTECTION_ENABLED;
        }
        replaceFragment(DayTradeInfoStepsFragment.INSTANCE.newInstance((Parcelable) new DayTradeInfoStepsFragment.Args(((Args) companion.getArgs((Fragment) this)).getDayTradeInfo(), dayTradeInfoStage, ((Args) companion.getArgs((Fragment) this)).getAccountNumber())));
    }

    /* compiled from: DayTradeInfoParentFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoParentFragment$Args;", "Landroid/os/Parcelable;", "dayTradeInfo", "Lcom/robinhood/android/margin/model/UiDayTradeInfo;", "isForced", "", "accountNumber", "", "<init>", "(Lcom/robinhood/android/margin/model/UiDayTradeInfo;ZLjava/lang/String;)V", "getDayTradeInfo", "()Lcom/robinhood/android/margin/model/UiDayTradeInfo;", "()Z", "getAccountNumber", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final UiDayTradeInfo dayTradeInfo;
        private final boolean isForced;

        /* compiled from: DayTradeInfoParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(UiDayTradeInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString());
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
            this.dayTradeInfo.writeToParcel(dest, flags);
            dest.writeInt(this.isForced ? 1 : 0);
            dest.writeString(this.accountNumber);
        }

        public Args(UiDayTradeInfo dayTradeInfo, boolean z, String str) {
            Intrinsics.checkNotNullParameter(dayTradeInfo, "dayTradeInfo");
            this.dayTradeInfo = dayTradeInfo;
            this.isForced = z;
            this.accountNumber = str;
        }

        public final UiDayTradeInfo getDayTradeInfo() {
            return this.dayTradeInfo;
        }

        /* renamed from: isForced, reason: from getter */
        public final boolean getIsForced() {
            return this.isForced;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: DayTradeInfoParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoParentFragment;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoParentFragment$Args;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DayTradeInfoParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DayTradeInfoParentFragment dayTradeInfoParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, dayTradeInfoParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DayTradeInfoParentFragment newInstance(Args args) {
            return (DayTradeInfoParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DayTradeInfoParentFragment dayTradeInfoParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, dayTradeInfoParentFragment, args);
        }
    }
}
