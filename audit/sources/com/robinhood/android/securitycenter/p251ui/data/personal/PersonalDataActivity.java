package com.robinhood.android.securitycenter.p251ui.data.personal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.p251ui.data.personal.PersonalDataDownloadFragment;
import com.robinhood.android.securitycenter.p251ui.data.personal.PersonalDataPendingRequestFragment;
import com.robinhood.android.securitycenter.p251ui.data.personal.PersonalDataRequestConfirmationFragment;
import com.robinhood.android.securitycenter.p251ui.data.personal.PersonalDataRequestFragment;
import com.robinhood.android.securitycenter.p251ui.data.personal.PersonalDataViewState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.security.contracts.PersonalDataIntentKey;
import com.robinhood.shared.security.contracts.PersonalDataRequestType;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PersonalDataActivity.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001fH\u0002J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0016J\n\u0010&\u001a\u00020'*\u00020\u0007J\b\u0010(\u001a\u00020\u0018H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "requestType", "Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;", "getRequestType", "()Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;", "requestType$delegate", "Lkotlin/Lazy;", "duxo", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDuxo;", "getDuxo", "()Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDuxo;", "duxo$delegate", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "bind", "state", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState;", "bindSuccessState", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState$Success;", "bindAccessSuccessState", "bindDeleteSuccessState", "showError", "onDialogDismissed", "id", "", "toScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "onSubmitRequestSuccess", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class PersonalDataActivity extends BaseActivity implements PersonalDataRequestFragment.Callbacks, RhDialogFragment.OnDismissListener {
    private static final String EXTRA_REQUEST_TYPE = "personalDataRequestType";
    private static final String TAG_LOAD_ERROR_DIALOG = "loadError";

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;

    /* renamed from: requestType$delegate, reason: from kotlin metadata */
    private final Lazy requestType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PersonalDataActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PersonalDataRequestType.values().length];
            try {
                iArr[PersonalDataRequestType.ACCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PersonalDataRequestType.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PersonalDataViewState.Success.Status.values().length];
            try {
                iArr2[PersonalDataViewState.Success.Status.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PersonalDataViewState.Success.Status.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PersonalDataViewState.Success.Status.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PersonalDataViewState.Success.Status.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public PersonalDataActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.requestType = Activity.intentExtra(this, EXTRA_REQUEST_TYPE);
        this.duxo = OldDuxos.oldDuxo(this, PersonalDataDuxo.class);
    }

    private final PersonalDataRequestType getRequestType() {
        return (PersonalDataRequestType) this.requestType.getValue();
    }

    private final PersonalDataDuxo getDuxo() {
        return (PersonalDataDuxo) this.duxo.getValue();
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

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDuxo().refresh(getRequestType());
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C282161(this));
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, PersonalDataLoadingFragment.INSTANCE.newInstance());
        }
    }

    /* compiled from: PersonalDataActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataActivity$onCreate$1 */
    /* synthetic */ class C282161 extends FunctionReferenceImpl implements Function1<PersonalDataViewState, Unit> {
        C282161(Object obj) {
            super(1, obj, PersonalDataActivity.class, "bind", "bind(Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PersonalDataViewState personalDataViewState) {
            invoke2(personalDataViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PersonalDataViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PersonalDataActivity) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(PersonalDataViewState state) {
        if (state instanceof PersonalDataViewState.Success) {
            bindSuccessState((PersonalDataViewState.Success) state);
        } else if (Intrinsics.areEqual(state, PersonalDataViewState.Error.INSTANCE)) {
            showError();
        } else if (!Intrinsics.areEqual(state, PersonalDataViewState.Loading.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void bindSuccessState(PersonalDataViewState.Success state) {
        int i = WhenMappings.$EnumSwitchMapping$0[getRequestType().ordinal()];
        if (i == 1) {
            bindAccessSuccessState(state);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bindDeleteSuccessState(state);
        }
    }

    private final void bindAccessSuccessState(PersonalDataViewState.Success state) {
        int i = WhenMappings.$EnumSwitchMapping$1[state.getStatus().ordinal()];
        if (i == 1 || i == 2) {
            setFragment(C11048R.id.fragment_container, PersonalDataRequestFragment.INSTANCE.newInstance((Parcelable) new PersonalDataRequestFragment.Args(getRequestType(), state.getDetails())));
            return;
        }
        if (i == 3) {
            String requestDateString = state.getRequestDateString();
            if (requestDateString == null) {
                showError();
                return;
            } else {
                setFragment(C11048R.id.fragment_container, PersonalDataPendingRequestFragment.INSTANCE.newInstance((Parcelable) new PersonalDataPendingRequestFragment.Args(getRequestType(), requestDateString)));
                return;
            }
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String expireDateString = state.getExpireDateString();
        if (state.getRequestId() == null || expireDateString == null) {
            showError();
        } else {
            setFragment(C11048R.id.fragment_container, PersonalDataDownloadFragment.INSTANCE.newInstance((Parcelable) new PersonalDataDownloadFragment.Args(state.getDetails(), state.getRequestId(), expireDateString)));
        }
    }

    private final void bindDeleteSuccessState(PersonalDataViewState.Success state) {
        int i = WhenMappings.$EnumSwitchMapping$1[state.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(state.getStatus());
                throw new ExceptionsH();
            }
            if (i == 3) {
                String requestDateString = state.getRequestDateString();
                if (requestDateString == null) {
                    showError();
                    return;
                } else {
                    setFragment(C11048R.id.fragment_container, PersonalDataPendingRequestFragment.INSTANCE.newInstance((Parcelable) new PersonalDataPendingRequestFragment.Args(getRequestType(), requestDateString)));
                    return;
                }
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        setFragment(C11048R.id.fragment_container, PersonalDataRequestFragment.INSTANCE.newInstance((Parcelable) new PersonalDataRequestFragment.Args(getRequestType(), state.getDetails())));
    }

    private final void showError() {
        RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(this).setUseDesignSystemOverlay(true).setId(C28186R.id.dialog_id_personal_data_error).setTitle(C28186R.string.personal_data_error_dialog_title, new Object[0]).setMessage(C28186R.string.personal_data_error_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, TAG_LOAD_ERROR_DIALOG, false, 4, null);
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C28186R.id.dialog_id_personal_data_error) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, new Screen(toScreenName(getRequestType()), null, null, null, 14, null), new Component(Component.ComponentType.DONE_BUTTON, null, null, 6, null), null, null, false, 57, null);
            finish();
        }
    }

    public final Screen.Name toScreenName(PersonalDataRequestType personalDataRequestType) {
        Intrinsics.checkNotNullParameter(personalDataRequestType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[personalDataRequestType.ordinal()];
        if (i == 1) {
            return Screen.Name.IRR_REQUEST;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Screen.Name.IRR_DELETE;
    }

    @Override // com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestFragment.Callbacks
    public void onSubmitRequestSuccess() {
        replaceFragment(PersonalDataRequestConfirmationFragment.INSTANCE.newInstance((Parcelable) new PersonalDataRequestConfirmationFragment.Args(getRequestType())));
    }

    /* compiled from: PersonalDataActivity.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/shared/security/contracts/PersonalDataIntentKey;", "<init>", "()V", "EXTRA_REQUEST_TYPE", "", "TAG_LOAD_ERROR_DIALOG", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<PersonalDataIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, PersonalDataIntentKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intentPutExtra = new Intent(context, (Class<?>) PersonalDataActivity.class).putExtra(PersonalDataActivity.EXTRA_REQUEST_TYPE, key.getRequestType());
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }
}
