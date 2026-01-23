package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.utils.resource.StringResource;
import defpackage.TransferAccountListConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryFirstDepositTransferComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: ComposableSingletons$AdvisoryFirstDepositTransferComposableKt$lambda$-798090572$1 */
/* loaded from: classes7.dex */
final class C0053xb341420f implements Function2<Composer, Integer, Unit> {
    public static final C0053xb341420f INSTANCE = new C0053xb341420f();

    C0053xb341420f() {
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
            ComposerKt.traceEventStart(-798090572, i, -1, "ComposableSingletons$AdvisoryFirstDepositTransferComposableKt.lambda$-798090572.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:625)");
        }
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf();
        TransferAccountListConfig.Default r5 = TransferAccountListConfig.Default.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: ComposableSingletons$AdvisoryFirstDepositTransferComposableKt$lambda$-798090572$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C0053xb341420f.invoke$lambda$1$lambda$0((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AdvisoryFirstDepositTransferComposableKt.TransferAccountList(immutableList3PersistentListOf, "", r5, (Function1) objRememberedValue, composer, StringResource.$stable | 3510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
