package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_e_uasakb_MahasiswaModelRealmProxy extends com.e.uasakb.MahasiswaModel
    implements RealmObjectProxy, com_e_uasakb_MahasiswaModelRealmProxyInterface {

    static final class MahasiswaModelColumnInfo extends ColumnInfo {
        long idIndex;
        long nimIndex;
        long namaIndex;
        long kelasIndex;
        long teleponIndex;
        long emailIndex;
        long lineIndex;
        long instagramIndex;

        MahasiswaModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("MahasiswaModel");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nimIndex = addColumnDetails("nim", "nim", objectSchemaInfo);
            this.namaIndex = addColumnDetails("nama", "nama", objectSchemaInfo);
            this.kelasIndex = addColumnDetails("kelas", "kelas", objectSchemaInfo);
            this.teleponIndex = addColumnDetails("telepon", "telepon", objectSchemaInfo);
            this.emailIndex = addColumnDetails("email", "email", objectSchemaInfo);
            this.lineIndex = addColumnDetails("line", "line", objectSchemaInfo);
            this.instagramIndex = addColumnDetails("instagram", "instagram", objectSchemaInfo);
        }

        MahasiswaModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MahasiswaModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MahasiswaModelColumnInfo src = (MahasiswaModelColumnInfo) rawSrc;
            final MahasiswaModelColumnInfo dst = (MahasiswaModelColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.nimIndex = src.nimIndex;
            dst.namaIndex = src.namaIndex;
            dst.kelasIndex = src.kelasIndex;
            dst.teleponIndex = src.teleponIndex;
            dst.emailIndex = src.emailIndex;
            dst.lineIndex = src.lineIndex;
            dst.instagramIndex = src.instagramIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MahasiswaModelColumnInfo columnInfo;
    private ProxyState<com.e.uasakb.MahasiswaModel> proxyState;

    com_e_uasakb_MahasiswaModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MahasiswaModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.e.uasakb.MahasiswaModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.idIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(Integer value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$nim() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.nimIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.nimIndex);
    }

    @Override
    public void realmSet$nim(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nimIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.nimIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nimIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.nimIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nama() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namaIndex);
    }

    @Override
    public void realmSet$nama(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namaIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.namaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namaIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kelas() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kelasIndex);
    }

    @Override
    public void realmSet$kelas(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kelasIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.kelasIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kelasIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kelasIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$telepon() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.teleponIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.teleponIndex);
    }

    @Override
    public void realmSet$telepon(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.teleponIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.teleponIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.teleponIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.teleponIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$email() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emailIndex);
    }

    @Override
    public void realmSet$email(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.emailIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.emailIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.emailIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.emailIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$line() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lineIndex);
    }

    @Override
    public void realmSet$line(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lineIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lineIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lineIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lineIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$instagram() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.instagramIndex);
    }

    @Override
    public void realmSet$instagram(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.instagramIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.instagramIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.instagramIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.instagramIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("MahasiswaModel", 8, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nim", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nama", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kelas", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("telepon", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("line", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("instagram", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MahasiswaModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MahasiswaModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "MahasiswaModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "MahasiswaModel";
    }

    @SuppressWarnings("cast")
    public static com.e.uasakb.MahasiswaModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.e.uasakb.MahasiswaModel obj = null;
        if (update) {
            Table table = realm.getTable(com.e.uasakb.MahasiswaModel.class);
            MahasiswaModelColumnInfo columnInfo = (MahasiswaModelColumnInfo) realm.getSchema().getColumnInfo(com.e.uasakb.MahasiswaModel.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("id")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.e.uasakb.MahasiswaModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_e_uasakb_MahasiswaModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_e_uasakb_MahasiswaModelRealmProxy) realm.createObjectInternal(com.e.uasakb.MahasiswaModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_e_uasakb_MahasiswaModelRealmProxy) realm.createObjectInternal(com.e.uasakb.MahasiswaModel.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_e_uasakb_MahasiswaModelRealmProxyInterface objProxy = (com_e_uasakb_MahasiswaModelRealmProxyInterface) obj;
        if (json.has("nim")) {
            if (json.isNull("nim")) {
                objProxy.realmSet$nim(null);
            } else {
                objProxy.realmSet$nim((int) json.getInt("nim"));
            }
        }
        if (json.has("nama")) {
            if (json.isNull("nama")) {
                objProxy.realmSet$nama(null);
            } else {
                objProxy.realmSet$nama((String) json.getString("nama"));
            }
        }
        if (json.has("kelas")) {
            if (json.isNull("kelas")) {
                objProxy.realmSet$kelas(null);
            } else {
                objProxy.realmSet$kelas((String) json.getString("kelas"));
            }
        }
        if (json.has("telepon")) {
            if (json.isNull("telepon")) {
                objProxy.realmSet$telepon(null);
            } else {
                objProxy.realmSet$telepon((int) json.getInt("telepon"));
            }
        }
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        if (json.has("line")) {
            if (json.isNull("line")) {
                objProxy.realmSet$line(null);
            } else {
                objProxy.realmSet$line((String) json.getString("line"));
            }
        }
        if (json.has("instagram")) {
            if (json.isNull("instagram")) {
                objProxy.realmSet$instagram(null);
            } else {
                objProxy.realmSet$instagram((String) json.getString("instagram"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.e.uasakb.MahasiswaModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.e.uasakb.MahasiswaModel obj = new com.e.uasakb.MahasiswaModel();
        final com_e_uasakb_MahasiswaModelRealmProxyInterface objProxy = (com_e_uasakb_MahasiswaModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("nim")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nim((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nim(null);
                }
            } else if (name.equals("nama")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nama((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nama(null);
                }
            } else if (name.equals("kelas")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kelas((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kelas(null);
                }
            } else if (name.equals("telepon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$telepon((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$telepon(null);
                }
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else if (name.equals("line")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$line((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$line(null);
                }
            } else if (name.equals("instagram")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$instagram((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$instagram(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.e.uasakb.MahasiswaModel copyOrUpdate(Realm realm, com.e.uasakb.MahasiswaModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.e.uasakb.MahasiswaModel) cachedRealmObject;
        }

        com.e.uasakb.MahasiswaModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.e.uasakb.MahasiswaModel.class);
            MahasiswaModelColumnInfo columnInfo = (MahasiswaModelColumnInfo) realm.getSchema().getColumnInfo(com.e.uasakb.MahasiswaModel.class);
            long pkColumnIndex = columnInfo.idIndex;
            Number value = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, value.longValue());
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.e.uasakb.MahasiswaModel.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_e_uasakb_MahasiswaModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.e.uasakb.MahasiswaModel copy(Realm realm, com.e.uasakb.MahasiswaModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.e.uasakb.MahasiswaModel) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.e.uasakb.MahasiswaModel realmObject = realm.createObjectInternal(com.e.uasakb.MahasiswaModel.class, ((com_e_uasakb_MahasiswaModelRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_e_uasakb_MahasiswaModelRealmProxyInterface realmObjectSource = (com_e_uasakb_MahasiswaModelRealmProxyInterface) newObject;
        com_e_uasakb_MahasiswaModelRealmProxyInterface realmObjectCopy = (com_e_uasakb_MahasiswaModelRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$nim(realmObjectSource.realmGet$nim());
        realmObjectCopy.realmSet$nama(realmObjectSource.realmGet$nama());
        realmObjectCopy.realmSet$kelas(realmObjectSource.realmGet$kelas());
        realmObjectCopy.realmSet$telepon(realmObjectSource.realmGet$telepon());
        realmObjectCopy.realmSet$email(realmObjectSource.realmGet$email());
        realmObjectCopy.realmSet$line(realmObjectSource.realmGet$line());
        realmObjectCopy.realmSet$instagram(realmObjectSource.realmGet$instagram());
        return realmObject;
    }

    public static long insert(Realm realm, com.e.uasakb.MahasiswaModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.e.uasakb.MahasiswaModel.class);
        long tableNativePtr = table.getNativePtr();
        MahasiswaModelColumnInfo columnInfo = (MahasiswaModelColumnInfo) realm.getSchema().getColumnInfo(com.e.uasakb.MahasiswaModel.class);
        long pkColumnIndex = columnInfo.idIndex;
        Object primaryKeyValue = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Number realmGet$nim = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$nim();
        if (realmGet$nim != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim.longValue(), false);
        }
        String realmGet$nama = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$nama();
        if (realmGet$nama != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaIndex, rowIndex, realmGet$nama, false);
        }
        String realmGet$kelas = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$kelas();
        if (realmGet$kelas != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kelasIndex, rowIndex, realmGet$kelas, false);
        }
        Number realmGet$telepon = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$telepon();
        if (realmGet$telepon != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.teleponIndex, rowIndex, realmGet$telepon.longValue(), false);
        }
        String realmGet$email = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        }
        String realmGet$line = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$line();
        if (realmGet$line != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lineIndex, rowIndex, realmGet$line, false);
        }
        String realmGet$instagram = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$instagram();
        if (realmGet$instagram != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.instagramIndex, rowIndex, realmGet$instagram, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.e.uasakb.MahasiswaModel.class);
        long tableNativePtr = table.getNativePtr();
        MahasiswaModelColumnInfo columnInfo = (MahasiswaModelColumnInfo) realm.getSchema().getColumnInfo(com.e.uasakb.MahasiswaModel.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.e.uasakb.MahasiswaModel object = null;
        while (objects.hasNext()) {
            object = (com.e.uasakb.MahasiswaModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Number realmGet$nim = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$nim();
            if (realmGet$nim != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim.longValue(), false);
            }
            String realmGet$nama = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$nama();
            if (realmGet$nama != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaIndex, rowIndex, realmGet$nama, false);
            }
            String realmGet$kelas = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$kelas();
            if (realmGet$kelas != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kelasIndex, rowIndex, realmGet$kelas, false);
            }
            Number realmGet$telepon = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$telepon();
            if (realmGet$telepon != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.teleponIndex, rowIndex, realmGet$telepon.longValue(), false);
            }
            String realmGet$email = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            }
            String realmGet$line = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$line();
            if (realmGet$line != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lineIndex, rowIndex, realmGet$line, false);
            }
            String realmGet$instagram = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$instagram();
            if (realmGet$instagram != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.instagramIndex, rowIndex, realmGet$instagram, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.e.uasakb.MahasiswaModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.e.uasakb.MahasiswaModel.class);
        long tableNativePtr = table.getNativePtr();
        MahasiswaModelColumnInfo columnInfo = (MahasiswaModelColumnInfo) realm.getSchema().getColumnInfo(com.e.uasakb.MahasiswaModel.class);
        long pkColumnIndex = columnInfo.idIndex;
        Object primaryKeyValue = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        Number realmGet$nim = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$nim();
        if (realmGet$nim != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nimIndex, rowIndex, false);
        }
        String realmGet$nama = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$nama();
        if (realmGet$nama != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaIndex, rowIndex, realmGet$nama, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namaIndex, rowIndex, false);
        }
        String realmGet$kelas = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$kelas();
        if (realmGet$kelas != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kelasIndex, rowIndex, realmGet$kelas, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kelasIndex, rowIndex, false);
        }
        Number realmGet$telepon = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$telepon();
        if (realmGet$telepon != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.teleponIndex, rowIndex, realmGet$telepon.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.teleponIndex, rowIndex, false);
        }
        String realmGet$email = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
        }
        String realmGet$line = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$line();
        if (realmGet$line != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lineIndex, rowIndex, realmGet$line, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lineIndex, rowIndex, false);
        }
        String realmGet$instagram = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$instagram();
        if (realmGet$instagram != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.instagramIndex, rowIndex, realmGet$instagram, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.instagramIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.e.uasakb.MahasiswaModel.class);
        long tableNativePtr = table.getNativePtr();
        MahasiswaModelColumnInfo columnInfo = (MahasiswaModelColumnInfo) realm.getSchema().getColumnInfo(com.e.uasakb.MahasiswaModel.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.e.uasakb.MahasiswaModel object = null;
        while (objects.hasNext()) {
            object = (com.e.uasakb.MahasiswaModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            Object primaryKeyValue = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            Number realmGet$nim = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$nim();
            if (realmGet$nim != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.nimIndex, rowIndex, realmGet$nim.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nimIndex, rowIndex, false);
            }
            String realmGet$nama = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$nama();
            if (realmGet$nama != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaIndex, rowIndex, realmGet$nama, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namaIndex, rowIndex, false);
            }
            String realmGet$kelas = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$kelas();
            if (realmGet$kelas != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kelasIndex, rowIndex, realmGet$kelas, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kelasIndex, rowIndex, false);
            }
            Number realmGet$telepon = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$telepon();
            if (realmGet$telepon != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.teleponIndex, rowIndex, realmGet$telepon.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.teleponIndex, rowIndex, false);
            }
            String realmGet$email = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
            }
            String realmGet$line = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$line();
            if (realmGet$line != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lineIndex, rowIndex, realmGet$line, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lineIndex, rowIndex, false);
            }
            String realmGet$instagram = ((com_e_uasakb_MahasiswaModelRealmProxyInterface) object).realmGet$instagram();
            if (realmGet$instagram != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.instagramIndex, rowIndex, realmGet$instagram, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.instagramIndex, rowIndex, false);
            }
        }
    }

    public static com.e.uasakb.MahasiswaModel createDetachedCopy(com.e.uasakb.MahasiswaModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.e.uasakb.MahasiswaModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.e.uasakb.MahasiswaModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.e.uasakb.MahasiswaModel) cachedObject.object;
            }
            unmanagedObject = (com.e.uasakb.MahasiswaModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_e_uasakb_MahasiswaModelRealmProxyInterface unmanagedCopy = (com_e_uasakb_MahasiswaModelRealmProxyInterface) unmanagedObject;
        com_e_uasakb_MahasiswaModelRealmProxyInterface realmSource = (com_e_uasakb_MahasiswaModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$nim(realmSource.realmGet$nim());
        unmanagedCopy.realmSet$nama(realmSource.realmGet$nama());
        unmanagedCopy.realmSet$kelas(realmSource.realmGet$kelas());
        unmanagedCopy.realmSet$telepon(realmSource.realmGet$telepon());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());
        unmanagedCopy.realmSet$line(realmSource.realmGet$line());
        unmanagedCopy.realmSet$instagram(realmSource.realmGet$instagram());

        return unmanagedObject;
    }

    static com.e.uasakb.MahasiswaModel update(Realm realm, com.e.uasakb.MahasiswaModel realmObject, com.e.uasakb.MahasiswaModel newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_e_uasakb_MahasiswaModelRealmProxyInterface realmObjectTarget = (com_e_uasakb_MahasiswaModelRealmProxyInterface) realmObject;
        com_e_uasakb_MahasiswaModelRealmProxyInterface realmObjectSource = (com_e_uasakb_MahasiswaModelRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$nim(realmObjectSource.realmGet$nim());
        realmObjectTarget.realmSet$nama(realmObjectSource.realmGet$nama());
        realmObjectTarget.realmSet$kelas(realmObjectSource.realmGet$kelas());
        realmObjectTarget.realmSet$telepon(realmObjectSource.realmGet$telepon());
        realmObjectTarget.realmSet$email(realmObjectSource.realmGet$email());
        realmObjectTarget.realmSet$line(realmObjectSource.realmGet$line());
        realmObjectTarget.realmSet$instagram(realmObjectSource.realmGet$instagram());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("MahasiswaModel = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nim:");
        stringBuilder.append(realmGet$nim() != null ? realmGet$nim() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nama:");
        stringBuilder.append(realmGet$nama() != null ? realmGet$nama() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kelas:");
        stringBuilder.append(realmGet$kelas() != null ? realmGet$kelas() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{telepon:");
        stringBuilder.append(realmGet$telepon() != null ? realmGet$telepon() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email() != null ? realmGet$email() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{line:");
        stringBuilder.append(realmGet$line() != null ? realmGet$line() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{instagram:");
        stringBuilder.append(realmGet$instagram() != null ? realmGet$instagram() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_e_uasakb_MahasiswaModelRealmProxy aMahasiswaModel = (com_e_uasakb_MahasiswaModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMahasiswaModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMahasiswaModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMahasiswaModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
