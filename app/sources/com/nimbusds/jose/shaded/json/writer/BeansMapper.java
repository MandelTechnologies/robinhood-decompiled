package com.nimbusds.jose.shaded.json.writer;

import com.nimbusds.jose.shaded.asm.ConvertDate;
import java.util.Date;

/* loaded from: classes27.dex */
public abstract class BeansMapper<T> extends JsonReaderI<T> {
    public static JsonReaderI<Date> MAPPER_DATE = new ArraysMapper<Date>(null) { // from class: com.nimbusds.jose.shaded.json.writer.BeansMapper.1
        @Override // com.nimbusds.jose.shaded.json.writer.JsonReaderI
        public Date convert(Object obj) {
            return ConvertDate.convertToDate(obj);
        }
    };
}
