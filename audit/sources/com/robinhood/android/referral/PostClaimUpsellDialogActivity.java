package com.robinhood.android.referral;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.ComponentActivity6;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.data.ReferralLaunchMode;
import com.robinhood.android.referral.PostClaimUpsellDialogActivity;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.utils.p409ui.activity.ActivityCompanion3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PostClaimUpsellDialogActivity.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\u000b²\u0006\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/referral/PostClaimUpsellDialogActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onEnterAnimationComplete", "Extras", "Companion", "feature-referral_externalDebug", "alertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class PostClaimUpsellDialogActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, C26659R.anim.activity_exit_down);
    }

    /* compiled from: PostClaimUpsellDialogActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.PostClaimUpsellDialogActivity$onEnterAnimationComplete$1 */
    static final class C266571 implements Function2<Composer, Integer, Unit> {
        C266571() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$4$lambda$3(PostClaimUpsellDialogActivity postClaimUpsellDialogActivity, SnapshotState snapshotState, GenericAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof GenericAction.Deeplink) {
                Navigator.DefaultImpls.handleDeepLink$default(postClaimUpsellDialogActivity.getNavigator(), postClaimUpsellDialogActivity, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
                postClaimUpsellDialogActivity.finish();
                return true;
            }
            if (action instanceof GenericAction.Dismiss) {
                postClaimUpsellDialogActivity.finish();
                return true;
            }
            if (!(action instanceof GenericAction.InfoAlert)) {
                throw new NoWhenBranchMatchedException();
            }
            snapshotState.setValue(((GenericAction.InfoAlert) action).getValue2().getAlert());
            return true;
        }

        /* compiled from: PostClaimUpsellDialogActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.referral.PostClaimUpsellDialogActivity$onEnterAnimationComplete$1$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $alertContent$delegate;
            final /* synthetic */ Function1<GenericAction, Boolean> $handleAction;
            final /* synthetic */ PostClaimUpsellDialogActivity this$0;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function1<? super GenericAction, Boolean> function1, PostClaimUpsellDialogActivity postClaimUpsellDialogActivity, SnapshotState<GenericAlertContent<GenericAction>> snapshotState) {
                this.$handleAction = function1;
                this.this$0 = postClaimUpsellDialogActivity;
                this.$alertContent$delegate = snapshotState;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1524035644, i, -1, "com.robinhood.android.referral.PostClaimUpsellDialogActivity.onEnterAnimationComplete.<anonymous>.<anonymous> (PostClaimUpsellDialogActivity.kt:50)");
                }
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                GenericAlertContent genericAlertContentInvoke$lambda$1 = C266571.invoke$lambda$1(this.$alertContent$delegate);
                PostClaimUpsellDialogActivity2 postClaimUpsellDialogActivity2 = new PostClaimUpsellDialogActivity2(this.$handleAction);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$handleAction);
                final Function1<GenericAction, Boolean> function1 = this.$handleAction;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.referral.PostClaimUpsellDialogActivity$onEnterAnimationComplete$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PostClaimUpsellDialogActivity.C266571.AnonymousClass1.invoke$lambda$1$lambda$0(function1, (String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1<? super String, Unit> function12 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.this$0);
                final PostClaimUpsellDialogActivity postClaimUpsellDialogActivity = this.this$0;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.referral.PostClaimUpsellDialogActivity$onEnterAnimationComplete$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostClaimUpsellDialogActivity.C266571.AnonymousClass1.invoke$lambda$3$lambda$2(postClaimUpsellDialogActivity);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                sduiAlert.Dialog(genericAlertContentInvoke$lambda$1, postClaimUpsellDialogActivity2, function12, (Function0) objRememberedValue2, composer, SduiAlert.$stable << 12, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(Function1 function1, String uri) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                function1.invoke(new GenericAction.Deeplink(new DeeplinkAction(uri)));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$2(PostClaimUpsellDialogActivity postClaimUpsellDialogActivity) {
                postClaimUpsellDialogActivity.finish();
                return Unit.INSTANCE;
            }
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2120028684, i, -1, "com.robinhood.android.referral.PostClaimUpsellDialogActivity.onEnterAnimationComplete.<anonymous> (PostClaimUpsellDialogActivity.kt:33)");
            }
            composer.startReplaceGroup(1849434622);
            PostClaimUpsellDialogActivity postClaimUpsellDialogActivity = PostClaimUpsellDialogActivity.this;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(((Extras) PostClaimUpsellDialogActivity.INSTANCE.getExtras((Activity) postClaimUpsellDialogActivity)).getUpsellAlertContent(), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(PostClaimUpsellDialogActivity.this);
            final PostClaimUpsellDialogActivity postClaimUpsellDialogActivity2 = PostClaimUpsellDialogActivity.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.referral.PostClaimUpsellDialogActivity$onEnterAnimationComplete$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(PostClaimUpsellDialogActivity.C266571.invoke$lambda$4$lambda$3(postClaimUpsellDialogActivity2, snapshotState, (GenericAction) obj));
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1524035644, true, new AnonymousClass1((Function1) objRememberedValue2, PostClaimUpsellDialogActivity.this, snapshotState), composer, 54), composer, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final GenericAlertContent<GenericAction> invoke$lambda$1(SnapshotState<GenericAlertContent<GenericAction>> snapshotState) {
            return snapshotState.getValue();
        }
    }

    @Override // android.app.Activity
    public void onEnterAnimationComplete() {
        ComponentActivity6.setContent$default(this, null, ComposableLambda3.composableLambdaInstance(2120028684, true, new C266571()), 1, null);
    }

    /* compiled from: PostClaimUpsellDialogActivity.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/referral/PostClaimUpsellDialogActivity$Extras;", "Landroid/os/Parcelable;", "launchMode", "Lcom/robinhood/android/navigation/app/keys/data/ReferralLaunchMode;", "upsellAlertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/data/ReferralLaunchMode;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getLaunchMode", "()Lcom/robinhood/android/navigation/app/keys/data/ReferralLaunchMode;", "getUpsellAlertContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Extras implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        private final ReferralLaunchMode launchMode;
        private final GenericAlertContent<GenericAction> upsellAlertContent;

        /* compiled from: PostClaimUpsellDialogActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Extras((ReferralLaunchMode) parcel.readParcelable(Extras.class.getClassLoader()), (GenericAlertContent) parcel.readParcelable(Extras.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Extras copy$default(Extras extras, ReferralLaunchMode referralLaunchMode, GenericAlertContent genericAlertContent, int i, Object obj) {
            if ((i & 1) != 0) {
                referralLaunchMode = extras.launchMode;
            }
            if ((i & 2) != 0) {
                genericAlertContent = extras.upsellAlertContent;
            }
            return extras.copy(referralLaunchMode, genericAlertContent);
        }

        /* renamed from: component1, reason: from getter */
        public final ReferralLaunchMode getLaunchMode() {
            return this.launchMode;
        }

        public final GenericAlertContent<GenericAction> component2() {
            return this.upsellAlertContent;
        }

        public final Extras copy(ReferralLaunchMode launchMode, GenericAlertContent<? extends GenericAction> upsellAlertContent) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            Intrinsics.checkNotNullParameter(upsellAlertContent, "upsellAlertContent");
            return new Extras(launchMode, upsellAlertContent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Extras)) {
                return false;
            }
            Extras extras = (Extras) other;
            return Intrinsics.areEqual(this.launchMode, extras.launchMode) && Intrinsics.areEqual(this.upsellAlertContent, extras.upsellAlertContent);
        }

        public int hashCode() {
            return (this.launchMode.hashCode() * 31) + this.upsellAlertContent.hashCode();
        }

        public String toString() {
            return "Extras(launchMode=" + this.launchMode + ", upsellAlertContent=" + this.upsellAlertContent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.launchMode, flags);
            dest.writeParcelable(this.upsellAlertContent, flags);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Extras(ReferralLaunchMode launchMode, GenericAlertContent<? extends GenericAction> upsellAlertContent) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            Intrinsics.checkNotNullParameter(upsellAlertContent, "upsellAlertContent");
            this.launchMode = launchMode;
            this.upsellAlertContent = upsellAlertContent;
        }

        public final ReferralLaunchMode getLaunchMode() {
            return this.launchMode;
        }

        public final GenericAlertContent<GenericAction> getUpsellAlertContent() {
            return this.upsellAlertContent;
        }
    }

    /* compiled from: PostClaimUpsellDialogActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/PostClaimUpsellDialogActivity$Companion;", "Lcom/robinhood/utils/ui/activity/ActivityWithExtrasCompanion;", "Lcom/robinhood/android/referral/PostClaimUpsellDialogActivity;", "Lcom/robinhood/android/referral/PostClaimUpsellDialogActivity$Extras;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements ActivityCompanion3<PostClaimUpsellDialogActivity, Extras> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public Extras getExtras(PostClaimUpsellDialogActivity postClaimUpsellDialogActivity) {
            return (Extras) ActivityCompanion3.DefaultImpls.getExtras(this, postClaimUpsellDialogActivity);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, Extras extras) {
            return ActivityCompanion3.DefaultImpls.getIntentWithExtras(this, context, extras);
        }
    }
}
