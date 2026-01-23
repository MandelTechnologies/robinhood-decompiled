package com.robinhood.shared.microgram.common.services;

import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.i18n.LocalityDto;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RealUserLocaleService.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"toLocalityDto", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "lib-common-services_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.microgram.common.services.RealUserLocaleServiceKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class RealUserLocaleService2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalityDto toLocalityDto(CountryCode.Supported supported) {
        for (LocalityDto localityDto : LocalityDto.getEntries()) {
            if (Intrinsics.areEqual(supported.getIso3166CountryCode(), localityDto.getJson_value())) {
                return localityDto;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
