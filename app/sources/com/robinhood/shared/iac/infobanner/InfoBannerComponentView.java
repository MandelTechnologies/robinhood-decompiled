package com.robinhood.shared.iac.infobanner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InfoBannerComponentView.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010%\u001a\u00020&H\u0017¢\u0006\u0002\u0010'J$\u0010(\u001a\u00020&2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R/\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/iac/infobanner/InfoBannerComponentView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "<set-?>", "", "accountNumber", "getAccountNumber", "()Ljava/lang/String;", "setAccountNumber", "(Ljava/lang/String;)V", "accountNumber$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/models/db/IacInfoBannerLocation;", "location", "getLocation", "()Lcom/robinhood/models/db/IacInfoBannerLocation;", "setLocation", "(Lcom/robinhood/models/db/IacInfoBannerLocation;)V", "location$delegate", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "getPaddingValues", "()Landroidx/compose/foundation/layout/PaddingValues;", "setPaddingValues", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "paddingValues$delegate", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "bind", "lib-iac-info-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class InfoBannerComponentView extends Hammer_InfoBannerComponentView {
    public static final int $stable = 8;

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final SnapshotState accountNumber;

    /* renamed from: location$delegate, reason: from kotlin metadata */
    private final SnapshotState location;
    public Navigator navigator;

    /* renamed from: paddingValues$delegate, reason: from kotlin metadata */
    private final SnapshotState paddingValues;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public InfoBannerComponentView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(InfoBannerComponentView infoBannerComponentView, int i, Composer composer, int i2) {
        infoBannerComponentView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(InfoBannerComponentView infoBannerComponentView, int i, Composer composer, int i2) {
        infoBannerComponentView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ InfoBannerComponentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InfoBannerComponentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.accountNumber = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.location = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.paddingValues = SnapshotState3.mutableStateOf$default(PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)), null, 2, null);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    public final void setAccountNumber(String str) {
        this.accountNumber.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IacInfoBannerLocation getLocation() {
        return (IacInfoBannerLocation) this.location.getValue();
    }

    public final void setLocation(IacInfoBannerLocation iacInfoBannerLocation) {
        this.location.setValue(iacInfoBannerLocation);
    }

    public final PaddingValues getPaddingValues() {
        return (PaddingValues) this.paddingValues.getValue();
    }

    public final void setPaddingValues(PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "<set-?>");
        this.paddingValues.setValue(paddingValues);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1188941606);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1188941606, i2, -1, "com.robinhood.shared.iac.infobanner.InfoBannerComponentView.Content (InfoBannerComponentView.kt:33)");
            }
            final IacInfoBannerLocation location = getLocation();
            if (location == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InfoBannerComponentView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(getNavigator()), ComposableLambda3.rememberComposableLambda(1631908838, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentView.Content.1
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
                        ComposerKt.traceEventStart(1631908838, i3, -1, "com.robinhood.shared.iac.infobanner.InfoBannerComponentView.Content.<anonymous> (InfoBannerComponentView.kt:38)");
                    }
                    InfoBannerComponent.InfoBannerComponent(InfoBannerComponentView.this.getAccountNumber(), location, PaddingKt.padding(Modifier.INSTANCE, InfoBannerComponentView.this.getPaddingValues()), null, null, null, null, null, null, null, null, null, null, composer2, 0, 0, 8184);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerComponentView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InfoBannerComponentView.Content$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ void bind$default(InfoBannerComponentView infoBannerComponentView, String str, IacInfoBannerLocation iacInfoBannerLocation, PaddingValues paddingValues, int i, Object obj) {
        if ((i & 4) != 0) {
            paddingValues = null;
        }
        infoBannerComponentView.bind(str, iacInfoBannerLocation, paddingValues);
    }

    public final void bind(String accountNumber, IacInfoBannerLocation location, PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(location, "location");
        setAccountNumber(accountNumber);
        setLocation(location);
        if (paddingValues != null) {
            setPaddingValues(paddingValues);
        }
    }
}
