package com.robinhood.android.challenge;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.challenge.EmailSmsChallengeFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.models.api.Challenge;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.shared.lib.challenge.ChallengeResponseResult;
import com.robinhood.shared.security.contracts.ChallengeResponseIntentKey;
import com.robinhood.shared.security.contracts.ChallengeSource;
import com.robinhood.utils.extensions.Activity;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: ChallengeResponseActivity.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u001a\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u0006H\u0016J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\u0019¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/challenge/ChallengeResponseActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/challenge/EmailSmsChallengeFragment$Callbacks;", "<init>", "()V", "initialChallenge", "Lcom/robinhood/models/api/Challenge;", "getInitialChallenge", "()Lcom/robinhood/models/api/Challenge;", "initialChallenge$delegate", "Lkotlin/Lazy;", "source", "Lcom/robinhood/shared/security/contracts/ChallengeSource;", "getSource", "()Lcom/robinhood/shared/security/contracts/ChallengeSource;", "source$delegate", ChallengeResponseActivity.EXTRA_USERNAME, "", "getUsername", "()Ljava/lang/String;", "username$delegate", "<set-?>", "currentChallenge", "getCurrentChallenge", "setCurrentChallenge", "(Lcom/robinhood/models/api/Challenge;)V", "currentChallenge$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showUiForChallenge", "challenge", "initialLoad", "", "requiresAuthentication", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onChallengeReplaced", "newChallenge", "onChallengeSuccess", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeResponseActivity extends BaseActivity implements EmailSmsChallengeFragment.Callbacks {
    private static final String DIALOG_UNKNOWN = "unknown";
    private static final String EXTRA_CHALLENGE = "challenge";
    public static final String EXTRA_CHALLENGE_ID = "challengeId";
    private static final String EXTRA_SOURCE = "source";
    private static final String EXTRA_USERNAME = "username";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ChallengeResponseActivity.class, "currentChallenge", "getCurrentChallenge()Lcom/robinhood/models/api/Challenge;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: initialChallenge$delegate, reason: from kotlin metadata */
    private final Lazy initialChallenge = Activity.intentExtra(this, "challenge");

    /* renamed from: source$delegate, reason: from kotlin metadata */
    private final Lazy source = Activity.intentExtra(this, "source");

    /* renamed from: username$delegate, reason: from kotlin metadata */
    private final Lazy username = Activity.intentExtra(this, EXTRA_USERNAME);

    /* renamed from: currentChallenge$delegate, reason: from kotlin metadata */
    private final Interfaces3 currentChallenge = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[0]);

    /* compiled from: ChallengeResponseActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Challenge.Type.values().length];
            try {
                iArr[Challenge.Type.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Challenge.Type.SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Challenge.Type.AUTH_APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Challenge.Type.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Challenge.Type.PROMPTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Challenge.Type.BACKUP_CODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Challenge.Type.WEBAUTHN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Challenge getInitialChallenge() {
        return (Challenge) this.initialChallenge.getValue();
    }

    private final ChallengeSource getSource() {
        return (ChallengeSource) this.source.getValue();
    }

    private final String getUsername() {
        return (String) this.username.getValue();
    }

    private final Challenge getCurrentChallenge() {
        return (Challenge) this.currentChallenge.getValue(this, $$delegatedProperties[0]);
    }

    private final void setCurrentChallenge(Challenge challenge) {
        this.currentChallenge.setValue(this, $$delegatedProperties[0], challenge);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(3);
        Challenge currentChallenge = getCurrentChallenge();
        if (currentChallenge == null) {
            currentChallenge = getInitialChallenge();
        }
        showUiForChallenge(currentChallenge, savedInstanceState == null);
    }

    static /* synthetic */ void showUiForChallenge$default(ChallengeResponseActivity challengeResponseActivity, Challenge challenge, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        challengeResponseActivity.showUiForChallenge(challenge, z);
    }

    private final void showUiForChallenge(Challenge challenge, boolean initialLoad) {
        setCurrentChallenge(challenge);
        switch (WhenMappings.$EnumSwitchMapping$0[challenge.getType().ordinal()]) {
            case 1:
            case 2:
                if (findViewById(C11048R.id.fragment_container) == null) {
                    setTheme(C13997R.style.Theme_Robinhood_DesignSystem_TransparentToolbar);
                    setContentView(C11048R.layout.activity_fragment_container);
                    ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DirectionOverlay.POSITIVE, null, 2, null);
                }
                EmailSmsChallengeFragment emailSmsChallengeFragmentNewInstance = EmailSmsChallengeFragment.INSTANCE.newInstance(new EmailSmsChallengeFragment.Args(getUsername(), challenge, getSource()));
                if (initialLoad) {
                    setFragment(C11048R.id.fragment_container, emailSmsChallengeFragmentNewInstance);
                    return;
                } else {
                    replaceFragmentWithoutBackStack(emailSmsChallengeFragmentNewInstance);
                    return;
                }
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(this).setId(C10497R.id.dialog_id_challenge_response_unknown_challenge_type).setTitle(C39076R.string.challenge_response_dialog_unknown_title, new Object[0]).setMessage(C39076R.string.challenge_response_dialog_unknown_message, new Object[0]).setPositiveButton(C39076R.string.challenge_response_dialog_unknown_update, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "unknown", false, 4, null);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return getSource().getRequiresAuth();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.getToolbar().setNavigationIcon(ContextCompat.getDrawable(this, C20690R.drawable.ic_rds_close_24dp));
    }

    @Override // com.robinhood.android.challenge.EmailSmsChallengeFragment.Callbacks
    public void onChallengeReplaced(Challenge newChallenge) {
        Intrinsics.checkNotNullParameter(newChallenge, "newChallenge");
        showUiForChallenge$default(this, newChallenge, false, 2, null);
    }

    @Override // com.robinhood.android.challenge.EmailSmsChallengeFragment.Callbacks
    public void onChallengeSuccess(UUID challengeId) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        NavigationActivityResultContract3.finishWithResult$default(this, new ChallengeResponseResult(challengeId), 0, 2, null);
    }

    /* compiled from: ChallengeResponseActivity.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/challenge/ChallengeResponseActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/shared/security/contracts/ChallengeResponseIntentKey;", "<init>", "()V", "DIALOG_UNKNOWN", "", "EXTRA_USERNAME", "EXTRA_SOURCE", "EXTRA_CHALLENGE", "EXTRA_CHALLENGE_ID", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<ChallengeResponseIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, ChallengeResponseIntentKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) ChallengeResponseActivity.class);
            intent.putExtra(ChallengeResponseActivity.EXTRA_USERNAME, key.getUsername());
            intent.putExtra("source", key.getSource());
            intent.putExtra("challenge", key.getChallenge());
            return intent;
        }
    }
}
