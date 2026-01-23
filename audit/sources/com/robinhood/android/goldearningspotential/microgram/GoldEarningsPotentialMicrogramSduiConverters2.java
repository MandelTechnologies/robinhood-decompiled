package com.robinhood.android.goldearningspotential.microgram;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsCalculatorAlertContent;
import com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsCalculatorDisclosureViewModel;
import com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsCalculatorViewModel;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import microgram.p507ui.sdui.SduiText;

/* compiled from: GoldEarningsPotentialMicrogramSduiConverters.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/goldearningspotential/microgram/RealGoldEarningsPotentialSduiConverters;", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsPotentialSduiConverters;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;Lkotlinx/serialization/json/Json;)V", "textJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/serverdriven/experimental/api/Text;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "convertText", "sduiText", "Lmicrogram/ui/sdui/SduiText;", "convertGoldEarningsPotentialCalculator", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorUiModel;", "calculator", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorViewModel;", "convertGoldEarningsPotentialDisclosure", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsDisclosureUiModel;", "disclosureViewModel", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorDisclosureViewModel;", "lib-gold-earnings-potential-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.goldearningspotential.microgram.RealGoldEarningsPotentialSduiConverters, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldEarningsPotentialMicrogramSduiConverters2 implements GoldEarningsPotentialMicrogramSduiConverters {
    public static final int $stable = 8;
    private final Json json;
    private final JsonAdapter<Text<GenericAction>> textJsonAdapter;

    public GoldEarningsPotentialMicrogramSduiConverters2(LazyMoshi moshi, Json json) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(json, "json");
        this.json = json;
        Types types = Types.INSTANCE;
        this.textJsonAdapter = moshi.adapter(new TypeToken<Text<? extends GenericAction>>() { // from class: com.robinhood.android.goldearningspotential.microgram.RealGoldEarningsPotentialSduiConverters$special$$inlined$getAdapter$1
        }.getType());
    }

    @Override // com.robinhood.android.goldearningspotential.microgram.GoldEarningsPotentialMicrogramSduiConverters
    public Text<GenericAction> convertText(SduiText sduiText) {
        Intrinsics.checkNotNullParameter(sduiText, "sduiText");
        JsonAdapter<Text<GenericAction>> jsonAdapter = this.textJsonAdapter;
        Json json = this.json;
        SerializersModule serializersModule = json.getSerializersModule();
        KType kTypeTypeOf = Reflection.typeOf(SduiText.class);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return jsonAdapter.fromJson(json.encodeToString(SerializersKt.serializer(serializersModule, kTypeTypeOf), sduiText));
    }

    @Override // com.robinhood.android.goldearningspotential.microgram.GoldEarningsPotentialMicrogramSduiConverters
    public GoldEarningsCalculatorUiModel convertGoldEarningsPotentialCalculator(GoldEarningsCalculatorViewModel calculator) {
        Intrinsics.checkNotNullParameter(calculator, "calculator");
        Text<GenericAction> textConvertText = convertText(calculator.getTitle());
        Text<GenericAction> textConvertText2 = convertText(calculator.getSubtitle());
        if (textConvertText == null || textConvertText2 == null) {
            return null;
        }
        return new GoldEarningsCalculatorUiModel(textConvertText, textConvertText2, calculator.getRemoteImageUrl());
    }

    @Override // com.robinhood.android.goldearningspotential.microgram.GoldEarningsPotentialMicrogramSduiConverters
    public GoldEarningsDisclosureUiModel convertGoldEarningsPotentialDisclosure(GoldEarningsCalculatorDisclosureViewModel disclosureViewModel) {
        Intrinsics.checkNotNullParameter(disclosureViewModel, "disclosureViewModel");
        Text<GenericAction> textConvertText = convertText(disclosureViewModel.getDisclosure());
        Text<GenericAction> textConvertText2 = convertText(disclosureViewModel.getTrailingTextButton());
        GoldEarningsCalculatorAlertContent alert = disclosureViewModel.getTrailingTextButtonAction().getAlert();
        GoldEarningsCalculatorAlertContentUiModel goldEarningsCalculatorAlertContentUiModel = new GoldEarningsCalculatorAlertContentUiModel(alert.getDismissLabel(), alert.getBodyMarkdown(), alert.getBodyComponents(), alert.getTitle());
        if (textConvertText == null || textConvertText2 == null) {
            return null;
        }
        return new GoldEarningsDisclosureUiModel(textConvertText, textConvertText2, goldEarningsCalculatorAlertContentUiModel);
    }
}
