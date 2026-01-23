package com.robinhood.android.doc.achrelationship.p108ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.ach.contracts.AchRelationshipDocumentVerification;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.doc.achrelationship.C14255R;
import com.robinhood.android.doc.achrelationship.databinding.ActivityAchRelationshipDocumentVerificationPromptBinding;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.DocumentUpload;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AchRelationshipDocumentVerificationPromptActivity.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\"\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001e\u001a\u00020\rH\u0002J\u001a\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/doc/achrelationship/ui/AchRelationshipDocumentVerificationPromptActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "binding", "Lcom/robinhood/android/doc/achrelationship/databinding/ActivityAchRelationshipDocumentVerificationPromptBinding;", "getBinding", "()Lcom/robinhood/android/doc/achrelationship/databinding/ActivityAchRelationshipDocumentVerificationPromptBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "shouldPromptForLockscreen", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "screenSource", "", "getScreenSource", "()Ljava/lang/String;", "launchDocumentUpload", "onPositiveButtonClicked", "id", "passthroughArgs", "Companion", "feature-doc-upload-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AchRelationshipDocumentVerificationPromptActivity extends BaseActivity {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AchRelationshipDocumentVerificationPromptActivity.class, "binding", "getBinding()Lcom/robinhood/android/doc/achrelationship/databinding/ActivityAchRelationshipDocumentVerificationPromptBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int REQUEST_ID_UPLOAD = 0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    public AchRelationshipDocumentVerificationPromptActivity() {
        super(C14255R.layout.activity_ach_relationship_document_verification_prompt);
        this.binding = ViewBinding5.viewBinding(this, AchRelationshipDocumentVerificationPromptActivity2.INSTANCE);
    }

    private final ActivityAchRelationshipDocumentVerificationPromptBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityAchRelationshipDocumentVerificationPromptBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return ((AchRelationshipDocumentVerification) INSTANCE.getExtras((Activity) this)).getShouldPromptForLockscreen();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        LottieUrl lottieUrl;
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        if (((AchRelationshipDocumentVerification) companion.getExtras((Activity) this)).getTheme() == ColorTheme.DARK) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        ActivityAchRelationshipDocumentVerificationPromptBinding binding = getBinding();
        ConstraintLayout achRelationshipDocumentVerificationPromptRoot = binding.achRelationshipDocumentVerificationPromptRoot;
        Intrinsics.checkNotNullExpressionValue(achRelationshipDocumentVerificationPromptRoot, "achRelationshipDocumentVerificationPromptRoot");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(achRelationshipDocumentVerificationPromptRoot, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        binding.subtitle.setText(getString(C14255R.string.iav_verification_prompt_subheader));
        boolean z = ((AchRelationshipDocumentVerification) companion.getExtras((Activity) this)).getTheme() != ColorTheme.DEFAULT;
        ImageView iavVerificationImage = getBinding().iavVerificationImage;
        Intrinsics.checkNotNullExpressionValue(iavVerificationImage, "iavVerificationImage");
        iavVerificationImage.setVisibility(!z ? 0 : 8);
        LottieAnimationView iavVerificationAnimation = getBinding().iavVerificationAnimation;
        Intrinsics.checkNotNullExpressionValue(iavVerificationAnimation, "iavVerificationAnimation");
        iavVerificationAnimation.setVisibility(z ? 0 : 8);
        if (z) {
            LottieAnimationView iavVerificationAnimation2 = getBinding().iavVerificationAnimation;
            Intrinsics.checkNotNullExpressionValue(iavVerificationAnimation2, "iavVerificationAnimation");
            if (DayNightChanges.isDay(ScarletManager2.getScarletManager(this))) {
                lottieUrl = LottieUrl.BRAND_REFRESH_BANK_VERIFY_LIGHT;
            } else {
                lottieUrl = LottieUrl.BRAND_REFRESH_BANK_VERIFY_DARK;
            }
            LottieAnimationViewsKt.setRemoteUrl(iavVerificationAnimation2, lottieUrl);
            RdsButton uploadStatementButton = getBinding().uploadStatementButton;
            Intrinsics.checkNotNullExpressionValue(uploadStatementButton, "uploadStatementButton");
            ResourceType.STYLE style = ResourceType.STYLE.INSTANCE;
            ScarletManager2.overrideStyle$default(uploadStatementButton, new ThemedResourceReference(style, C20690R.attr.primaryMonochromeButtonStyle), false, 2, null);
            RdsButton skipButton = getBinding().skipButton;
            Intrinsics.checkNotNullExpressionValue(skipButton, "skipButton");
            ScarletManager2.overrideStyle$default(skipButton, new ThemedResourceReference(style, C20690R.attr.secondaryMonochromeButtonStyle), false, 2, null);
        }
        RdsButton skipButton2 = binding.skipButton;
        Intrinsics.checkNotNullExpressionValue(skipButton2, "skipButton");
        OnClickListeners.onClick(skipButton2, new Function0() { // from class: com.robinhood.android.doc.achrelationship.ui.AchRelationshipDocumentVerificationPromptActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AchRelationshipDocumentVerificationPromptActivity.onCreate$lambda$1$lambda$0(this.f$0);
            }
        });
        RdsButton uploadStatementButton2 = binding.uploadStatementButton;
        Intrinsics.checkNotNullExpressionValue(uploadStatementButton2, "uploadStatementButton");
        OnClickListeners.onClick(uploadStatementButton2, new AchRelationshipDocumentVerificationPromptActivity3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$lambda$0(AchRelationshipDocumentVerificationPromptActivity achRelationshipDocumentVerificationPromptActivity) {
        achRelationshipDocumentVerificationPromptActivity.setResult(0);
        achRelationshipDocumentVerificationPromptActivity.finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(0);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0 && resultCode == -1) {
            setResult(-1);
            finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return ((AchRelationshipDocumentVerification) INSTANCE.getExtras((Activity) this)).getSource().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchDocumentUpload() {
        DocumentRequest.Companion companion = DocumentRequest.INSTANCE;
        Companion companion2 = INSTANCE;
        startActivityForResult(Navigator.DefaultImpls.createIntent$default(getNavigator(), this, DocumentUpload.Companion.singleDocStandaloneActivityIntent$default(DocumentUpload.INSTANCE, DocumentRequest.Companion.complianceDoc$default(companion, ((AchRelationshipDocumentVerification) companion2.getExtras((Activity) this)).getId(), ((AchRelationshipDocumentVerification) companion2.getExtras((Activity) this)).getType(), null, 4, null), false, null, shouldPromptForLockscreen(), null, 22, null), null, false, 12, null), 0);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C9631R.id.dialog_id_iav_document_verification_prompt_error) {
            setResult(0);
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* compiled from: AchRelationshipDocumentVerificationPromptActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/achrelationship/ui/AchRelationshipDocumentVerificationPromptActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/doc/achrelationship/ui/AchRelationshipDocumentVerificationPromptActivity;", "Lcom/robinhood/android/ach/contracts/AchRelationshipDocumentVerification;", "<init>", "()V", "REQUEST_ID_UPLOAD", "", "feature-doc-upload-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<AchRelationshipDocumentVerificationPromptActivity, AchRelationshipDocumentVerification> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public AchRelationshipDocumentVerification getExtras(AchRelationshipDocumentVerificationPromptActivity achRelationshipDocumentVerificationPromptActivity) {
            return (AchRelationshipDocumentVerification) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, achRelationshipDocumentVerificationPromptActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, AchRelationshipDocumentVerification achRelationshipDocumentVerification) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, achRelationshipDocumentVerification);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, AchRelationshipDocumentVerification achRelationshipDocumentVerification) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, achRelationshipDocumentVerification);
        }
    }
}
