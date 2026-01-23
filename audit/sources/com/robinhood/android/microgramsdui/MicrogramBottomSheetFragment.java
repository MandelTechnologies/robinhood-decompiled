package com.robinhood.android.microgramsdui;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.common.contracts.MicrogramBottomSheetFragmentKey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrogramBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/MicrogramBottomSheetFragment;", "Lcom/robinhood/android/microgramsdui/BaseMicrogramBottomSheetFragment;", "<init>", "()V", "microgramManager", "Lcom/robinhood/android/microgramsdui/RealMicrogramManager;", "getMicrogramManager", "()Lcom/robinhood/android/microgramsdui/RealMicrogramManager;", "setMicrogramManager", "(Lcom/robinhood/android/microgramsdui/RealMicrogramManager;)V", "value", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "instance", "getInstance", "()Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "onAttach", "", "context", "Landroid/content/Context;", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "metadata", "", "getMetadata", "()Ljava/util/Map;", "loggingEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getLoggingEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "Companion", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MicrogramBottomSheetFragment extends BaseMicrogramBottomSheetFragment {
    private MicrogramManager2 instance;
    public MicrogramManager4 microgramManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final MicrogramManager4 getMicrogramManager() {
        MicrogramManager4 microgramManager4 = this.microgramManager;
        if (microgramManager4 != null) {
            return microgramManager4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("microgramManager");
        return null;
    }

    public final void setMicrogramManager(MicrogramManager4 microgramManager4) {
        Intrinsics.checkNotNullParameter(microgramManager4, "<set-?>");
        this.microgramManager = microgramManager4;
    }

    @Override // com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment
    public MicrogramManager2 getInstance() {
        return this.instance;
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        MicrogramManager2 instanceOrNull = getMicrogramManager().getInstanceOrNull(((MicrogramBottomSheetFragmentKey) INSTANCE.getArgs((Fragment) this)).getId());
        if (instanceOrNull != null) {
            this.instance = instanceOrNull;
        } else {
            dismiss();
        }
    }

    @Override // com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment
    public String getIdentifier() {
        return ((MicrogramBottomSheetFragmentKey) INSTANCE.getArgs((Fragment) this)).getIdentifier();
    }

    @Override // com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment
    public Map<String, String> getMetadata() {
        return ((MicrogramBottomSheetFragmentKey) INSTANCE.getArgs((Fragment) this)).getMetadata();
    }

    @Override // com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment
    public com.robinhood.rosetta.eventlogging.Context getLoggingEventContext() {
        return ((MicrogramBottomSheetFragmentKey) INSTANCE.getArgs((Fragment) this)).getLoggingEventContext();
    }

    @Override // com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment
    public Screen getLoggingScreen() {
        return ((MicrogramBottomSheetFragmentKey) INSTANCE.getArgs((Fragment) this)).getLoggingScreen();
    }

    /* compiled from: MicrogramBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/MicrogramBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/microgramsdui/MicrogramBottomSheetFragment;", "Lcom/robinhood/shared/common/contracts/MicrogramBottomSheetFragmentKey;", "<init>", "()V", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<MicrogramBottomSheetFragment, MicrogramBottomSheetFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public MicrogramBottomSheetFragment createDialogFragment(MicrogramBottomSheetFragmentKey microgramBottomSheetFragmentKey) {
            return (MicrogramBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, microgramBottomSheetFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public MicrogramBottomSheetFragmentKey getArgs(MicrogramBottomSheetFragment microgramBottomSheetFragment) {
            return (MicrogramBottomSheetFragmentKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, microgramBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MicrogramBottomSheetFragment newInstance(MicrogramBottomSheetFragmentKey microgramBottomSheetFragmentKey) {
            return (MicrogramBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, microgramBottomSheetFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MicrogramBottomSheetFragment microgramBottomSheetFragment, MicrogramBottomSheetFragmentKey microgramBottomSheetFragmentKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, microgramBottomSheetFragment, microgramBottomSheetFragmentKey);
        }
    }
}
