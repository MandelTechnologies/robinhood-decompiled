package com.robinhood.android.common.portfolio.instrument;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.os.Bundle2;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.portfolio.unified.DisplayType;
import com.robinhood.android.common.portfolio.unified.DisplayType2;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: InstrumentDisplayTypeBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\r\u0010\b\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/instrument/InstrumentDisplayTypeBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "onAttach", "", "context", "Landroid/content/Context;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InstrumentDisplayTypeBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {
    public static final String FRAGMENT_RESULT_KEY = "selectedDisplayType";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeBottomSheetDialogFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(InstrumentDisplayTypeBottomSheetFragment instrumentDisplayTypeBottomSheetFragment, int i, Composer composer, int i2) {
        instrumentDisplayTypeBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-171135487);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-171135487, i2, -1, "com.robinhood.android.common.portfolio.instrument.InstrumentDisplayTypeBottomSheetFragment.ComposeContent (InstrumentDisplayTypeBottomSheetFragment.kt:27)");
            }
            DisplayType displayType = DisplayType2.toDisplayType(((Args) INSTANCE.getArgs((Fragment) this)).getActiveDisplayType());
            ImmutableList3<DisplayType> defaultTypes = DisplayType.INSTANCE.getDefaultTypes();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(this));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentDisplayTypeBottomSheetFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InstrumentDisplayTypeBottomSheetFragment.ComposeContent$lambda$2$lambda$1(this.f$0, (DisplayType) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            InstrumentDisplayTypeComposable.InstrumentDisplayTypeComposable(displayType, defaultTypes, null, null, (Function1) objRememberedValue, composerStartRestartGroup, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.instrument.InstrumentDisplayTypeBottomSheetFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstrumentDisplayTypeBottomSheetFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(InstrumentDisplayTypeBottomSheetFragment instrumentDisplayTypeBottomSheetFragment, DisplayType displayType) {
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        instrumentDisplayTypeBottomSheetFragment.getParentFragmentManager().setFragmentResult(FRAGMENT_RESULT_KEY, Bundle2.bundleOf(Tuples4.m3642to(FRAGMENT_RESULT_KEY, DisplayType2.toInstrumentDisplayType(displayType))));
        instrumentDisplayTypeBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: InstrumentDisplayTypeBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/instrument/InstrumentDisplayTypeBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "activeDisplayType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;)V", "getActiveDisplayType", "()Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final InstrumentDisplayType activeDisplayType;

        /* compiled from: InstrumentDisplayTypeBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(InstrumentDisplayType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, InstrumentDisplayType instrumentDisplayType, int i, Object obj) {
            if ((i & 1) != 0) {
                instrumentDisplayType = args.activeDisplayType;
            }
            return args.copy(instrumentDisplayType);
        }

        /* renamed from: component1, reason: from getter */
        public final InstrumentDisplayType getActiveDisplayType() {
            return this.activeDisplayType;
        }

        public final Args copy(InstrumentDisplayType activeDisplayType) {
            Intrinsics.checkNotNullParameter(activeDisplayType, "activeDisplayType");
            return new Args(activeDisplayType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.activeDisplayType == ((Args) other).activeDisplayType;
        }

        public int hashCode() {
            return this.activeDisplayType.hashCode();
        }

        public String toString() {
            return "Args(activeDisplayType=" + this.activeDisplayType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.activeDisplayType.name());
        }

        public Args(InstrumentDisplayType activeDisplayType) {
            Intrinsics.checkNotNullParameter(activeDisplayType, "activeDisplayType");
            this.activeDisplayType = activeDisplayType;
        }

        public final InstrumentDisplayType getActiveDisplayType() {
            return this.activeDisplayType;
        }
    }

    /* compiled from: InstrumentDisplayTypeBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/instrument/InstrumentDisplayTypeBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/DialogFragmentWithArgsCompanion;", "Lcom/robinhood/android/common/portfolio/instrument/InstrumentDisplayTypeBottomSheetFragment;", "Lcom/robinhood/android/common/portfolio/instrument/InstrumentDisplayTypeBottomSheetFragment$Args;", "<init>", "()V", "FRAGMENT_RESULT_KEY", "", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentWithArgsCompanion<InstrumentDisplayTypeBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InstrumentDisplayTypeBottomSheetFragment instrumentDisplayTypeBottomSheetFragment) {
            return (Args) DialogFragmentWithArgsCompanion.DefaultImpls.getArgs(this, instrumentDisplayTypeBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion
        public InstrumentDisplayTypeBottomSheetFragment newInstance(Args args, int i) {
            return (InstrumentDisplayTypeBottomSheetFragment) DialogFragmentWithArgsCompanion.DefaultImpls.newInstance(this, args, i);
        }
    }
}
