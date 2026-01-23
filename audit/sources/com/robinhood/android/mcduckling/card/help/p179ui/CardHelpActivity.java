package com.robinhood.android.mcduckling.card.help.p179ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.mcduckling.p084ui.callbacks.CardHelpCallbacks;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.extensions.Breadcrumbs2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbType;
import com.robinhood.android.mcduckling.card.help.C21627R;
import com.robinhood.android.mcduckling.card.help.p179ui.CardHelpInterstitialFragment;
import com.robinhood.android.mcduckling.card.help.p179ui.CardHelpIntroFragment;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.utils.extensions.Activity;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardHelpActivity.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001,B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016J\t\u0010%\u001a\u00020&H\u0096\u0001R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/mcduckling/ui/callbacks/CardHelpCallbacks;", "Lcom/robinhood/android/lib/breadcrumbs/AutomaticBreadcrumbProvider;", "<init>", "()V", CardHelpActivity.EXTRA_CARD_ID, "Ljava/util/UUID;", "getCardId", "()Ljava/util/UUID;", "cardId$delegate", "Lkotlin/Lazy;", CardHelpActivity.EXTRA_GENERIC_TOPIC_ID, "", "getGenericTopicId", "()Ljava/lang/String;", "genericTopicId$delegate", CardHelpActivity.EXTRA_LAUNCH_MODE, "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CardHelp$LaunchMode;", "getLaunchMode", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CardHelp$LaunchMode;", "launchMode$delegate", "breadcrumb", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "getBreadcrumb", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "proceed", "nextFragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CardHelpActivity extends BaseActivity implements RegionGated, CardHelpCallbacks, SupportBreadcrumbTracker2 {
    private static final String EXTRA_CARD_ID = "cardId";
    private static final String EXTRA_GENERIC_TOPIC_ID = "genericTopicId";
    private static final String EXTRA_LAUNCH_MODE = "launchMode";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: cardId$delegate, reason: from kotlin metadata */
    private final Lazy cardId;

    /* renamed from: genericTopicId$delegate, reason: from kotlin metadata */
    private final Lazy genericTopicId;

    /* renamed from: launchMode$delegate, reason: from kotlin metadata */
    private final Lazy launchMode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CardHelpActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegacyIntentKey.CardHelp.LaunchMode.values().length];
            try {
                iArr[LegacyIntentKey.CardHelp.LaunchMode.REPORT_DAMAGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyIntentKey.CardHelp.LaunchMode.REPORT_LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LegacyIntentKey.CardHelp.LaunchMode.REPORT_STOLEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LegacyIntentKey.CardHelp.LaunchMode.UNAUTHORIZED_TRANSACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public CardHelpActivity() {
        super(C21627R.layout.activity_card_help);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.cardId = Activity.intentExtra(this, EXTRA_CARD_ID);
        this.genericTopicId = Activity.intentExtra(this, EXTRA_GENERIC_TOPIC_ID);
        this.launchMode = Activity.intentExtra(this, EXTRA_LAUNCH_MODE);
    }

    private final UUID getCardId() {
        return (UUID) this.cardId.getValue();
    }

    private final String getGenericTopicId() {
        return (String) this.genericTopicId.getValue();
    }

    private final LegacyIntentKey.CardHelp.LaunchMode getLaunchMode() {
        return (LegacyIntentKey.CardHelp.LaunchMode) this.launchMode.getValue();
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2
    public SupportBreadcrumb getBreadcrumb() {
        return Breadcrumbs2.createBreadcrumb$default(this, SupportBreadcrumbType.CASH_DEBIT_REPORT_PROBLEM, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        BaseCardHelpFragment baseCardHelpFragment;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            LegacyIntentKey.CardHelp.LaunchMode launchMode = getLaunchMode();
            int i = launchMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[launchMode.ordinal()];
            if (i == -1) {
                baseCardHelpFragment = (BaseCardHelpFragment) CardHelpIntroFragment.INSTANCE.newInstance((Parcelable) new CardHelpIntroFragment.Args(getCardId(), getGenericTopicId()));
            } else if (i == 1) {
                baseCardHelpFragment = (BaseCardHelpFragment) CardHelpInterstitialFragment.INSTANCE.newInstance((Parcelable) new CardHelpInterstitialFragment.Args(getCardId(), CardReplacementType.DAMAGED));
            } else if (i == 2) {
                baseCardHelpFragment = (BaseCardHelpFragment) CardHelpInterstitialFragment.INSTANCE.newInstance((Parcelable) new CardHelpInterstitialFragment.Args(getCardId(), CardReplacementType.LOST));
            } else if (i == 3) {
                baseCardHelpFragment = (BaseCardHelpFragment) CardHelpInterstitialFragment.INSTANCE.newInstance((Parcelable) new CardHelpInterstitialFragment.Args(getCardId(), CardReplacementType.STOLEN));
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                baseCardHelpFragment = (BaseCardHelpFragment) CardHelpInterstitialFragment.INSTANCE.newInstance((Parcelable) new CardHelpInterstitialFragment.Args(getCardId(), CardReplacementType.UNAUTHORIZED_TRANSACTION));
            }
            setFragment(C21627R.id.fragment_container, baseCardHelpFragment);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.mcduckling.p084ui.callbacks.CardHelpCallbacks
    public void proceed(BaseFragment nextFragment) {
        Intrinsics.checkNotNullParameter(nextFragment, "nextFragment");
        replaceFragment(nextFragment);
    }

    /* compiled from: CardHelpActivity.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CardHelp;", "<init>", "()V", "EXTRA_CARD_ID", "", "EXTRA_LAUNCH_MODE", "EXTRA_GENERIC_TOPIC_ID", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.CardHelp> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.CardHelp key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) CardHelpActivity.class);
            intent.putExtra(CardHelpActivity.EXTRA_CARD_ID, key.getCardId());
            intent.putExtra(CardHelpActivity.EXTRA_LAUNCH_MODE, key.getLaunchMode());
            intent.putExtra(CardHelpActivity.EXTRA_GENERIC_TOPIC_ID, key.getGenericTopicId());
            return intent;
        }
    }
}
