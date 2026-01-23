package com.robinhood.android.newsfeed.breakingnews.p198ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.robinhood.android.newsfeed.models.breakingnews.api.ApiAssetType;
import com.robinhood.compose.app.GenericComposeView;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BreakingNewsCardView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010!\u001a\u00020\"2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0013J\r\u0010#\u001a\u00020\"H\u0017¢\u0006\u0002\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R/\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R/\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/breakingnews/ui/BreakingNewsCardView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/ViewModelStoreOwner;Landroid/util/AttributeSet;)V", "<set-?>", "", "accountNumber", "getAccountNumber", "()Ljava/lang/String;", "setAccountNumber", "(Ljava/lang/String;)V", "accountNumber$delegate", "Landroidx/compose/runtime/MutableState;", "Ljava/util/UUID;", "assetId", "getAssetId", "()Ljava/util/UUID;", "setAssetId", "(Ljava/util/UUID;)V", "assetId$delegate", "Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;", "assetType", "getAssetType", "()Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;", "setAssetType", "(Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;)V", "assetType$delegate", "bindEquity", "", "Content", "(Landroidx/compose/runtime/Composer;I)V", "lib-breakingnews-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class BreakingNewsCardView extends GenericComposeView {
    public static final int $stable = 8;

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final SnapshotState accountNumber;

    /* renamed from: assetId$delegate, reason: from kotlin metadata */
    private final SnapshotState assetId;

    /* renamed from: assetType$delegate, reason: from kotlin metadata */
    private final SnapshotState assetType;
    private final ViewModelStoreOwner viewModelStoreOwner;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(BreakingNewsCardView breakingNewsCardView, int i, Composer composer, int i2) {
        breakingNewsCardView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(BreakingNewsCardView breakingNewsCardView, int i, Composer composer, int i2) {
        breakingNewsCardView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$2(BreakingNewsCardView breakingNewsCardView, int i, Composer composer, int i2) {
        breakingNewsCardView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ BreakingNewsCardView(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewModelStoreOwner, (i & 4) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BreakingNewsCardView(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.viewModelStoreOwner = viewModelStoreOwner;
        this.accountNumber = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.assetId = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.assetType = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    private final void setAccountNumber(String str) {
        this.accountNumber.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final UUID getAssetId() {
        return (UUID) this.assetId.getValue();
    }

    private final void setAssetId(UUID uuid) {
        this.assetId.setValue(uuid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ApiAssetType getAssetType() {
        return (ApiAssetType) this.assetType.getValue();
    }

    private final void setAssetType(ApiAssetType apiAssetType) {
        this.assetType.setValue(apiAssetType);
    }

    public final void bindEquity(String accountNumber, UUID assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        setAccountNumber(accountNumber);
        setAssetId(assetId);
        setAssetType(ApiAssetType.EQUITY);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-615825770);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-615825770, i2, -1, "com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardView.Content (BreakingNewsCardView.kt:36)");
            }
            final UUID assetId = getAssetId();
            if (assetId == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BreakingNewsCardView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            final ApiAssetType assetType = getAssetType();
            if (assetType == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardView$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BreakingNewsCardView.Content$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            CompositionLocal3.CompositionLocalProvider(LocalViewModelStoreOwner.INSTANCE.provides(this.viewModelStoreOwner), ComposableLambda3.rememberComposableLambda(-547548714, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardView.Content.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-547548714, i3, -1, "com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardView.Content.<anonymous> (BreakingNewsCardView.kt:42)");
                    }
                    BreakingNewsCardWrapper3.BreakingNewsCardWrapper(assetId, this.getAccountNumber(), assetType, null, null, null, composer2, 0, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BreakingNewsCardView.Content$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
