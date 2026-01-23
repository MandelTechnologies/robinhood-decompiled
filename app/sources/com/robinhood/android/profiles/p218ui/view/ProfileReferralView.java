package com.robinhood.android.profiles.p218ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.profiles.p218ui.C25904R;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProfileReferralView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ProfileReferralView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", ResourceTypes.ATTRIBUTE, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/profiles/ui/view/ProfileReferralView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/profiles/ui/view/ProfileReferralView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/profiles/ui/view/ProfileReferralView$Callbacks;)V", "inviteContainer", "inviteIconContainer", "Lcom/robinhood/android/profiles/ui/view/InviteIconContainerView;", "inviteAmountTxt", "Landroid/widget/TextView;", "referralBtn", "Lcom/robinhood/android/designsystem/button/RdsButton;", "bind", "", "inviteCount", "", "isRhubarbMember", "", "Callbacks", "Companion", "feature-lib-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProfileReferralView extends ConstraintLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Callbacks callbacks;
    private final TextView inviteAmountTxt;
    private final ConstraintLayout inviteContainer;
    private final InviteIconContainerView inviteIconContainer;
    private final RdsButton referralBtn;

    /* compiled from: ProfileReferralView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ProfileReferralView$Callbacks;", "", "onReferralButtonClicked", "", "onPastInvitesClicked", "feature-lib-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPastInvitesClicked();

        void onReferralButtonClicked();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileReferralView(Context context, AttributeSet attr) {
        super(context, attr);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
        ViewGroups.inflate(this, C25904R.layout.merge_profile_referral_view, true);
        View viewFindViewById = findViewById(C25904R.id.profile_invite_content_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        this.inviteContainer = constraintLayout;
        View viewFindViewById2 = findViewById(C25904R.id.profile_invite_icon_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.inviteIconContainer = (InviteIconContainerView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C25904R.id.profile_invite_amount_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.inviteAmountTxt = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C25904R.id.profile_referral_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        RdsButton rdsButton = (RdsButton) viewFindViewById4;
        this.referralBtn = rdsButton;
        ViewsKt.setLoggingConfig(rdsButton, new AutoLoggingConfig(false, false, 2, null));
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.profiles.ui.view.ProfileReferralView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileReferralView.$r8$lambda$pqfnFxWtiZYxch719vbran2zJds();
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.profiles.ui.view.ProfileReferralView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileReferralView.$r8$lambda$S6ZY6gubiw4qqBpF_0DN30CerPw(this.f$0);
            }
        });
        ViewsKt.eventData$default(constraintLayout, false, new Function0() { // from class: com.robinhood.android.profiles.ui.view.ProfileReferralView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileReferralView.m17761$r8$lambda$Lo3NmKeNW1zytAneEuTvTzBLSg();
            }
        }, 1, null);
        OnClickListeners.onClick(constraintLayout, new Function0() { // from class: com.robinhood.android.profiles.ui.view.ProfileReferralView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileReferralView.$r8$lambda$jgqGZo9ZZuthirYOOVtELIPjNSM(this.f$0);
            }
        });
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public static UserInteractionEventDescriptor $r8$lambda$pqfnFxWtiZYxch719vbran2zJds() {
        return new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "earn_rewards", null, 4, null), null, 47, null);
    }

    public static Unit $r8$lambda$S6ZY6gubiw4qqBpF_0DN30CerPw(ProfileReferralView profileReferralView) {
        Callbacks callbacks = profileReferralView.callbacks;
        if (callbacks != null) {
            callbacks.onReferralButtonClicked();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Lo3NmKeNW1zytAneEuTvTz-BLSg, reason: not valid java name */
    public static UserInteractionEventDescriptor m17761$r8$lambda$Lo3NmKeNW1zytAneEuTvTzBLSg() {
        return new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "past_invites", null, 4, null), null, 47, null);
    }

    public static Unit $r8$lambda$jgqGZo9ZZuthirYOOVtELIPjNSM(ProfileReferralView profileReferralView) {
        Callbacks callbacks = profileReferralView.callbacks;
        if (callbacks != null) {
            callbacks.onPastInvitesClicked();
        }
        return Unit.INSTANCE;
    }

    public final void bind(int inviteCount, boolean isRhubarbMember) {
        if (isRhubarbMember) {
            this.referralBtn.setText(C25904R.string.profiles_referral_btn_rhubarb);
        }
        if (inviteCount == 0) {
            this.inviteContainer.setVisibility(8);
            return;
        }
        this.inviteContainer.setVisibility(0);
        this.inviteIconContainer.bind(inviteCount);
        if (inviteCount <= 0) {
            this.inviteAmountTxt.setVisibility(8);
        } else {
            this.inviteAmountTxt.setVisibility(0);
            this.inviteAmountTxt.setText(getContext().getResources().getQuantityString(C25904R.plurals.profiles_invite_amount, inviteCount, Integer.valueOf(inviteCount)));
        }
    }

    /* compiled from: ProfileReferralView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/ProfileReferralView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/profiles/ui/view/ProfileReferralView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ProfileReferralView> {
        private final /* synthetic */ Inflater<ProfileReferralView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ProfileReferralView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ProfileReferralView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C25904R.layout.include_profile_referral_view);
        }
    }
}
