package com.robinhood.android.onboarding.p205ui.generic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.odyssey.lib.BaseSdActivity;
import com.robinhood.android.onboarding.contracts.GenericSdFlowIntentKey;
import com.robinhood.librobinhood.data.store.identi.ServerDrivenStore;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GenericSdFlowActivity.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/generic/GenericSdFlowActivity;", "Lcom/robinhood/android/odyssey/lib/BaseSdActivity;", "<init>", "()V", "odysseyFlowConfiguration", "Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "getOdysseyFlowConfiguration", "()Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "exitDeeplinkOverride", "Landroid/net/Uri;", "getExitDeeplinkOverride", "()Landroid/net/Uri;", "useAchromaticTheme", "", "getUseAchromaticTheme", "()Z", "forceDarkTheme", "getForceDarkTheme", "entryPointIdentifier", "", "getEntryPointIdentifier", "()Ljava/lang/String;", "requiresAuthentication", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GenericSdFlowActivity extends BaseSdActivity {
    private final boolean useAchromaticTheme = true;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseSdActivity.$stable;

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public ServerDrivenStore.FlowConfiguration getOdysseyFlowConfiguration() {
        Companion companion = INSTANCE;
        return new ServerDrivenStore.FlowConfiguration(((GenericSdFlowIntentKey) companion.getExtras((Activity) this)).getFlowPath(), ((GenericSdFlowIntentKey) companion.getExtras((Activity) this)).getIsWorkflow(), ((GenericSdFlowIntentKey) companion.getExtras((Activity) this)).getQueryParameters(), null, ((GenericSdFlowIntentKey) companion.getExtras((Activity) this)).getOdysseyVersion(), ((GenericSdFlowIntentKey) companion.getExtras((Activity) this)).getDeeplinkCompletionCheckpoint(), 8, null);
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public Uri getExitDeeplinkOverride() {
        return ((GenericSdFlowIntentKey) INSTANCE.getExtras((Activity) this)).getExitDeeplinkOverride();
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public boolean getUseAchromaticTheme() {
        return this.useAchromaticTheme;
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public boolean getForceDarkTheme() {
        Boolean forceDarkTheme = ((GenericSdFlowIntentKey) INSTANCE.getExtras((Activity) this)).getForceDarkTheme();
        return forceDarkTheme != null ? forceDarkTheme.booleanValue() : super.getForceDarkTheme();
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public String getEntryPointIdentifier() {
        return ((GenericSdFlowIntentKey) INSTANCE.getExtras((Activity) this)).getEntryPointIdentifier();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return ((GenericSdFlowIntentKey) INSTANCE.getExtras((Activity) this)).getRequiresAuthentication();
    }

    /* compiled from: GenericSdFlowActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/generic/GenericSdFlowActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/onboarding/ui/generic/GenericSdFlowActivity;", "Lcom/robinhood/android/onboarding/contracts/GenericSdFlowIntentKey;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<GenericSdFlowActivity, GenericSdFlowIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public GenericSdFlowIntentKey getExtras(GenericSdFlowActivity genericSdFlowActivity) {
            return (GenericSdFlowIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, genericSdFlowActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, GenericSdFlowIntentKey genericSdFlowIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, genericSdFlowIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, GenericSdFlowIntentKey genericSdFlowIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, genericSdFlowIntentKey);
        }
    }
}
