package com.robinhood.android.securitycenter.p251ui.data.personal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.databinding.FragmentPersonalDataDownloadBinding;
import com.robinhood.android.securitycenter.p251ui.data.personal.PersonalDataDownloadViewState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.UiPersonalDataRequestDetailsItem;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.lib.challenge.ChallengeResponseResult;
import com.robinhood.shared.lib.challenge.ChallengeResponseResultContract;
import com.robinhood.shared.security.contracts.ChallengeResponseIntentKey;
import com.robinhood.shared.security.contracts.ChallengeSource;
import com.robinhood.utils.extensions.Files;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: PersonalDataDownloadFragment.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 02\u00020\u0001:\u0002/0B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0014\u0010\"\u001a\u00020\u001c2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*H\u0002J\u001a\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010!H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0019 \u001a*\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "binding", "Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataDownloadBinding;", "getBinding", "()Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataDownloadBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadDuxo;", "getDuxo", "()Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "challengeResponseLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/shared/security/contracts/ChallengeResponseIntentKey;", "kotlin.jvm.PlatformType", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "downloadPersonalData", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "bind", "state", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState;", "setLoading", "loading", "", "onPositiveButtonClicked", "id", "", "passthroughArgs", "Args", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class PersonalDataDownloadFragment extends BaseFragment {
    private static final String TAG_DOWNLOAD_ERROR_DIALOG = "downloadErrorDialog";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ChallengeResponseIntentKey>> challengeResponseLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PersonalDataDownloadFragment.class, "binding", "getBinding()Lcom/robinhood/android/securitycenter/databinding/FragmentPersonalDataDownloadBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public PersonalDataDownloadFragment() {
        super(C28186R.layout.fragment_personal_data_download);
        this.binding = ViewBinding5.viewBinding(this, PersonalDataDownloadFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, PersonalDataDownloadDuxo.class);
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ChallengeResponseIntentKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ChallengeResponseResultContract(new Function0() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDownloadFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDownloadFragment$challengeResponseLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ChallengeResponseResult challengeResponseResult) {
                if ((challengeResponseResult != null ? challengeResponseResult.getChallengeId() : null) != null) {
                    this.this$0.downloadPersonalData(challengeResponseResult.getChallengeId());
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.challengeResponseLauncher = activityResultLauncherRegisterForActivityResult;
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

    private final FragmentPersonalDataDownloadBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPersonalDataDownloadBinding) value;
    }

    private final PersonalDataDownloadDuxo getDuxo() {
        return (PersonalDataDownloadDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C282231(this));
    }

    /* compiled from: PersonalDataDownloadFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDownloadFragment$onStart$1 */
    /* synthetic */ class C282231 extends FunctionReferenceImpl implements Function1<PersonalDataDownloadViewState, Unit> {
        C282231(Object obj) {
            super(1, obj, PersonalDataDownloadFragment.class, "bind", "bind(Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PersonalDataDownloadViewState personalDataDownloadViewState) {
            invoke2(personalDataDownloadViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PersonalDataDownloadViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PersonalDataDownloadFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        PersonalDataRequestDetailsListAdapter personalDataRequestDetailsListAdapter = new PersonalDataRequestDetailsListAdapter(getEventLogger(), new Screen(Screen.Name.IRR_DOWNLOAD, null, null, null, 14, null));
        FragmentPersonalDataDownloadBinding binding = getBinding();
        binding.personalDataDownloadDetailsList.setAdapter(personalDataRequestDetailsListAdapter);
        RdsButton personalDataDownloadCta = binding.personalDataDownloadCta;
        Intrinsics.checkNotNullExpressionValue(personalDataDownloadCta, "personalDataDownloadCta");
        OnClickListeners.onClick(personalDataDownloadCta, new PersonalDataDownloadFragment4(this));
        RhTextView rhTextView = binding.personalDataDownloadSubtitle;
        int i = C28186R.string.personal_data_download_subtitle;
        Companion companion = INSTANCE;
        String string2 = getString(i, ((Args) companion.getArgs((Fragment) this)).getExpireDate());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        rhTextView.setText(HtmlCompat.fromHtml$default(string2, 0, 2, null));
        RhTextView rhTextView2 = binding.personalDataDownloadFooter;
        String string3 = getString(C28186R.string.personal_data_download_expiration_footer, ((Args) companion.getArgs((Fragment) this)).getExpireDate());
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        rhTextView2.setText(HtmlCompat.fromHtml$default(string3, 0, 2, null));
        personalDataRequestDetailsListAdapter.submitList(((Args) companion.getArgs((Fragment) this)).getDetails());
    }

    static /* synthetic */ void downloadPersonalData$default(PersonalDataDownloadFragment personalDataDownloadFragment, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = null;
        }
        personalDataDownloadFragment.downloadPersonalData(uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadPersonalData(UUID challengeId) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, new Screen(Screen.Name.IRR_DOWNLOAD, null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, null, false, 57, null);
        getDuxo().fetchDownloadFiles(((Args) INSTANCE.getArgs((Fragment) this)).getRequestId(), challengeId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(PersonalDataDownloadViewState state) {
        if (Intrinsics.areEqual(state, PersonalDataDownloadViewState.Loading.INSTANCE)) {
            setLoading(true);
            return;
        }
        if (state instanceof PersonalDataDownloadViewState.ChallengeReceived) {
            NavigationActivityResultContract3.launch$default(this.challengeResponseLauncher, new ChallengeResponseIntentKey(ChallengeSource.PERSONAL_DATA_DOWNLOAD, ((PersonalDataDownloadViewState.ChallengeReceived) state).getChallenge(), null, 4, null), null, false, 6, null);
            return;
        }
        if (state instanceof PersonalDataDownloadViewState.Success) {
            File fileConsume = ((PersonalDataDownloadViewState.Success) state).getFileEvent().consume();
            if (fileConsume != null) {
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                Intent openOrShareIntent = Files.getOpenOrShareIntent(fileConsume, fragmentActivityRequireActivity, C11048R.string.general_share_chooser_title, "application/zip");
                Intrinsics.checkNotNull(openOrShareIntent);
                startActivity(openOrShareIntent);
                setLoading(false);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(state, PersonalDataDownloadViewState.Error.INSTANCE)) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setId(C28186R.id.dialog_id_personal_data_error).setTitle(C28186R.string.personal_data_error_dialog_title, new Object[0]).setMessage(C28186R.string.personal_data_error_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, TAG_DOWNLOAD_ERROR_DIALOG, false, 4, null);
            setLoading(false);
        }
    }

    private final void setLoading(boolean loading) {
        getBinding().personalDataDownloadCta.setLoading(loading);
        requireBaseActivity().showProgressBar(loading);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C28186R.id.dialog_id_personal_data_error) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, new Screen(Screen.Name.IRR_DOWNLOAD, null, null, null, 14, null), new Component(Component.ComponentType.DONE_BUTTON, null, null, 6, null), null, null, false, 57, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* compiled from: PersonalDataDownloadFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadFragment$Args;", "Landroid/os/Parcelable;", ErrorBundle.DETAIL_ENTRY, "", "Lcom/robinhood/models/ui/UiPersonalDataRequestDetailsItem;", "requestId", "Ljava/util/UUID;", "expireDate", "", "<init>", "(Ljava/util/List;Ljava/util/UUID;Ljava/lang/String;)V", "getDetails", "()Ljava/util/List;", "getRequestId", "()Ljava/util/UUID;", "getExpireDate", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<UiPersonalDataRequestDetailsItem> details;
        private final String expireDate;
        private final UUID requestId;

        /* compiled from: PersonalDataDownloadFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(arrayList, (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, List list, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = args.details;
            }
            if ((i & 2) != 0) {
                uuid = args.requestId;
            }
            if ((i & 4) != 0) {
                str = args.expireDate;
            }
            return args.copy(list, uuid, str);
        }

        public final List<UiPersonalDataRequestDetailsItem> component1() {
            return this.details;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getRequestId() {
            return this.requestId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getExpireDate() {
            return this.expireDate;
        }

        public final Args copy(List<UiPersonalDataRequestDetailsItem> details, UUID requestId, String expireDate) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(expireDate, "expireDate");
            return new Args(details, requestId, expireDate);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.details, args.details) && Intrinsics.areEqual(this.requestId, args.requestId) && Intrinsics.areEqual(this.expireDate, args.expireDate);
        }

        public int hashCode() {
            return (((this.details.hashCode() * 31) + this.requestId.hashCode()) * 31) + this.expireDate.hashCode();
        }

        public String toString() {
            return "Args(details=" + this.details + ", requestId=" + this.requestId + ", expireDate=" + this.expireDate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<UiPersonalDataRequestDetailsItem> list = this.details;
            dest.writeInt(list.size());
            Iterator<UiPersonalDataRequestDetailsItem> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeSerializable(this.requestId);
            dest.writeString(this.expireDate);
        }

        public Args(List<UiPersonalDataRequestDetailsItem> details, UUID requestId, String expireDate) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(expireDate, "expireDate");
            this.details = details;
            this.requestId = requestId;
            this.expireDate = expireDate;
        }

        public final List<UiPersonalDataRequestDetailsItem> getDetails() {
            return this.details;
        }

        public final UUID getRequestId() {
            return this.requestId;
        }

        public final String getExpireDate() {
            return this.expireDate;
        }
    }

    /* compiled from: PersonalDataDownloadFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadFragment;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadFragment$Args;", "<init>", "()V", "TAG_DOWNLOAD_ERROR_DIALOG", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PersonalDataDownloadFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PersonalDataDownloadFragment personalDataDownloadFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, personalDataDownloadFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PersonalDataDownloadFragment newInstance(Args args) {
            return (PersonalDataDownloadFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PersonalDataDownloadFragment personalDataDownloadFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, personalDataDownloadFragment, args);
        }
    }
}
