import React from 'react';
import Header from '../../components/header';
import Footer from '../../components/footer';
import BotaoBranco from '../../components/botaoBranco';
import { View, Text, StyleSheet, ImageBackground, Image, ScrollView, TouchableOpacity } from 'react-native';

const cardViagem = ({ navigation }) => {
    return (
        <View style={styles.container}>
            <Header titulo={'Minhas Viagens'}/>
            <TouchableOpacity style={styles.conteudo} onPress={() => navigation.navigate('telaAddViagem')}>
                <Image source={require('../../../assets/images/telaAddDestino/icon-add.png')} style={{width: 70, height: 70}} />
                <Text style={styles.titulo}>Adicionar novo destino!</Text>
            </TouchableOpacity>
            <Footer />
        </View>
    );
};

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'space-between',
        alignItems: 'center',
        backgroundColor: 'white',
    },

    conteudo: {
        flex: 1,
        marginVertical: 40,
        width: '90%',
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#A9A9A9',
        borderRadius: 20,
    },

    titulo: {
        fontSize: 18,
        color: 'black',
        fontFamily: 'Outfit-VariableFont_wght',
        fontWeight: 'bold',
        textAlign: 'center',
        marginTop: 20,
    },
});

export default cardViagem;
