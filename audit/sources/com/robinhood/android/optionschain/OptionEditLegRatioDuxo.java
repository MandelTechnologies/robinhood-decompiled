package com.robinhood.android.optionschain;

import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionEditLegRatioDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionEditLegRatioDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/optionschain/OptionEditLegRatioViewState;", "<init>", "()V", "setOptionOrderBundle", "", "bundle", "Lcom/robinhood/models/ui/OptionOrderBundle;", "updateLegRatio", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "newRatioString", "", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionEditLegRatioDuxo extends OldBaseDuxo<OptionEditLegRatioViewState> {
    public static final int EMPTY_RATIO_PLACEHOLDER = -1;
    public static final int $stable = OldBaseDuxo.$stable;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public OptionEditLegRatioDuxo() {
        Object[] objArr = 0 == true ? 1 : 0;
        super(new OptionEditLegRatioViewState(null, 1, 0 == true ? 1 : 0), objArr, 2, 0 == true ? 1 : 0);
    }

    public final void setOptionOrderBundle(final OptionOrderBundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionEditLegRatioDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionEditLegRatioDuxo.setOptionOrderBundle$lambda$1(bundle, (OptionEditLegRatioViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionEditLegRatioViewState setOptionOrderBundle$lambda$1(OptionOrderBundle optionOrderBundle, OptionEditLegRatioViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ImmutableList<OptionLegBundle> legBundles = optionOrderBundle.getLegBundles();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundles, 10));
        Iterator<OptionLegBundle> it = legBundles.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getRatio()));
        }
        return applyMutation.copy(arrayList);
    }

    public final void updateLegRatio(final int index, CharSequence newRatioString) {
        Intrinsics.checkNotNullParameter(newRatioString, "newRatioString");
        Integer intOrNull = StringsKt.toIntOrNull(newRatioString.toString());
        final int iIntValue = intOrNull != null ? intOrNull.intValue() : -1;
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionEditLegRatioDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionEditLegRatioDuxo.updateLegRatio$lambda$3(index, iIntValue, (OptionEditLegRatioViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionEditLegRatioViewState updateLegRatio$lambda$3(int i, int i2, OptionEditLegRatioViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        List<Integer> editedLegRatios = applyMutation.getEditedLegRatios();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(editedLegRatios, 10));
        int i3 = 0;
        for (Object obj : editedLegRatios) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (i3 == i) {
                iIntValue = i2;
            }
            arrayList.add(Integer.valueOf(iIntValue));
            i3 = i4;
        }
        return applyMutation.copy(arrayList);
    }
}
