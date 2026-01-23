package com.withpersona.sdk2.inquiry.nfc;

import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.util.List;

/* loaded from: classes18.dex */
public final class ScanNfcWorker_Factory_Impl implements ScanNfcWorker.Factory {
    private final C50860ScanNfcWorker_Factory delegateFactory;

    ScanNfcWorker_Factory_Impl(C50860ScanNfcWorker_Factory c50860ScanNfcWorker_Factory) {
        this.delegateFactory = c50860ScanNfcWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker.Factory
    public ScanNfcWorker create(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends NfcDataGroupType> list, StepStyles.UiStepStyle uiStepStyle, Integer num) {
        return this.delegateFactory.get(str, mrzKey, passportNfcStrings, list, uiStepStyle, num);
    }

    public static Provider<ScanNfcWorker.Factory> createFactoryProvider(C50860ScanNfcWorker_Factory c50860ScanNfcWorker_Factory) {
        return InstanceFactory.create(new ScanNfcWorker_Factory_Impl(c50860ScanNfcWorker_Factory));
    }
}
