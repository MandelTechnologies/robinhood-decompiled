package com.robinhood.android.matcha.p177ui.reporting;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.matcha.p177ui.reporting.ReportCategoryFragment;
import com.robinhood.android.matcha.p177ui.reporting.ReportObjectTypeFragment;
import com.robinhood.android.matcha.p177ui.reporting.submit.ReportSubmitFragment;
import com.robinhood.android.models.matcha.api.ApiCreateAbuseReportRequest;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.social.contracts.CreateReportFragmentKey;
import com.robinhood.scarlet.ScarletManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: CreateReportParentFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0019B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016R/\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/reporting/CreateReportParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/matcha/ui/reporting/ReportObjectTypeFragment$Callbacks;", "Lcom/robinhood/android/matcha/ui/reporting/ReportCategoryFragment$Callbacks;", "Lcom/robinhood/android/matcha/ui/reporting/submit/ReportSubmitFragment$Callbacks;", "<init>", "()V", "<set-?>", "Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest$ObjectType;", "objectType", "getObjectType", "()Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest$ObjectType;", "setObjectType", "(Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest$ObjectType;)V", "objectType$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onObjectTypeSelected", "onReportCategorySelected", "reportCategory", "Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest$ReportCategory;", "onReportSubmitted", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CreateReportParentFragment extends BaseFragment implements ReportObjectTypeFragment.Callbacks, ReportCategoryFragment.Callbacks, ReportSubmitFragment.Callbacks {

    /* renamed from: objectType$delegate, reason: from kotlin metadata */
    private final Interfaces3 objectType;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CreateReportParentFragment.class, "objectType", "getObjectType()Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest$ObjectType;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CreateReportParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCreateAbuseReportRequest.ObjectType.values().length];
            try {
                iArr[ApiCreateAbuseReportRequest.ObjectType.PROFILE_PIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCreateAbuseReportRequest.ObjectType.USERNAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCreateAbuseReportRequest.ObjectType.MEMO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CreateReportParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.objectType = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, $$delegatedProperties[0]);
    }

    private final ApiCreateAbuseReportRequest.ObjectType getObjectType() {
        return (ApiCreateAbuseReportRequest.ObjectType) this.objectType.getValue(this, $$delegatedProperties[0]);
    }

    private final void setObjectType(ApiCreateAbuseReportRequest.ObjectType objectType) {
        this.objectType.setValue(this, $$delegatedProperties[0], objectType);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
        requireActivity().getWindow().setSoftInputMode(16);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            ReportObjectTypeFragment.Companion companion = ReportObjectTypeFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new ReportObjectTypeFragment.Args(((CreateReportFragmentKey) companion2.getArgs((Fragment) this)).getProfilePictureUrl() != null, ((CreateReportFragmentKey) companion2.getArgs((Fragment) this)).getMemoId() != null, ((CreateReportFragmentKey) companion2.getArgs((Fragment) this)).getUsername() != null)));
        }
    }

    @Override // com.robinhood.android.matcha.ui.reporting.ReportObjectTypeFragment.Callbacks
    public void onObjectTypeSelected(ApiCreateAbuseReportRequest.ObjectType objectType) {
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        setObjectType(objectType);
        replaceFragment(new ReportCategoryFragment());
    }

    @Override // com.robinhood.android.matcha.ui.reporting.ReportCategoryFragment.Callbacks
    public void onReportCategorySelected(ApiCreateAbuseReportRequest.ReportCategory reportCategory) {
        String profilePictureUrl;
        Intrinsics.checkNotNullParameter(reportCategory, "reportCategory");
        ApiCreateAbuseReportRequest.ObjectType objectType = getObjectType();
        if (objectType == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[objectType.ordinal()];
        if (i == 1) {
            profilePictureUrl = ((CreateReportFragmentKey) INSTANCE.getArgs((Fragment) this)).getProfilePictureUrl();
            Intrinsics.checkNotNull(profilePictureUrl);
        } else if (i == 2) {
            profilePictureUrl = ((CreateReportFragmentKey) INSTANCE.getArgs((Fragment) this)).getUsername();
            Intrinsics.checkNotNull(profilePictureUrl);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            profilePictureUrl = ((CreateReportFragmentKey) INSTANCE.getArgs((Fragment) this)).getMemoId();
            Intrinsics.checkNotNull(profilePictureUrl);
        }
        replaceFragment(ReportSubmitFragment.INSTANCE.newInstance((Parcelable) new ReportSubmitFragment.Args(((CreateReportFragmentKey) INSTANCE.getArgs((Fragment) this)).getUserId(), profilePictureUrl, objectType, reportCategory)));
    }

    @Override // com.robinhood.android.matcha.ui.reporting.submit.ReportSubmitFragment.Callbacks
    public void onReportSubmitted() {
        replaceFragment(new ReportSuccessFragment());
    }

    /* compiled from: CreateReportParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/reporting/CreateReportParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/reporting/CreateReportParentFragment;", "Lcom/robinhood/android/social/contracts/CreateReportFragmentKey;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<CreateReportParentFragment, CreateReportFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(CreateReportFragmentKey createReportFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, createReportFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CreateReportFragmentKey getArgs(CreateReportParentFragment createReportParentFragment) {
            return (CreateReportFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, createReportParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CreateReportParentFragment newInstance(CreateReportFragmentKey createReportFragmentKey) {
            return (CreateReportParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, createReportFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CreateReportParentFragment createReportParentFragment, CreateReportFragmentKey createReportFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, createReportParentFragment, createReportFragmentKey);
        }
    }
}
