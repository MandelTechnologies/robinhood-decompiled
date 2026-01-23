package com.robinhood.android.event.gamedetail.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GameDetailPrepacks.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailPrepacksKt$lambda$1970740065$1, reason: use source file name */
/* loaded from: classes3.dex */
final class GameDetailPrepacks2 implements Function2<Composer, Integer, Unit> {
    public static final GameDetailPrepacks2 INSTANCE = new GameDetailPrepacks2();

    GameDetailPrepacks2() {
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
            ComposerKt.traceEventStart(1970740065, i, -1, "com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailPrepacksKt.lambda$1970740065.<anonymous> (GameDetailPrepacks.kt:163)");
        }
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke("Combos");
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        ContractSide contractSide = ContractSide.CONTRACT_SIDE_YES;
        ContractElement contractElement = new ContractElement(uuidRandomUUID, "SF wins\nOver 44.5", contractSide, false);
        ContractGroup3 contractGroup3 = ContractGroup3.CONTRACT_COLUMN_TYPE_UNSPECIFIED;
        PrepackOptionState prepackOptionState = new PrepackOptionState(contractElement, contractGroup3, false, "10%");
        UUID uuidRandomUUID2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
        PrepacksState prepacksState = new PrepacksState(stringResourceInvoke, CollectionsKt.listOf((Object[]) new PrepackOptionState[]{prepackOptionState, new PrepackOptionState(new ContractElement(uuidRandomUUID2, "SF wins\nOver 44.5", contractSide, false), contractGroup3, true, "-100")}));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailPrepacksKt$lambda$1970740065$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GameDetailPrepacks2.invoke$lambda$1$lambda$0((ContractOptionData) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.ComposableSingletons$GameDetailPrepacksKt$lambda$1970740065$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GameDetailPrepacks2.invoke$lambda$3$lambda$2((ContractOptionData) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        GameDetailPrepacks3.GameDetailPrepacks(prepacksState, function1, (Function1) objRememberedValue2, null, composer, 432, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ContractOptionData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(ContractOptionData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
