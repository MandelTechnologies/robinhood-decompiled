package com.robinhood.shared.trade.crypto.p397ui.taxLots.extensions;

import cbc.service.p048v1.TermTypeDto;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.utils.resource.StringResource;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TermTypeDtos.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"lotTermsLabel", "Lcom/robinhood/utils/resource/StringResource;", "", "Lcbc/service/v1/TermTypeDto;", "getLotTermsLabel", "(Ljava/util/List;)Lcom/robinhood/utils/resource/StringResource;", "displayString", "getDisplayString", "(Lcbc/service/v1/TermTypeDto;)Lcom/robinhood/utils/resource/StringResource;", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.extensions.TermTypeDtosKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TermTypeDtos2 {

    /* compiled from: TermTypeDtos.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.extensions.TermTypeDtosKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TermTypeDto.values().length];
            try {
                iArr[TermTypeDto.TERM_TYPE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TermTypeDto.TERM_TYPE_LT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TermTypeDto.TERM_TYPE_ST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getLotTermsLabel(List<? extends TermTypeDto> list) {
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
                                            return StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_mixed_term_lots_label, Integer.valueOf(list.size()));
                                        }
                                    }
                                }
                                return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C40095R.plurals.crypto_tax_lot_unknown_term_lots_label, list.size()), Integer.valueOf(list.size()));
                            }
                        }
                    }
                    return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C40095R.plurals.crypto_tax_lot_long_term_lots_label, list.size()), Integer.valueOf(list.size()));
                }
            }
        }
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C40095R.plurals.crypto_tax_lot_short_term_lots_label, list.size()), Integer.valueOf(list.size()));
    }

    public static final StringResource getDisplayString(TermTypeDto termTypeDto) {
        int i;
        Intrinsics.checkNotNullParameter(termTypeDto, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[termTypeDto.ordinal()];
        if (i2 == 1) {
            i = C40095R.string.crypto_tax_lot_selection_table_term_type_unknown_display_name;
        } else if (i2 == 2) {
            i = C40095R.string.crypto_tax_lot_selection_table_term_type_lt_display_name;
        } else if (i2 == 3) {
            i = C40095R.string.crypto_tax_lot_selection_table_term_type_st_display_name;
        } else {
            throw new IllegalStateException(("Unsupported termType " + termTypeDto).toString());
        }
        return companion.invoke(i, new Object[0]);
    }
}
