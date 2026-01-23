package com.robinhood.android.listsoptions.optionwatchlist.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.listsoptions.optionwatchlist.onboarding.OptionWatchlistOnboardingFragment;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContext;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.Activity;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionWatchlistOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/onboarding/OptionWatchlistOnboardingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "sourceType", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "getSourceType", "()Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "sourceType$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class OptionWatchlistOnboardingActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EVENT_SOURCE_TYPE_EXTRA = "EVENT_SOURCE_TYPE_EXTRA";

    /* renamed from: sourceType$delegate, reason: from kotlin metadata */
    private final Lazy sourceType;

    public OptionWatchlistOnboardingActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.sourceType = Activity.intentExtra(this, EVENT_SOURCE_TYPE_EXTRA);
    }

    private final OptionWatchlistAboutContext.SourceType getSourceType() {
        return (OptionWatchlistAboutContext.SourceType) this.sourceType.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().getDecorView().setSystemUiVisibility(1280);
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.DAY, null, 2, null);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, OptionWatchlistOnboardingFragment.INSTANCE.newInstance((Parcelable) new OptionWatchlistOnboardingFragment.Args(getSourceType())));
        }
    }

    /* compiled from: OptionWatchlistOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/onboarding/OptionWatchlistOnboardingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$OptionsWatchlistOnboarding;", "<init>", "()V", OptionWatchlistOnboardingActivity.EVENT_SOURCE_TYPE_EXTRA, "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.OptionsWatchlistOnboarding> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.OptionsWatchlistOnboarding key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) OptionWatchlistOnboardingActivity.class);
            intent.putExtra(OptionWatchlistOnboardingActivity.EVENT_SOURCE_TYPE_EXTRA, key.getEventSourceType());
            return intent;
        }
    }
}
