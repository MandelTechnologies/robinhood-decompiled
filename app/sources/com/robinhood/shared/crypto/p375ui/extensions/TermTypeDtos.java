package com.robinhood.shared.crypto.p375ui.extensions;

import cbc.service.p048v1.TermTypeDto;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.utils.resource.StringResource;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TermTypeDtos.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"termsLabel", "Lcom/robinhood/utils/resource/StringResource;", "", "Lcbc/service/v1/TermTypeDto;", "getTermsLabel", "(Ljava/util/List;)Lcom/robinhood/utils/resource/StringResource;", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.extensions.TermTypeDtosKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TermTypeDtos {
    public static final StringResource getTermsLabel(List<? extends TermTypeDto> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<? extends TermTypeDto> list2 = list;
        boolean z = list2 instanceof Collection;
        if (!z || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((TermTypeDto) it.next()) != TermTypeDto.TERM_TYPE_ST) {
                    if (!z || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((TermTypeDto) it2.next()) != TermTypeDto.TERM_TYPE_LT) {
                                if (!z || !list2.isEmpty()) {
                                    Iterator<T> it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        if (((TermTypeDto) it3.next()) != TermTypeDto.TERM_TYPE_UNKNOWN) {
                                            return StringResource.INSTANCE.invoke(C38572R.string.crypto_tax_lot_mixed_term_label, Integer.valueOf(list.size()));
                                        }
                                    }
                                }
                                return StringResource.INSTANCE.invoke(C38572R.string.crypto_tax_lot_unknown_term_label, Integer.valueOf(list.size()));
                            }
                        }
                    }
                    return StringResource.INSTANCE.invoke(C38572R.string.crypto_tax_lot_long_term_label, Integer.valueOf(list.size()));
                }
            }
        }
        return StringResource.INSTANCE.invoke(C38572R.string.crypto_tax_lot_short_term_label, Integer.valueOf(list.size()));
    }
}
