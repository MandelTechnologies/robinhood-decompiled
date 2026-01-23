package com.robinhood.shared.crypto.transfer;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.shared.crypto.transfer.CryptoTransferConfigLoadingFragment;
import com.robinhood.shared.crypto.transfer.util.NavigationType;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferConfigLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\b\u001a\u00020\tH\u0017¢\u0006\u0002\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferConfigLoadingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTransferConfigLoadingFragment extends GenericComposeFragment {
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CryptoTransferConfigLoadingFragment cryptoTransferConfigLoadingFragment, int i, Composer composer, int i2) {
        cryptoTransferConfigLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1119585467);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1119585467, i2, -1, "com.robinhood.shared.crypto.transfer.CryptoTransferConfigLoadingFragment.ComposeContent (CryptoTransferConfigLoadingFragment.kt:27)");
            }
            ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), ComposableLambda3.rememberComposableLambda(984100479, true, new C379281(BaseContexts.requireActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), CryptoTransferConfigLoadingFragment2.INSTANCE.m24990getLambda$1276308726$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.CryptoTransferConfigLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferConfigLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CryptoTransferConfigLoadingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.CryptoTransferConfigLoadingFragment$ComposeContent$1 */
    static final class C379281 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AppCompatActivity $activity;

        /* compiled from: CryptoTransferConfigLoadingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.crypto.transfer.CryptoTransferConfigLoadingFragment$ComposeContent$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NavigationType.values().length];
                try {
                    iArr[NavigationType.PUSH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NavigationType.MODAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C379281(AppCompatActivity appCompatActivity) {
            this.$activity = appCompatActivity;
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
                ComposerKt.traceEventStart(984100479, i, -1, "com.robinhood.shared.crypto.transfer.CryptoTransferConfigLoadingFragment.ComposeContent.<anonymous> (CryptoTransferConfigLoadingFragment.kt:35)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[((Args) CryptoTransferConfigLoadingFragment.INSTANCE.getArgs((Fragment) CryptoTransferConfigLoadingFragment.this)).getNavigationType().ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(827758209);
                BentoAppBarScope bentoAppBarScope = BentoAppBarScope.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.$activity);
                final AppCompatActivity appCompatActivity = this.$activity;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.CryptoTransferConfigLoadingFragment$ComposeContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferConfigLoadingFragment.C379281.invoke$lambda$1$lambda$0(appCompatActivity);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                bentoAppBarScope.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, BentoAppBarScope.$stable << 12, 7);
                composer.endReplaceGroup();
            } else {
                if (i2 != 2) {
                    composer.startReplaceGroup(827756173);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(827763843);
                BentoAppBarScope bentoAppBarScope2 = BentoAppBarScope.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(this.$activity);
                final AppCompatActivity appCompatActivity2 = this.$activity;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.CryptoTransferConfigLoadingFragment$ComposeContent$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferConfigLoadingFragment.C379281.invoke$lambda$3$lambda$2(appCompatActivity2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                bentoAppBarScope2.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue2, composer, BentoAppBarScope.$stable << 12, 7);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(AppCompatActivity appCompatActivity) {
            appCompatActivity.getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(AppCompatActivity appCompatActivity) {
            appCompatActivity.getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoTransferConfigLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferConfigLoadingFragment$Args;", "Landroid/os/Parcelable;", "navigationType", "Lcom/robinhood/shared/crypto/transfer/util/NavigationType;", "<init>", "(Lcom/robinhood/shared/crypto/transfer/util/NavigationType;)V", "getNavigationType", "()Lcom/robinhood/shared/crypto/transfer/util/NavigationType;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final NavigationType navigationType;

        /* compiled from: CryptoTransferConfigLoadingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(NavigationType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.navigationType.name());
        }

        public Args(NavigationType navigationType) {
            Intrinsics.checkNotNullParameter(navigationType, "navigationType");
            this.navigationType = navigationType;
        }

        public final NavigationType getNavigationType() {
            return this.navigationType;
        }
    }

    /* compiled from: CryptoTransferConfigLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/CryptoTransferConfigLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferConfigLoadingFragment;", "Lcom/robinhood/shared/crypto/transfer/CryptoTransferConfigLoadingFragment$Args;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoTransferConfigLoadingFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoTransferConfigLoadingFragment cryptoTransferConfigLoadingFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoTransferConfigLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoTransferConfigLoadingFragment newInstance(Args args) {
            return (CryptoTransferConfigLoadingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoTransferConfigLoadingFragment cryptoTransferConfigLoadingFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoTransferConfigLoadingFragment, args);
        }
    }
}
